package tec.poo.tareas;

public class EmpleadoTiempoCompleto extends Empleado
{
    public EmpleadoTiempoCompleto(){}

    public String toString()
    {
        return super.toString();
    }

    @Override
    public double CalcularSalario(double base)
    {
        return base * 2+ 1000;
    }
    
}
