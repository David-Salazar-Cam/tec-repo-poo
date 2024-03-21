package tec.poo.tareas;

public class EmpleadoRegular extends Empleado{
    public EmpleadoRegular(String nombre, int id, double salario) {
        super(nombre, id, salario);
    }
    
    @Override
    public double calcularSalario() {
        // El salario de un empleado regular es fijo
        return getSalario();
    }
}

