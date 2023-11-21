public class car {

    protected String placa, marca, modelo;

    public car(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarCarros() {
        return "Placa: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }

}
