package tec.poo.proyectos.movies.repository;

import tec.poo.proyectos.movies.model.Movie;
import tec.poo.proyectos.movies.model.Movies;

import java.util.Optional;

public class InMemoryMovieRepository implements MovieRepository {

    @Override
    public Movies findAll() {
        return null;
    }

    @Override
    public Optional<Movie> findByTitle(String name) {
        return Optional.empty();
    }

    @Override
    public void save(Movie movie) {

    }

    @Override
    public Movie update(Movie movie) {
        return null;
    }

    @Override
    public Movie delete(String name) {
        return null;
    }
}
