import java.util.Scanner;
// Clase que representa una fábrica de vehículos y sensores

class FabricaVehiculos implements AbstractFactory {
    public Vehiculo crearVehiculo(String tipo, String id) {
        Ruta rutaDefault = new RutaUrbana();

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

    public Sensor crearSensor(String id, String type) {
        return new Sensor(id, type);
    }

    @Override
    public Vehiculo crearVehiculo(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearVehiculo'");
    }
}
