package tec.poo.picocli.cli;


import picocli.CommandLine;

@CommandLine.Command(name = "employee:read-single", aliases = {"er"}, description = "Read single employee")
public class ReadEmployeeCommand implements Runnable {

    @Override
    public void run() {

    }
}
