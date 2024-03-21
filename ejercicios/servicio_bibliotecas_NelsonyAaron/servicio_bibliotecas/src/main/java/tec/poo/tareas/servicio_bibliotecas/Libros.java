
package tec.poo.tareas.servicio_bibliotecas;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nelson y Aaron
 */


public class Libros {
    String Titulo;
    String Autor;
    int ISBN;
    int Prestado; // Si está en '1' ya está prestado
    
    public Libros(String Titulo, String Autor, int ISBN){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Prestado = 0;
    }
    
}