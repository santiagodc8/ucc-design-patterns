class Autobus extends Vehiculo {
    public Autobus(String id) {
        super(id, "Autobús");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor del autobús...");
    }
}