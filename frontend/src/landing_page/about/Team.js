import React from "react";

function Team() {
  return (
    <div className="container">
      <div className="row p-3 mt-5 border-top">
        <h1 className="text-center ">Developer</h1>
      </div>

      <div
        className="row p-3 text-muted"
        style={{ lineHeight: "1.8", fontSize: "1.2em" }}
      >
        <div className="col-6 p-3 text-center">
          <img
            src="media/images/shahid.jpg"
            style={{ borderRadius: "100%", width: "50%" }}
          />
          <h4 className="mt-5">Shahid Metkari</h4>
          <h6></h6>
        </div>
        <div className="col-6 p-3">
          <div></div>
          <p>
            Connect on <a style={{ textDecoration: "none" }} href="https://www.linkedin.com/in/shahidmetkari/">linkedIn</a> 
          </p>
        </div>
      </div>
    </div>
  );
}

export default Team;
