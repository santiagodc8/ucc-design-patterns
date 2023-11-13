import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaAutobuses sistemaAutobuses = new SistemaAutobuses();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de vehículos");
        System.out.println();

        System.out.println("Ingrese los vehículos (Tipo, ID) uno por uno (Ingrese 'q' para salir):");
        while (true) {
            System.out.print("Tipo de Vehículo (Autobús/Coche/Van): ");
            String tipoVehiculo = scanner.nextLine();
            if (tipoVehiculo.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("ID del Vehículo: ");
            String idVehiculo = scanner.nextLine();

            Vehiculo vehiculo = FabricaVehiculos.crearVehiculo(tipoVehiculo, idVehiculo);
            sistemaAutobuses.agregarVehiculo(vehiculo);
            System.out.println("Vehículo agregado exitosamente");
            System.out.println();
        }

        System.out.println("Ingrese los conductores (Nombre, Edad) uno por uno (Ingrese 'q' para salir):");
        while (true) {
            System.out.print("Nombre del Conductor: ");
            String nombreConductor = scanner.nextLine();
            if (nombreConductor.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Edad del Conductor: ");
            int edadConductor = scanner.nextInt();
            scanner.nextLine();

            Conductor conductor = new Conductor(nombreConductor, edadConductor);
            sistemaAutobuses.agregarConductor(conductor);
            System.out.println("Conductor agregado exitosamente");
            System.out.println();
        }

        System.out.println("Lista de Vehículos:");
        sistemaAutobuses.imprimirVehiculos();
        System.out.println();

        System.out.println("Lista de Conductores:");
        sistemaAutobuses.imprimirConductores();
        System.out.println();

        scanner.close();
    }
}