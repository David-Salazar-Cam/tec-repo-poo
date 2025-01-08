package tec.poo.command.my;

public class WhileCommand {

    private String[] args;

    public WhileCommand(String[] args) {
        this.args = args;
    }

    public void execute() {

        int limit = 100;
        int i = 0;

        while(i < limit) {
            System.out.println("I value is: " + i +", remaining: " + (limit - i));
            i++;
        }

        System.out.println("I value is: " + i +", limit value is: " + limit);

        while (limit > 0) {
            System.out.println("limit value is: " + limit);
            limit--;
        }

        // Investigar: cómo se hace un while infinito?
    }

    @Override
    public String toString() {
        return "While Example";
    }
}
