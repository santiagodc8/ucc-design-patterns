// Clase Coche que extiende Vehiculo
class Coche extends Vehiculo {
    public Coche(String id, Ruta ruta) {
        super(id, "Coche", ruta);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor del coche...");
    }
}