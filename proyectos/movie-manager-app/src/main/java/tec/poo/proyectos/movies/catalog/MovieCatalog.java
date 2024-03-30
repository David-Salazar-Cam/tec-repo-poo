package tec.poo.proyectos.movies.catalog;

import tec.poo.proyectos.movies.model.Movie;
import tec.poo.proyectos.movies.model.Movies;

public interface MovieCatalog {

    Movies getAllMovies();

    void addMovie(Movie movie);

    boolean hasMovie(String movieTitle);

    void rename(Movie movie, String newTitle);


}
