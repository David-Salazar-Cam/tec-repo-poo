package tec.poo.proyectos.movies.model;

import tec.poo.proyectos.movies.common.validators.StringValidator;

public class Movie {

    private String title;

    public Movie(String title) {
        StringValidator.ThrowIfNullOrEmpty(title);

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        StringValidator.ThrowIfNullOrEmpty(title);
        this.title = title;
    }
}
