package tec.poo.tareas;

public class EmpleadoTiempoParcial extends Empleado
{
    public EmpleadoTiempoParcial(){}

    public String toString()
    {
        return super.toString();
    }

    @Override
    public double CalcularSalario(double base)
    {
        return (base * 2+ 1000)/2;
    }
    
}
