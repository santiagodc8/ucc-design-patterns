public class gps {
    protected String ubicacion, ruta;

    public gps(String ubicacion, String ruta) {
        this.ubicacion = ubicacion;
        this.ruta = ruta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getRuta() {
        return ruta;
    }

    public String mostrarGps() {
        return "Ubicacion actual: " + ubicacion +
                "\nRuta a la que se dirije: " + ruta;
    }
}
