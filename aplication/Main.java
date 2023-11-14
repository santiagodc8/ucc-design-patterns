import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Random;
import java.util.Scanner;
// Clase principal del programa
public class Main {
    public static void main(String[] args) {
        AbstractFactory fabrica = new FabricaVehiculos();
        SistemaAutobuses sistemaAutobuses = new SistemaAutobuses(fabrica);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de vehículos");
        System.out.println();

        // Agregar vehículos
        while (true) {
            System.out.print("Tipo de Vehículo (Autobús/Coche/Van) (Ingrese 'q' para salir): ");
            String tipoVehiculo = scanner.nextLine();
            if (tipoVehiculo.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("ID del Vehículo: ");
            String idVehiculo = scanner.nextLine();

            Vehiculo vehiculo = fabrica.crearVehiculo(idVehiculo);
            sistemaAutobuses.agregarVehiculo(vehiculo);
            System.out.println("Vehículo agregado exitosamente");
            System.out.println();
        }

        // Agregar conductores con rutas
        while (true) {
            System.out.print("Nombre del Conductor (Ingrese 'q' para salir): ");
            String nombreConductor = scanner.nextLine();
            if (nombreConductor.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Edad del Conductor: ");
            int edadConductor = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Seleccione la Ruta para el Conductor (1: RutaUrbana, 2: RutaInterurbana): ");
            int opcionRuta = scanner.nextInt();
            scanner.nextLine();

            Ruta rutaConductor;
            if (opcionRuta == 1) {
                rutaConductor = new RutaUrbana();
            } else if (opcionRuta == 2) {
                rutaConductor = new RutaInterurbana();
            } else {
                System.out.println("Opción de ruta inválida. Se asignará RutaUrbana por defecto.");
                rutaConductor = new RutaUrbana();
            }

            Conductor conductor = new Conductor(nombreConductor, edadConductor, rutaConductor);
            sistemaAutobuses.agregarConductor(conductor);
            System.out.println("Conductor agregado exitosamente");
            System.out.println();
        }

        sistemaAutobuses.asignarTareasAleatorias();
        sistemaAutobuses.asignarTareas();
        sistemaAutobuses.monitoreoEnTiempoReal();

        System.out.println("Lista de Vehículos:");
        sistemaAutobuses.imprimirVehiculos();
        System.out.println();

        System.out.println("Lista de Conductores:");
        sistemaAutobuses.imprimirConductores();
        System.out.println();

        scanner.close();
    }
}
