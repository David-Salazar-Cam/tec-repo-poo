package tec.poo.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactorialCommand {

    private static final Logger logger = LoggerFactory.getLogger(FactorialCommand.class);

    private String[] args;
    private int inputNumber;

    public FactorialCommand(String[] args) {
        if (args == null) {
            throw new NullPointerException("Null arguments");
        }

        this.args = args;

        try {
            this.inputNumber = Integer.parseInt(args[1]);
        } catch (Exception ex) {
            logger.warn("Error parsing input number", ex);
            this.inputNumber = 1;
        }
    }

    public void execute() {
        int factorial = calculateFactorial(inputNumber);
        System.out.println("Factorial of " + inputNumber + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        // Base case: if n is 0 or 1, factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }

    @Override
    public String toString() {
        return "Factorial Example";
    }
}
