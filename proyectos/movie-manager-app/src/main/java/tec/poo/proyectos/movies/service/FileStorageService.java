package tec.poo.proyectos.movies.service;


public interface FileStorageService {

    public void saveTo(String location);
    public void loadFrom(String location);
}
