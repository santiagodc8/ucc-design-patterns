import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SistemaAutobuses {
    private List<Vehiculo> vehiculos;
    private List<Conductor> conductores;

    public SistemaAutobuses() {
        vehiculos = new ArrayList<>();
        conductores = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
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
                conductor.seguirRuta();
            }
        }
    }
}


