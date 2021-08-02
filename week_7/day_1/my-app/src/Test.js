import React from 'react'

function Test() {


    const name = "Garfield"
    const element = <h2>This is JSX, here's a variable value: {name}</h2>

    return (
        <div>
            {element}
            <h1>5 plus 3 equals {5 + 3}</h1>
        </div>
    )

}

export default Test