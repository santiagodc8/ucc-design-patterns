class Coche extends Vehiculo {
    public Coche(String id) {
        super(id, "Coche");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor del coche...");
    }
}