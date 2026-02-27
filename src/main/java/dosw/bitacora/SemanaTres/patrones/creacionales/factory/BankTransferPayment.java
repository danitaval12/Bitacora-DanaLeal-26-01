package dosw.bitacora.SemanaTres.patrones.creacionales.factory;

public class BankTransferPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Pago con transferencia por $" + amount);
    }
}
