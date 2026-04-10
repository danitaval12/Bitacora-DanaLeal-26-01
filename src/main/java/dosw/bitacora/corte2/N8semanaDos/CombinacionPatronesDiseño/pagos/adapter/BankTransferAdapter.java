package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.adapter;

public class BankTransferAdapter implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Transferencia bancaria: " + amount);
    }
}