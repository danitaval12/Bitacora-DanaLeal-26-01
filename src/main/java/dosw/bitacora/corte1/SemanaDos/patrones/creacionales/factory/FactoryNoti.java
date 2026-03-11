package dosw.bitacora.SemanaDos.patrones.creacionales.factory;

public class FactoryNoti {

    public static Notification createNotification(String type) {

        switch (type.toUpperCase()) {

            case "EMAIL":
                return new NotificationEmail();

            case "SMS":
                return new NotificationSMS();

            case "PUSH":
                return new NotificationPush();

            default:
                throw new IllegalArgumentException("El Tipo de notificación no es válido");
        }
    }
}
