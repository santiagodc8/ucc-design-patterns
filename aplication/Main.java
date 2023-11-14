import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SistemaAutobuses sistemaAutobuses = new SistemaAutobuses();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de vehículos");
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("+-------- Patrones de Diseño ---------+");
        System.out.println("+ Autor: ---- Santiago Duran 💻 -------+");
        System.out.println("+---------------------------------------+");
        Thread.sleep(3000);

        // Adding vehicles
        while (true) {
            System.out.print("Ingrese el tipo de Vehículo 🚎 🚗 🚐 (Autobús/Coche/Van) (Ingrese 'q' para salir): ");
            String tipoVehiculo = scanner.nextLine();
            if (tipoVehiculo.equalsIgnoreCase("q")) {
                break;
            }
    
            System.out.print(" 🔢 ID del Vehículo: ");
            String idVehiculo = scanner.nextLine();
    
            Vehiculo vehiculo = null;
            try {
                vehiculo = FabricaVehiculos.crearVehiculo(tipoVehiculo, idVehiculo);
                sistemaAutobuses.agregarVehiculo(vehiculo);
                System.out.println("Vehículo agregado exitosamente ✅✅ ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, elija entre 'autobus', 'coche' o 'van'.");
            }
            System.out.println();
        }


        // Adding conductors with routes
        while (true) {
            System.out.print("Nombre del Conductor (Ingrese 'q' para salir): ");
            String nombreConductor = scanner.nextLine();
            if (nombreConductor.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Edad del Conductor #️⃣: ");
            int edadConductor = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Seleccione la Ruta para el Conductor 📍 (1: RutaUrbana, 2: RutaInterurbana): ");
            int opcionRuta = scanner.nextInt();
            scanner.nextLine();

            Ruta rutaConductor;
            if (opcionRuta == 1) {
                rutaConductor = new RutaUrbana();
            } else if (opcionRuta == 2) {
                rutaConductor = new RutaInterurbana();
            } else {
                System.out.println("Opción de ruta inválida. ❌❌ Se asignará RutaUrbana por defecto.");
                rutaConductor = new RutaUrbana();
            }

            Conductor conductor = new Conductor(nombreConductor, edadConductor, rutaConductor);
            sistemaAutobuses.agregarConductor(conductor);
            System.out.println("Conductor agregado exitosamente ✅✅ ");
            System.out.println();
        }

        System.out.println("Lista de Vehículos 🗒️:");
        sistemaAutobuses.imprimirVehiculos();
        System.out.println();

        System.out.println("Lista de Conductores 🗒️:");
        sistemaAutobuses.imprimirConductores();
        System.out.println();

        scanner.close();
    }
}
