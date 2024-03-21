package tec.poo.ejercicios;

public class ApplicationContext {
    private ConexionBD connection;

    public ConexionBD getConnection() {
        return connection;
    }

    public ApplicationContext(){
        this.connection = ConexionBDSingleton.getInstance();

    }
}
