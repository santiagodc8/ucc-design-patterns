public class Persona {
    protected String name;
    protected String cel;
    protected String id;

    public Persona(String name, String cel, String id) {
        this.name = name;
        this.cel = cel;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCel() {
        return cel;
    }

    public String getId() {
        return id;
    }

    public String mostrarPersona() {
        return "Nombre: " + name +
                "\nCelular: " + cel +
                "\nID : " + id;
    }

}
