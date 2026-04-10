package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.strategy;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void send(String message) {
        System.out.println("Email enviado: " + message);
    }
}