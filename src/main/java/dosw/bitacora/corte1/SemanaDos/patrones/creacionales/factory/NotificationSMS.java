package dosw.bitacora.SemanaDos.patrones.creacionales.factory;

public class NotificationSMS implements Notification {

    @Override
    public void send(String message){
        System.out.println("Enviando el SMS: " + message);
    }
}
