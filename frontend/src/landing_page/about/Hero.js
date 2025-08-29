import React from "react";

function Hero() {
  return (
    <div className="container">
      <div className="row p-5 mt-5 mb-5">
        <h1 className="fs-2 text-center">
          We pioneered the discount broking model in India
          <br />
          Now, we are breaking ground with our technology.
        </h1>
      </div>

      <div
        className="row p-5 mt-5 border-top text-muted"
        style={{ lineHeight: "1.8", fontSize: "1.2em" }}
      >
        <div className="col-6 p-5">
        <p>
        We kick-started operations on the 5th of June, 2018 with the goal of
        breaking all barriers that urban fleets face in India in terms of
        inefficiency, cost, and technology. We named the company
        NeuroFleetX, a combination of "Neuro" for our AI-powered
        intelligence, "Fleet" for the vehicles we optimize, and "X" for the
        exponential efficiency we deliver.
      </p>
      <p>
        Today, our predictive AI models and proprietary routing technology
        have made us the leading platform for urban mobility optimization in
        India.
      </p>
      <p>
        Over 500+ partners rely on our intelligent ecosystem, optimizing
        millions of kilometers daily and contributing to a significant
        reduction in fuel consumption and delivery times across major
        metropolitan areas.
      </p>
    </div>
    <div className="col-6 p-5">
      <p>
        In addition, we run a number of open data initiatives and community
        programs to promote sustainable and smarter urban transport.
      </p>
      <p>
        <a href="" style={{ textDecoration: "none" }}>
          UrbanShift Ventures
        </a>
        , our mobility-focused fund and incubator, has invested in several
        smart city startups with the goal of building a more efficient and
        sustainable urban future.
      </p>
      <p>
        And yet, we are always innovating every day. Catch up on our latest
        advancements on our blog or see what the media is saying about us.
      </p>
        </div>
      </div>
    </div>
  );
}

export default Hero;
