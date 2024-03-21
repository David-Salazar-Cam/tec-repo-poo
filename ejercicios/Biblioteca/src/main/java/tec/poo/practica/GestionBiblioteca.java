package tec.poo.practica;



import java.util.Scanner;

public class GestionBiblioteca {

    public static void main( String[] args ){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El principito", "Antoine De Saint-Exupery", "978-607-07-0442-0");

        System.out.println(biblioteca.buscarLibro("Cenicienta", 0));

        for (int i = 0; i < biblioteca.getInventario().size(); i++ ){
            if (biblioteca.getInventario().get(i).getTitulo() == "El principito" ){
                biblioteca.getInventario().get(i).prestarLibro();
                System.out.println(biblioteca.getInventario().get(i).isDisponible());
                break;
            }
        }

        for (int i = 0; i < biblioteca.getInventario().size(); i++ ){
            if (biblioteca.getInventario().get(i).getTitulo() == "El principito" ){
                biblioteca.getInventario().get(i).devolverLibro();
                System.out.println(biblioteca.getInventario().get(i).isDisponible());
                break;
            }
        }



        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.next();
        System.out.println("Ingrese el nombre del autor:");
        String autor = scanner.next();
        System.out.println("Ingrese el ISBN:");
        String isbn = scanner.next();
         */

    }

}
