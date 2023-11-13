import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sensor {
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
}

