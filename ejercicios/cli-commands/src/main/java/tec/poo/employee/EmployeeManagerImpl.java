package tec.poo.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class EmployeeManagerImpl implements EmployeeManager {
    private List<Employee> employeeDataList;

    public EmployeeManagerImpl() {
        this.employeeDataList = new ArrayList<>();
    }

    public EmployeeManagerImpl(List<Employee> employees) {
        Objects.requireNonNull(employees, "Employee list is null");
        this.employeeDataList = employees;
    }

    @Override
    public Employee create(Employee employee) {
        Objects.requireNonNull(employee, "Employee is null");
        // Aqui podrían aplicarse otras validaciones respecto al formato del nombre, apellido por ejemplo
        // Employee podria validarse a sí mismo tambien por medio de un metodo validate(). Ej. employee.validate()
        // asi se le delega la lógica de la validación de las variables de instancia a él mismo.

        var newEmployee = Employee.newWithId(employee);
        this.employeeDataList.add(employee);
        return newEmployee;
    }

    @Override
    public void remove(UUID employeeId) {
        Objects.requireNonNull(employeeId, "Employee Id is null");

        var employeeInDataList = this.findById(employeeId);
        this.employeeDataList.remove(employeeInDataList);
    }

    @Override
    public Employee findById(UUID employeeId) {
        Objects.requireNonNull(employeeId, "Employee Id is null");
        return this.employeeDataList
                .stream()
                .filter(e -> e.getId().compareTo(employeeId) == 0)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeDataList;
    }

    @Override
    public Employee update(Employee employee) {
        Objects.requireNonNull(employee, "Employee is null");
        Objects.requireNonNull(employee.getId(), "Employee Id is null");
        Objects.requireNonNull(employee.getName(), "Employee Name is null");
        Objects.requireNonNull(employee.getLastName(), "Employee Last name is null");
        Objects.requireNonNull(employee.getEmployeeRole(), "Employee role is null");

        var employeeInDataList = this.findById(employee.getId());
        employeeInDataList.copy(employee);
        return employeeInDataList;
    }
}
