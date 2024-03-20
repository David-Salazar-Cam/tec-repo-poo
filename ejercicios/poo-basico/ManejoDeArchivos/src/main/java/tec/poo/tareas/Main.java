package tec.poo.tareas;

import java.util.Scanner;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        // path quemado **
        TareasRepository repository = new TareasRepositoryImpl("tareas.txt");
        GestorTareas gestor = new GestorTareas(repository);
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\nGestión de Tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Cargar tareas desde archivo"); 
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) 
            {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String tareaNueva = scanner.nextLine();
                    gestor.agregarTarea(tareaNueva);
                    System.out.println("Tarea agregada exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    gestor.eliminarTarea(tareaEliminar);
                    System.out.println("Tarea eliminada exitosamente.");
                    break;
                case 3:
                    List<String> tareasMostrar = gestor.cargarTareasDesdeArchivo();
                    if (tareasMostrar.isEmpty()) 
                    {
                        System.out.println("No hay tareas guardadas.");
                    } 
                    else 
                    {
                        System.out.println("Tareas:");
                        tareasMostrar.forEach(System.out::println);
                    }
                    break;
                case 4: 
                    List<String> tareasCargadas = gestor.cargarTareasDesdeArchivo();
                    System.out.println("Tareas cargadas desde el archivo:");
                    tareasCargadas.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Saliendo");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
