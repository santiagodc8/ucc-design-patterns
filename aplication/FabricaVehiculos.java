import java.util.Scanner;

class FabricaVehiculos {
    public static Vehiculo crearVehiculo(String tipo, String id) {
        Ruta rutaDefault = new RutaUrbana(); // You can change this to the desired default route

        if (tipo.equalsIgnoreCase("Autobus")) {
            return new Autobus(id, rutaDefault);
        } else if (tipo.equalsIgnoreCase("Coche")) {
            return new Coche(id, rutaDefault);
        } else if (tipo.equalsIgnoreCase("Van")) {
            return new Van(id, rutaDefault);
        } else {
            throw new IllegalArgumentException("Tipo de vehículo inválido: " + tipo);
        }
    }
}
