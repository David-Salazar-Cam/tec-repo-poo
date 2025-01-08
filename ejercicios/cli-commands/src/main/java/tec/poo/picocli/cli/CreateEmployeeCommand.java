package tec.poo.picocli.cli;

import picocli.CommandLine;

@CommandLine.Command(name = "employee:create", aliases = {"ec"}, description = "Create new employee")
public class CreateEmployeeCommand implements Runnable {

    @CommandLine.Parameters(paramLabel = "<employee name>", description = "Employee name")
    private String name;

    @CommandLine.Parameters(paramLabel = "<employee last name>", description = "Employee last name")
    private String lastName;
    @CommandLine.Parameters(paramLabel = "<role>", description = "Employee Role")
    private String role;

    @Override
    public void run() {

        System.out.println("You provided value ");

//        var employeeManager = new EmployeeManagerImpl();
//        var employeeRole = EmployeeRole.valueOf(role);
//        var employeeToBeCreated = new Employee(name, lastName, employeeRole);
//        employeeManager.create(employeeToBeCreated);
//        EmployeeView.print(employeeToBeCreated);

    }
}
