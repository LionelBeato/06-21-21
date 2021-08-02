import logo from './logo.svg';
import './App.css';
import Collection from './components/Collection';
import Movie from './components/Movie';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
      <Collection
        title="Movies about Stuff"
      >
        <Movie
          title="No Country for Old Men"
          description="a movie about stuff"
          year="2007"
          genre="thriller"
        />
        <Movie
          title="Fargo"
          description="a movie about stuff"
          year="1994"
          genre="thriller"
        />
        <Movie
          title="The Big Lebowski"
          description="a movie about stuff"
          year="1994"
          genre="film noir"
        />
        {/* <Movie
          title="23"
          description="a movie about stuff"
          year="1994"
          genre="film noir"
        /> */}
      </Collection>
    </div>
  );
}

export default App;
