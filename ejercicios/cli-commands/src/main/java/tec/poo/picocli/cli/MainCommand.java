package tec.poo.picocli.cli;

import picocli.CommandLine;


@CommandLine.Command(
        name = "CLI Commands App",
        subcommands = {
                CreateEmployeeCommand.class,
                DeleteEmployeeCommand.class,
                ReadEmployeeCommand.class,
                ReallAllEmployeesCommand.class
        },
        description = "Employee Registration commands")

public class MainCommand implements Runnable {
    @Override
    public void run() {

    }
}