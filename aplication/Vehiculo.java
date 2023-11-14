import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.Random;

// Clase abstracta Vehiculo que implementa Monitoreable
abstract class Vehiculo implements Monitoreable {
    private String id;
    private String tipo;
    private Ruta ruta;
    private Tarea tarea;

    public Vehiculo(String id, String tipo, Ruta ruta) {
        this.id = id;
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean tieneTarea() {
        return tarea != null;
    }

    public void asignarTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando " + tipo + " " + id);
    }

    public abstract void arrancar();

    public void seguirRuta() {
        ruta.seguirRuta();
    }
}
