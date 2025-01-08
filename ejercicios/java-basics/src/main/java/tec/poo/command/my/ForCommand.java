package tec.poo.command.my;

public class ForCommand {

    private String[] args;

    public ForCommand(String[] args) {
        this.args = args;
    }

    public void execute() {
        int limit = 100;
        for (int i = 0; i < limit; i++) {
            System.out.println("I value is: " + i + ", remaining: " + (limit - i));
        }

        for (limit = 100; limit > 0; limit--) {
            System.out.println("I value is: " + limit);
        }

        // Investigar: cómo se hace un for infinito?
    }

    @Override
    public String toString() {
        return "For Example";
    }
}
