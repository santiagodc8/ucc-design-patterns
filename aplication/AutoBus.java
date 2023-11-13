class Autobus extends Vehiculo {
    public Autobus(String id, Ruta ruta) {
        super(id, "Autobús", ruta);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor del autobús...");
    }
}