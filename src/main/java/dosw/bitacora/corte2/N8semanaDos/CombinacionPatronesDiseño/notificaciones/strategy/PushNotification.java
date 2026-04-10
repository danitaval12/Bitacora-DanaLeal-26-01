package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.strategy;

public class PushNotification implements NotificationStrategy {

    @Override
    public void send(String message) {
        System.out.println("Push enviado: " + message);
    }
}