package tec.poo;
//Interfase de acceso a los metodos de empleado
public interface EmpleadoRepository {
void registrarEmpleado(Empleado empleado);
Empleado obtenerEmpleadoPorId(int id);
}
