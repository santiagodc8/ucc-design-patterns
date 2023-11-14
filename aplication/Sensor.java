import java.util.Observable;

// Clase que representa un sensor
class Sensor implements Monitoreable {
    private String id;
    private String type;

    public Sensor(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando Sensor " + type + " " + id);
    }
}