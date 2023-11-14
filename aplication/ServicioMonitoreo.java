import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

// Clase que gestiona el monitoreo de objetos
class ServicioMonitoreo implements Monitoreable {
    private List<Monitoreable> monitoreables;

    public ServicioMonitoreo() {
        this.monitoreables = new ArrayList<>();
    }

    public void agregarMonitoreable(Monitoreable monitoreable) {
        monitoreables.add(monitoreable);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando ServicioMonitoreo");
        for (Monitoreable monitoreable : monitoreables) {
            monitoreable.monitorear();
        }
    }
}