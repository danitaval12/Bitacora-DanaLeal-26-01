package dosw.bitacora.SemanaDos.patrones.creacionales.factory;

public class NotificationEmail implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
