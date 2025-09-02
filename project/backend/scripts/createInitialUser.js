require("dotenv").config();
const mongoose = require("mongoose");
const bcrypt = require("bcrypt");
const { UserModel } = require("../model/UserModel");

const uri = process.env.MONGO_URL;
const saltRounds = 10;

async function createInitialUser() {
  try {
    await mongoose.connect(uri);

    const existingUser = await UserModel.findOne({ email: "initialuser@example.com" });
    if (existingUser) {
      console.log("Initial user already exists.");
      process.exit(0);
    }

    const hashedPassword = await bcrypt.hash("password123", saltRounds);

    const newUser = new UserModel({
      fullName: "Initial User",
      email: "initialuser@example.com",
      password: hashedPassword,
    });

    await newUser.save();
    console.log("Initial user created successfully.");
    process.exit(0);
  } catch (error) {
    console.error("Error creating initial user:", error);
    process.exit(1);
  }
}

createInitialUser();
