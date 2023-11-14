import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Random;
import java.util.Scanner;

// Clase que asigna tareas a conductores y vehículos
class AsignadorDeTareas {
    public Vehiculo asignarVehiculo(Conductor conductor, List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            if (!vehiculo.tieneTarea()) {
                return vehiculo;
            }
        }
        return null;
    }

    public void asignarTarea(Vehiculo vehiculo, Conductor conductor, Tarea tarea) {
        vehiculo.asignarTarea(tarea);
        conductor.asignarTarea(tarea);
    }

    public void asignarTareasAleatorias(List<Conductor> conductores, List<Vehiculo> vehiculos) {
        for (Conductor conductor : conductores) {
            Vehiculo vehiculoAsignado = asignarVehiculo(conductor, vehiculos);
            if (vehiculoAsignado != null) {
                Tarea nuevaTarea = Tarea.generarTareaAleatoria();
                asignarTarea(vehiculoAsignado, conductor, nuevaTarea);
            }
        }
    }
}
