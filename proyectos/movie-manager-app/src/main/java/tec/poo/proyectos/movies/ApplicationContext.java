package tec.poo.proyectos.movies;

import tec.poo.proyectos.movies.catalog.MovieCatalog;
import tec.poo.proyectos.movies.catalog.MovieCatalogImpl;
import tec.poo.proyectos.movies.repository.MovieRepository;
import tec.poo.proyectos.movies.repository.InMemoryMovieRepository;

public class ApplicationContext {
    private static final ApplicationContext instance = new ApplicationContext();

    private final MovieCatalog movieCatalog;

    private ApplicationContext() {
        this.movieCatalog = initMovieCatalog();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }

    private static MovieCatalog initMovieCatalog() {
        MovieRepository movieRepository = new InMemoryMovieRepository();
        return new MovieCatalogImpl(movieRepository);
    }

    public MovieCatalog getMovieCatalog() {
        return this.movieCatalog;
    }

}
