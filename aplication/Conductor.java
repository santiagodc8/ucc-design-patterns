import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Conductor {
    private String nombre;
    private int edad;
    private Ruta ruta;

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

    public void seguirRuta() {
        ruta.seguirRuta();
    }

    public Ruta getRuta() {
        return ruta;
    }
}