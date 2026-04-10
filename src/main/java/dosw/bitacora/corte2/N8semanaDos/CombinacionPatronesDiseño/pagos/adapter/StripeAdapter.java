package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.adapter;

public class StripeAdapter implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Pago realizado con Stripe: " + amount);
    }
}