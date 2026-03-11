package dosw.bitacora.SemanaDos.patrones.creacionales.factory;

public class Main {
    public static void main(String[] args) {

        Notification notification =
                FactoryNoti.createNotification("EMAIL");

        notification.send("Hola Nana, ¿Cómo vas?. ¿Qué tal tu día?");
    }
}
