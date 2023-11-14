import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.Random;

// Clase que representa el sistema de autobuses
class SistemaAutobuses {
    private List<Vehiculo> vehiculos;
    private List<Conductor> conductores;
    private List<Sensor> sensores;
    private AsignadorDeTareas asignadorDeTareas;
    private ServicioMonitoreo servicioMonitoreo;
    private AbstractFactory fabrica;

    public SistemaAutobuses(AbstractFactory fabrica) {
        vehiculos = new ArrayList<>();
        conductores = new ArrayList<>();
        sensores = new ArrayList<>();
        asignadorDeTareas = new AsignadorDeTareas();
        servicioMonitoreo = new ServicioMonitoreo();
        this.fabrica = fabrica;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        servicioMonitoreo.agregarMonitoreable(vehiculo);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
        servicioMonitoreo.agregarMonitoreable(conductor);
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
        servicioMonitoreo.agregarMonitoreable(sensor);
    }

    public void imprimirVehiculos() {
        System.out.println("Vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("ID: " + vehiculo.getId() + ", Tipo: " + vehiculo.getTipo());
        }
    }

    public void imprimirConductores() {
        System.out.println("Conductores:");
        for (Conductor conductor : conductores) {
            System.out.println("Nombre: " + conductor.getNombre() + ", Edad: " + conductor.getEdad() +
                    ", Ruta: " + conductor.getRuta().getClass().getSimpleName());
        }
    }

    public void asignarRutas() {
        Ruta rutaUrbana = new RutaUrbana();
        Ruta rutaInterurbana = new RutaInterurbana();

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.seguirRuta();
        }

        for (Conductor conductor : conductores) {
            if (conductor.getEdad() < 25) {
                ((Monitoreable) conductor).monitorear();
                ((Ruta) conductor).seguirRuta();
            }
        }
    }

    public void asignarTareas() {
        for (Conductor conductor : conductores) {
            Vehiculo vehiculoAsignado = asignadorDeTareas.asignarVehiculo(conductor, vehiculos);
            if (vehiculoAsignado != null) {
                Tarea nuevaTarea = new Tarea("Recoger personas"); // Puedes cambiar la tarea según la lógica
                asignadorDeTareas.asignarTarea(vehiculoAsignado, conductor, nuevaTarea);
            }
        }
    }

    public void asignarTareasAleatorias() {
        asignadorDeTareas.asignarTareasAleatorias(conductores, vehiculos);
    }

    public void monitoreoEnTiempoReal() {
        servicioMonitoreo.monitorear();
    }

}
