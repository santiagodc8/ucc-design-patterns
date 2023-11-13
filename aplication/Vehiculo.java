import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Vehiculo {
    private String id;
    private String tipo;
    private Ruta ruta;

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

    public abstract void arrancar();

    public void seguirRuta() {
        ruta.seguirRuta();
    }
}