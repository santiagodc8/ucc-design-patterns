public class tarea {

    protected String trabajo;

    public tarea(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String mostrartarea() {
        return "Trabajo: " + trabajo;
    }

}
