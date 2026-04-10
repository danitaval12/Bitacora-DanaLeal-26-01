package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.service;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.strategy.NotificationStrategy;

public class NotificationService {

    private static NotificationService instance;
    private NotificationStrategy strategy;

    private NotificationService() {}

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send(String message) {
        if (strategy != null) {
            strategy.send(message);
        }
    }
}