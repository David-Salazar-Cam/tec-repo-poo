package tec.poo.employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeManager {

    /**
     * Crea un nuevo empleado
     * @param employee
     * @return El empleado creado. Con un Id valido
     */
    Employee create(Employee employee);

    /**
     * Remueve un usuario del sistema
     * @param employeeId Requerido
     */
    void remove(UUID employeeId);

    /**
     * Busca un empleado por su ID.
     * @param employeeId Requerido
     * @return El empleado o sino nulo
     */
    Employee findById(UUID employeeId);

    /**
     * Retorna todos los empleados del sistema
     * @return La lista de empleados
     */
    List<Employee> findAll();

    /**
     * Actualiza los datos de un empleado
     * @param employee Requerido
     * @return el empleado actualizado
     */
    Employee update(Employee employee);

}
