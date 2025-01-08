package tec.poo.proyectos.movies.model;

import java.util.List;
import java.util.Objects;

public class Movies {

    private List<Movie> movies;

    public Movies(List<Movie> movies) {
        Objects.requireNonNull(movies);

        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return this.movies;
    }

    public boolean isEmpty() {
        return this.movies.isEmpty();
    }

}
