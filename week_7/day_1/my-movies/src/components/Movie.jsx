import React, { useState } from "react";
import PropTypes from "prop-types";

const Movie = ({ title, description, year, genre }) => {
  const [state, setState] = useState(0);

  const handleClick = () => {
    setState(state + 1);
  };

  return (
    <div>
      <h4>{title}</h4>
      <h4>{description}</h4>
      <h4>{year}</h4>
      <h4>{genre}</h4>
      <p>{state}</p>
      <button onClick={handleClick}>click me</button>
      <hr></hr>
    </div>
  );
};

export default Movie;

Movie.propTypes = {
  title: PropTypes.string,
};
