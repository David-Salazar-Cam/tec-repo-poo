package tec.poo.ejercicios;

public interface ConexionBD {
    public void conectar();
    public void desconectar();
    public void ejecutarConsulta(String consulta);


}
