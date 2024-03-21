package tec.poo.tareas;

public class Gerente extends Empleado{
    private double bonificacion;

    public Gerente(String nombre, int id, double salario) {
        super(nombre, id, salario);
        this.bonificacion = bonificacion+5000;
    }

    @Override
    public double calcularSalario() {
        // El salario de un gerente es fijo más la bonificación
        return getSalario() + bonificacion;
    }
}
