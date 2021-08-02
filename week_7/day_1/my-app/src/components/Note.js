import React, { Component } from 'react';
import '../css/Note.css';
import PropTypes from 'prop-types';

class Note extends Component {
    constructor() {
        super();
    }

    render() {
        return (
            <div className="col-sm-6">
                <div className="card card-vew" L>
                    <div className="card-body">
                        <h5 className="card-title">{this.props.title}</h5>
                        <p>{this.props.body}</p>
                        <button className="btn btn-info">Edit</button>
                        <button className="btn btn-danger">Delete</button>
                    </div>
                </div>
            </div>
        )
    }
}

Note.defaultProps = {
    title: "here is a title",
    body: "here is a body",
}

Note.propTypes = {
    title: PropTypes.string
}

export default Note;