package tec.poo;

public class RegistroEmpleados {
    private EmpleadoRepository empleadoRepository;

    // Constructor
    public RegistroEmpleados(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    // Método para registrar un nuevo empleado
    public void registrarNuevoEmpleado(Empleado empleado) {
        empleadoRepository.registrarEmpleado(empleado);
    }

    // Método para mostrar los detalles de un empleado
    public void mostrarDetallesEmpleado(int id) {
        Empleado empleado = empleadoRepository.obtenerEmpleadoPorId(id);
        if (empleado != null) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("Cargo: " + empleado.getCargo());
        } else {
            System.out.println("No se encontró un empleado con el ID: " + id);
        }
    }
}