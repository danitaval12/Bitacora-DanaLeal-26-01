package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.strategy;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("SMS enviado: " + message);
    }
}