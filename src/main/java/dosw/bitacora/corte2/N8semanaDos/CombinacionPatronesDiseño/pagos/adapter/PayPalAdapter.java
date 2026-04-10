package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.adapter;

public class PayPalAdapter implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("El pago fue realizado con PayPal: " + amount);
    }
}
