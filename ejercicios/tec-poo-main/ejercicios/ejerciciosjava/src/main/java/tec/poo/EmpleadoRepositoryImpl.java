package tec.poo;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    private Map<Integer, Empleado> empleadoDB = new HashMap<>();

    @Override
    public void registrarEmpleado(Empleado empleado) {
        // Aquí, estoy usando el ID del empleado como la clave en el mapa.
        // Asegúrate de que cada empleado tenga un ID único.
        empleadoDB.put(empleado.getId(), empleado);
    }

    @Override
    public Empleado obtenerEmpleadoPorId(int id) {
        return empleadoDB.get(id);
    }
}