package edu.dosw.bitacora.Bitacora.Dana.Leal.CorteDos;

import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.service.NotificationService;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.strategy.EmailNotification;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.notificaciones.strategy.SMSNotification;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NotificationTest {

    @Test
    void testNotification() {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(new EmailNotification());
        service.send("Hola, tú pedido se encuentra de camino");

        service.setStrategy(new SMSNotification());
        service.send("Hola, escribe al 123 para más información");

        assertNotNull(service);
    }
}
