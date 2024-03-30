package tec.poo.tareas;

import java.util.ArrayList;
import java.util.List;

// Clase Empresa
class Empresa {
    private List<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }

    // Agregar un nuevo empleado
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public boolean buscarEmpleado(String nombre){
        int i=0;
        while(i<listaEmpleados.size()){
            Empleado buscador=listaEmpleados.get(i);
            if (buscador.getNombre().equals(nombre)){
                return true;
            }i++;
        }
        return false; 
    }

    // Calcular el salario total de todos los empleados
    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (Empleado empleado : listaEmpleados) {
            salarioTotal += empleado.calcularSalario();
        }
        return salarioTotal;
    }
}

