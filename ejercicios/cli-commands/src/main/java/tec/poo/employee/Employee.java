package tec.poo.employee;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class Employee {

    private UUID id;
    private String name;
    private String lastName;
    private EmployeeRole employeeRole;

    public Employee(String name, String lastName, EmployeeRole employeeRole) {
        this(null, name, lastName, employeeRole);
    }

    public Employee(UUID id, String name, String lastName, EmployeeRole employeeRole) {
        Objects.requireNonNull(name, "Name is null");
        Objects.requireNonNull(lastName, "Last name is null");
        Objects.requireNonNull(employeeRole, "Employee Role is null");

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.employeeRole = employeeRole;
    }

    public static Employee newWithId(Employee employee) {
        Objects.requireNonNull(employee, "Employee is null");
        return new Employee(UUID.randomUUID(), employee.getName(), employee.getLastName(), employee.getEmployeeRole());
    }

    public boolean hasValidId() {
        return this.id != null;
    }

    public void copy(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.lastName = employee.getLastName();
        this.employeeRole = employee.getEmployeeRole();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        this.employeeRole = employeeRole;
    }
}
