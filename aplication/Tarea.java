import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Random;
import java.util.Scanner;

// Clase que representa una tarea
class Tarea {
    private static final String[] TIPOS_DE_TAREA = {
            "Recoger personas",
            "Llevar personas",
            "Llevar encomiendas",
            "Tanquear el vehículo",
            "Lavar el vehículo"
    };

    private static String tipo;

    public Tarea(String string) {
        Random random = new Random();
        int indice = random.nextInt(TIPOS_DE_TAREA.length);
        this.tipo = TIPOS_DE_TAREA[indice];
    }

    public String getTipo() {
        return tipo;
    }

    public static Tarea generarTareaAleatoria() {
        return new Tarea(tipo);
    }
}
