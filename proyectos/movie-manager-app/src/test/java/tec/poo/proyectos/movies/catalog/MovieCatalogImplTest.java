package tec.poo.proyectos.movies.catalog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tec.poo.proyectos.movies.model.Movie;
import tec.poo.proyectos.movies.model.Movies;
import tec.poo.proyectos.movies.exception.DuplicateMovieException;
import tec.poo.proyectos.movies.repository.MovieRepository;

import java.util.Collections;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class MovieCatalogImplTest {

    @Mock
    private MovieRepository movieRepositoryMock;

    @InjectMocks
    private MovieCatalogImpl movieCatalogImpl;

    @BeforeEach
    public void setup() {

    }

    @Test
    public void givenNoMoviesInCatalog_whenGetAllMovies_thenEmptyResult() {
        // Arrange
        given(this.movieRepositoryMock.findAll()).willReturn(new Movies(Collections.emptyList()));

        // Act
        var actual = movieCatalogImpl.getAllMovies();

        // Assert
        verify(this.movieRepositoryMock, times(1)).findAll();

        assertThat(actual).isNotNull();
        assertThat(actual.isEmpty()).isTrue();
    }

    @Test
    public void givenNoMoviesInCatalog_whenAddMovieToCatalog_ThenOneItem() {
        // Arrange
        Movie movie = new Movie("Matrix");

        // Act
        movieCatalogImpl.addMovie(movie);

        // Assert
        verify(this.movieRepositoryMock, times(1)).save(movie);
    }

    @Test
    public void givenNoMoviesInCatalog_whenAddTwoMoviesToCatalog_ThenTwoItems() {
        // Arrange
        Movie matrix = new Movie("Matrix");
        Movie avengers = new Movie("Avengers");

        // Act
        movieCatalogImpl.addMovie(matrix);
        movieCatalogImpl.addMovie(avengers);

        // Assert
        verify(movieRepositoryMock, times(1)).save(matrix);
        verify(movieRepositoryMock, times(1)).save(avengers);
    }

    @Test
    public void givenDuplicateTitle_whenAddMoviesToCatalog_ThenException() {
        // Arrange
        Movie matrix = new Movie("Matrix");
        given(this.movieRepositoryMock.findByTitle("Matrix")).willReturn(Optional.of(matrix));

        // Act

        // Assert
        assertThatThrownBy(() -> {
            movieCatalogImpl.addMovie(matrix);
        }).isInstanceOf(DuplicateMovieException.class);

        verify(this.movieRepositoryMock, times(1)).findByTitle("Matrix");
    }

    @Test
    public void givenMovieExistsInCatalog_whenHasMovie_thenReturnTrue() {
        // Arrange
        Movie matrix = new Movie("Matrix");

        given(this.movieRepositoryMock.findByTitle("Matrix")).willReturn(Optional.of(matrix));

        // Act
        var actual = this.movieCatalogImpl.hasMovie("Matrix");

        // Assert
        verify(this.movieRepositoryMock, times(1)).findByTitle("Matrix");

        assertThat(actual).isTrue();
    }

    @Test
    public void givenMovieNotExistsInCatalog_whenHasMovie_thenReturnFalse() {
        // Arrange
        given(this.movieRepositoryMock.findByTitle("Matrix")).willReturn(Optional.empty());

        // Act
        var actual = this.movieCatalogImpl.hasMovie("Matrix");

        // Assert
        verify(this.movieRepositoryMock, times(1)).findByTitle("Matrix");

        assertThat(actual).isFalse();
    }

    @Test
    public void givenNewMovieTitle_whenRenameMovie_thenMovieHasNewTitle() {
        // Arrange
        Movie matrix = new Movie("Matrix");
        Movie movieUpdated = new Movie("theMatrix");

        given(this.movieRepositoryMock.findByTitle("The Matrix")).willReturn(Optional.empty());
        given(this.movieRepositoryMock.update(matrix)).willReturn(movieUpdated);

        // Act
        this.movieCatalogImpl.rename(matrix, "The Matrix");

        // Assert
        verify(this.movieRepositoryMock, times(1)).findByTitle("The Matrix");
        verify(this.movieRepositoryMock, times(1)).update(matrix);
    }

    @Test
    public void givenNullMovieTitle_whenRenameMovie_thenMovieHasSameTitle() {
        // Arrange
        Movie movie = new Movie("Matrix");

        // Act
        this.movieCatalogImpl.addMovie(movie);

        // Assert
        assertThatThrownBy(() -> {
            this.movieCatalogImpl.rename(movie, null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void givenEmptyMovieTitle_whenRenameMovie_thenMovieHasSameTitle() {
        // Arrange
        Movie matrix = new Movie("Matrix");

        // Act
        this.movieCatalogImpl.addMovie(matrix);

        assertThatThrownBy(() -> {
            this.movieCatalogImpl.rename(matrix, "");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void givenDuplicateTitle_whenRename_ThenException() {
        // Arrange
        Movie matrix = new Movie("Matrix");

        given(this.movieRepositoryMock.findByTitle("Matrix")).willReturn(Optional.of(matrix));

        // Act

        // Assert
        assertThatThrownBy(() -> {
            movieCatalogImpl.rename(matrix, "Matrix");
        }).isInstanceOf(DuplicateMovieException.class);

        verify(this.movieRepositoryMock, times(1)).findByTitle("Matrix");
        verifyNoMoreInteractions(this.movieRepositoryMock);
    }

}
