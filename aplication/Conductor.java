import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Random;
import java.util.Scanner;

// Clase que representa a un conductor
class Conductor implements Monitoreable {
    private String nombre;
    private int edad;
    private Ruta ruta;
    private Tarea tarea;

    public Conductor(String nombre, int edad, Ruta ruta) {
        this.nombre = nombre;
        this.edad = edad;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void asignarTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando Conductor " + nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
}


