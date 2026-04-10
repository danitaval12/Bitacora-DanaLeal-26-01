package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.adapter;

public class CreditCardAdapter implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Pago con tarjeta: " + amount);
    }
}