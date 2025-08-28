import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./index.css";

import Signup from "./landing_page/signup/Signup";
import HomePage from "./landing_page/home/HomePage";
import AboutPage from "./landing_page/about/AboutPage";
import SupportPage from "./landing_page/support/SupportPage";

import NotFound from "./landing_page/NotFound";
import Navbar from "./landing_page/Navbar";
import Footer from "./landing_page/Footer";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <Navbar />
    <Routes>
      <Route path="/" element={<HomePage />} ></Route>
      <Route path="/signup" element={<Signup />} ></Route>
      <Route path="/about" element={<AboutPage />} ></Route>
      <Route path="/support" element={<SupportPage />} ></Route>
      <Route path="*" element={<NotFound />} ></Route>
    </Routes>
    <Footer />
  </BrowserRouter>
);
