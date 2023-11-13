class Van extends Vehiculo {
    public Van(String id) {
        super(id, "Van");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor de la camioneta...");
    }
}