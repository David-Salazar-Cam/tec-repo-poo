package tec.poo.tareas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        EmpleadoRegular empleadoRegular = new EmpleadoRegular("Juan", 1, 3000);
        Director director = new Director("Carlos", 3, 8000);
        Gerente gerente = new Gerente("Ana", 2, 5000);
        empresa.agregarEmpleado(empleadoRegular);
        empresa.agregarEmpleado(director);
        empresa.agregarEmpleado(gerente);

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nMenú de Empleados");
            System.out.println("1. Agregar nuevo empleado");
            System.out.println("2. Ver salario total");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingrese el puesto del empleado (todo minusculas).");
                        String puesto = sc.nextLine();
                        System.out.println("Ingrese el nombre.");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese el id del empleado.");
                        int id = sc.nextInt();
                        System.out.println("Ingrese el salario.");
                        int salario = sc.nextInt();
                        if(salario<0){
                                throw new SalarioNegativoException();
                            }
                        if(puesto.equals("gerente")){
                            Empleado nEmpleado = new Gerente(nombre, id, salario);
                            empresa.agregarEmpleado(nEmpleado);
                            System.out.println("Se agrego el nuevo gerente.");
                        }else if(puesto.equals("empleado regular")){
                            Empleado nEmpleado = new EmpleadoRegular(nombre, id, salario);
                            empresa.agregarEmpleado(nEmpleado);
                            System.out.println("Se agrego el nuevo empleado regular.");
                        }else if(puesto.equals("director")){
                            Empleado nEmpleado = new Director(nombre, id, salario);
                            empresa.agregarEmpleado(nEmpleado);
                            System.out.println("Se agrego el nuevo director.");
                        }
                        
                    }catch (SalarioNegativoException e) {
                            System.out.println(e.getMessage());
                        }
                    break;
                case 2:
                    System.out.println("salario total:"+ empresa.calcularSalarioTotal());
                    break;
                case 3:
                    try {
                        System.out.println("Ingrese el nombre del empleado a buscar");
                        String nombre2 = sc2.nextLine();
                        if (empresa.buscarEmpleado(nombre2)==true){
                        System.out.println("El empleado buscado existe.");
                    }else{
                        throw new EmpleadoNotFoundException();
                    }
                    } catch (EmpleadoNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    sc.close();
                    sc2.close();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}

