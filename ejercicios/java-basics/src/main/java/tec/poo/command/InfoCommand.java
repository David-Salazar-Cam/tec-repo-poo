package tec.poo.command;

public class InfoCommand {
    private static final String VERSION = "1.0.0";
    private static final String VERSION_DATE = "26/02/2024";
    private static final String CREATED_BY = "TEC-POO";

    private String[] args;

    public InfoCommand(String[] args) {
        this.args = args;
    }

    public void execute() {
        System.out.println("Java Basics! Version: " + VERSION + ", Date: " + VERSION_DATE + ", Created by: " + CREATED_BY);
    }

    @Override
    public String toString() {
        return "Info Command: Martin Flores";
    }
}
