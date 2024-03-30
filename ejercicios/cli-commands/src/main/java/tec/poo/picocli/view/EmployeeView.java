package tec.poo.picocli.view;

import tec.poo.employee.Employee;

import java.util.List;

public class EmployeeView {

    private static final String HEADER = " Name \t Last Name \t Role " +
            "\n===================================";

    public static void print(Employee e) {
        System.out.println(HEADER);
        System.out.println(e.getName()+ "\t" + e.getLastName() + "\t" + e.getEmployeeRole());
    }

    public static void print(List<Employee> employees) {
        System.out.println(HEADER);
        employees.forEach(e -> System.out.println(e.getName()+ "\t" + e.getLastName() + "\t" + e.getEmployeeRole()));
    }

}
