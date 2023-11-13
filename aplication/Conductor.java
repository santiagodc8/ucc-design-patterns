import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Conductor {
    private String nombre;
    private int edad;

    public Conductor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}