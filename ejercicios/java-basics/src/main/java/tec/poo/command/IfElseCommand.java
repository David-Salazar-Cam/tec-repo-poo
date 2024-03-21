package tec.poo.command;

public class IfElseCommand {

    private String[] args;

    public IfElseCommand(String[] args) {
        this.args = args;
    }

    public void execute() {

        int x = 8;
        String name = "Dirk";

        if (args.length > 0) {
            System.out.println("Pos 0 is: " + args[0]);
            System.out.println("Pos 1 is: " + args[1]);
        } else {
            System.out.println("Args is empty");
        }

        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }
        if ((x < 3) && (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.print("this line runs no matter what");
    }

    @Override
    public String toString() {
        return "If/Else example";
    }
}
