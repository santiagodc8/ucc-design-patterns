import java.util.Scanner;

class FabricaVehiculos {
    public static Vehiculo crearVehiculo(String tipo, String id) {
        while (true) {
            try {
                if (tipo.equalsIgnoreCase("Autobús")) {
                    return new Autobus(id);
                } else if (tipo.equalsIgnoreCase("Coche")) {
                    return new Coche(id);
                } else if (tipo.equalsIgnoreCase("Van")) {
                    return new Van(id);
                } else {
                    throw new IllegalArgumentException("Tipo de vehículo inválido: " + tipo);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print("Ingrese el tipo de vehículo nuevamente: ");
                tipo = new Scanner(System.in).nextLine();
            }
        }
    }
}
