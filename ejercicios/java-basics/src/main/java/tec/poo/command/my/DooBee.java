package tec.poo.command.my;

public class DooBee {

    private String[] args;

    public DooBee(String[] args) {
        this.args = args;
    }

    public void execute() {
        // Salida esperada: DooBeeDooBeeDo
        int x = 1;

        while (x < 3 ) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }

        if (x == 3) {
            System.out.print("Do");
        }
    }

    @Override
    public String toString() {
        return "DooBee";
    }
}
