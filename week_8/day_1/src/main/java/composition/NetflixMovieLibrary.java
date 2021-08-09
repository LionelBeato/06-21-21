package composition;

import java.util.List;

public class NetflixMovieLibrary {


    private final List<NetflixMovie> movies;

    public NetflixMovieLibrary(List<NetflixMovie> movies) {
        this.movies = movies;
    }

    public List<NetflixMovie> getMovies() {
        return movies;
    }


}
