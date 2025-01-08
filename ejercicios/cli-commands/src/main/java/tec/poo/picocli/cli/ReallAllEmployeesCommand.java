package tec.poo.picocli.cli;

import picocli.CommandLine;
import tec.poo.picocli.view.EmployeeView;
import tec.poo.employee.EmployeeManagerImpl;

@CommandLine.Command(name = "employee:read-all", aliases = {"era"}, description = "Read all exployees")
public class ReallAllEmployeesCommand implements Runnable {

    @Override
    public void run() {
        var employeeManager = new EmployeeManagerImpl();
        var employees = employeeManager.findAll();
        EmployeeView.print(employees);
    }
}
