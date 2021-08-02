import React from "react";
import PropTypes from "prop-types";

const Movie = ({ title, description, year, genre }) => {
  return (
    <div>
      <h4>{title}</h4>
      <h4>{description}</h4>
      <h4>{year}</h4>
      <h4>{genre}</h4>
      <hr></hr>
    </div>
  );
};

export default Movie;

Movie.propTypes = {
  title: PropTypes.string,
};
