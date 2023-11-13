class Van extends Vehiculo {
    public Van(String id, Ruta ruta) {
        super(id, "Van", ruta);
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando el motor de la camioneta...");
    }
}