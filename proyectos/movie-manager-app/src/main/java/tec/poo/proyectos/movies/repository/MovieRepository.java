package tec.poo.proyectos.movies.repository;

import tec.poo.proyectos.movies.model.Movie;
import tec.poo.proyectos.movies.model.Movies;

import java.util.Optional;

public interface MovieRepository {

    Movies findAll();

    Optional<Movie> findByTitle(String name);

    void save(Movie movie);

    Movie update(Movie movie);

    Movie delete(String name);
}
