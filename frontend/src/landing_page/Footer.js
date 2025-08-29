import React from "react";

function Footer() {
  return (
    <footer style={{ backgroundColor: "rgb(250, 250, 250)" }}>
      <div className="container border-top mt-5">
        <div className="row mt-5">
          <div className="col">
            <img src="media/images/logo.svg" style={{ width: "50%" }} />
            
          </div>
          <div className="col">
            <p>Company</p>
            <a style={{ textDecoration: "none" }} href="">About</a>
            <br />
            <br />
            <a style={{ textDecoration: "none" }} href="">Referral programme</a>
            <br />
            <a style={{ textDecoration: "none" }} href="">Careers</a>
            <br />
          
            <a style={{ textDecoration: "none" }} href="">Press & media</a>
            <br />
           
          </div>
          <div className="col">
            <p>Support</p>
            <a style={{ textDecoration: "none" }} href="">Contact</a>
            <br />
            <a style={{ textDecoration: "none" }} href="">Support portal</a>
            <br />
            <a style={{ textDecoration: "none" }} href="">List of charges</a>
            <br />
          </div>
          <div className="col">
            <p>Account</p>
            <a style={{ textDecoration: "none" }}  href="">Open an account</a>
            <br />
          </div>
        </div>
        <div className="mt-5 text-muted" style={{ fontSize: "14px" }}>
        </div>
      </div>
    </footer>
  );
}

export default Footer;
