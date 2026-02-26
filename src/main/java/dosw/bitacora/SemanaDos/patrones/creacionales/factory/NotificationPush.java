package dosw.bitacora.SemanaDos.patrones.creacionales.factory;

public class NotificationPush implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }
}
