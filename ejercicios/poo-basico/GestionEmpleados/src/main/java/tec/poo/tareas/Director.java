package tec.poo.tareas;

public class Director extends Empleado{
    private double bonificacionAdicional;

    public Director(String nombre, int id, double salario) {
        super(nombre, id, salario);
        this.bonificacionAdicional = bonificacionAdicional + 3000;
    }

    @Override
    public double calcularSalario() {
        // El salario de un director es fijo más la bonificación adicional
        return getSalario() + bonificacionAdicional;
    }
}
