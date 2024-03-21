package tec.poo.tareas;

public class RegistroEmpleados
{
    public static void main(String []args)
    {
        Empleado empleado = new Empleado();
        empleado.setNombre("Empleado base");
        empleado.setSalarioBase(empleado.CalcularSalario(1000));
        System.out.println(empleado.toString());

        EmpleadoTiempoCompleto EmpleadoTC = new EmpleadoTiempoCompleto();
        EmpleadoTC.setNombre("Empleado tiempo completo");
        EmpleadoTC.setSalarioBase(EmpleadoTC.CalcularSalario(1000));
        System.out.println(EmpleadoTC.toString());

        EmpleadoTiempoParcial EmpleadoTP = new EmpleadoTiempoParcial();
        EmpleadoTP.setNombre("Empleado tiempo parcial");
        EmpleadoTP.setSalarioBase(EmpleadoTP.CalcularSalario(1000));
        System.out.println(EmpleadoTP.toString());
    }
}