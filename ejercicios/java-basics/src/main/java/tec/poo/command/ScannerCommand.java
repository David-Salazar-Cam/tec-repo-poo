package tec.poo.command;

import java.util.Scanner;

public class ScannerCommand {

    private String[] args;

    public ScannerCommand(String[] args) {
        this.args = args;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Getting user input for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying the input received from the user
        System.out.println("\nHello, " + name + "! You are " + age + " years old.");

        // Closing the scanner
        scanner.close();
    }

    @Override
    public String toString() {
        return "Scanner Example Isaac Alfaro";
    }
}
