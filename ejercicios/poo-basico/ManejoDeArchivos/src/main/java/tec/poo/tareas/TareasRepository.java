package tec.poo.tareas;

import java.util.List;

// solicitud: Define una interfaz TareasRepository que contenga los siguientes métodos
public interface TareasRepository 
{
    void guardarTareas(List<String> tareas);
    List<String> cargarTareas();
}
