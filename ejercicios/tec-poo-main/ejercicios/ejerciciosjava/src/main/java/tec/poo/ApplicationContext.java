package tec.poo;

public class ApplicationContext {
    private EmpleadoRepository empleadoRepository;
    private RegistroEmpleados registroEmpleados;

    // Constructor
    public ApplicationContext() {
        // Inicializa las clases necesarias para el sistema
        this.empleadoRepository = new EmpleadoRepositoryImpl();
        this.registroEmpleados = new RegistroEmpleados(empleadoRepository);
    }

    // Getters
    public EmpleadoRepository getEmpleadoRepository() {
        return empleadoRepository;
    }

    public RegistroEmpleados getRegistroEmpleados() {
        return registroEmpleados;
    }
}