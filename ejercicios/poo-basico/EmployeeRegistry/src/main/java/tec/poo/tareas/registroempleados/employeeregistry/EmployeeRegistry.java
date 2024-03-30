package tec.poo.tareas.registroempleados.employeeregistry;
import java.util.Scanner;

public class EmployeeRegistry {

    private static Employee[] listaEmpleados = new Employee[100]; 
    private static int totalEmpleados = 0; 
    
    public static void main(String[] args) {
        boolean salir = false;
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Menú: ");
            opcion = menu();
            
            switch (opcion) {
                case 2:
                    agregarEmpleado(); 
                    break;
                case 1:
                    consultarEmpleados();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!salir);
        
        System.out.println("Gracias por acceder al sistema!!");
    }
    
    private static int menu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("1. Consultar Empleados.");
        System.out.println("2. Agregar Empleados.");
        System.out.println("0. Salir de la aplicación.");
        
        System.out.println("Indique su opción: ");
        opcion = entrada.nextInt();
        
        return opcion;
    }
    
    private static void agregarEmpleado() { //no me parece que tenga sentido tener 2 agregar empleado el de employee sirve
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indique el nombre:");
        String nombre = entrada.nextLine();
        
        System.out.println("Indique las horas trabajadas:");
        int horas_trabajadas = entrada.nextInt();

        boolean jornada = Employee.determinar_jornada(horas_trabajadas);

        System.out.println("Indique la tarifa por hora:");
        
        Float tarifa_por_hora = entrada.nextFloat();
        
        System.out.println("Indique el salario base:");
        float salario_base = Employee.calcular_salario(tarifa_por_hora, horas_trabajadas);
        //jornada
        Employee nuevoEmpleado = new Employee(nombre, horas_trabajadas, tarifa_por_hora, salario_base,jornada);
        
        listaEmpleados[totalEmpleados] = nuevoEmpleado;
        totalEmpleados++;
        
        System.out.println("Empleado agregado correctamente.");
        
    }
    
    private static void consultarEmpleados() { //el de employee guarda los empleados aqui?
        if (totalEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        System.out.println("Listado de empleados:");
        for (int i = 0; i < totalEmpleados; i++) {
            System.out.println("Nombre: " + listaEmpleados[i].nombre);
            System.out.println("Horas trabajadas: " + listaEmpleados[i].horas_trabajadas);
            System.out.println("Tarifa por hora: " + listaEmpleados[i].tarifa_por_hora);
            System.out.println("Salario base: " + listaEmpleados[i].salario_base);
            if(listaEmpleados[i].jornada == true){
                System.out.println("Jornada: Tiempo Completo");
            }else {
                System.out.println("Jornada: Medio tiempo");
            }
        }
    }
}
