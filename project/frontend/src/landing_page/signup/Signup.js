import React from "react";
import { Link } from "react-router-dom";

function Signup() {
  return (
    <div className="container" style={{ minHeight: "70vh" }}>
      <div className="row justify-content-center align-items-center h-100">
        <div className="col-md-6 col-lg-4">
          <div className="card p-4 mt-5">
            <h3 className="text-center mb-4">Create Account</h3>
            <form>
              <div className="mb-3">
                <label htmlFor="nameInput" className="form-label">
                  Full Name
                </label>
                <input
                  type="text"
                  className="form-control"
                  id="nameInput"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="emailInput" className="form-label">
                  Email address
                </label>
                <input
                  type="email"
                  className="form-control"
                  id="emailInput"
                />
              </div>
              <div className="mb-3">
                <label htmlFor="passwordInput" className="form-label">
                  Password
                </label>
                <input
                  type="password"
                  className="form-control"
                  id="passwordInput"
                />
              </div>
              <button type="submit" className="btn btn-primary w-100">
                Sign Up
              </button>
            </form>
            <p className="text-center mt-3">
              Already have an account? <Link to="/login">Login</Link>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Signup;