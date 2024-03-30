package tec.poo.proyectos.movies.catalog;

import tec.poo.proyectos.movies.common.validators.StringValidator;
import tec.poo.proyectos.movies.model.Movie;
import tec.poo.proyectos.movies.model.Movies;
import tec.poo.proyectos.movies.exception.DuplicateMovieException;
import tec.poo.proyectos.movies.repository.MovieRepository;

import java.util.Objects;

public class MovieCatalogImpl implements MovieCatalog {

    private final MovieRepository movieRepository;

    public MovieCatalogImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movies getAllMovies() {
        return this.movieRepository.findAll();
    }

    @Override
    public void addMovie(Movie movie) {
        Objects.requireNonNull(movie);

        if (this.hasMovie(movie.getTitle())) {
            throw new DuplicateMovieException("Movie with title '" + movie.getTitle() + "' already present in Catalog");
        }
        this.movieRepository.save(movie);
    }

    @Override
    public boolean hasMovie(String movieTitle) {
        if (movieTitle == null) {
            return false;
        }
        if (movieTitle.isBlank()) {
            return false;
        }

        var movie = this.movieRepository.findByTitle(movieTitle);
        return movie.isPresent();
    }

    @Override
    public void rename(Movie movie, String newTitle) {
        Objects.requireNonNull(movie);
        StringValidator.ThrowIfNullOrEmpty(newTitle);
        movie.setTitle(newTitle);

        if (this.hasMovie(newTitle)) {
            throw new DuplicateMovieException("Movie with title '" + newTitle + "' already present in Catalog");
        }

        this.movieRepository.update(movie);
    }
}
