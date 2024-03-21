package tec.poo.tareas;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// solicitud Implementa una clase TareasRepositoryImpl que implemente la interfaz TareasRepository.
public class TareasRepositoryImpl implements TareasRepository 
{
    private final String archivoTareas;
    public TareasRepositoryImpl(String archivoTareas) 
    {
        this.archivoTareas = archivoTareas;
    }

    @Override
    public void guardarTareas(List<String> tareas) 
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTareas))) 
        {
            for (String tarea : tareas) 
            {
                bw.write(tarea);
                bw.newLine();
            }
        } catch (IOException e)
         {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> cargarTareas() 
    {
        List<String> tareas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoTareas)))
        {
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                tareas.add(linea);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        return tareas;
    }
}
