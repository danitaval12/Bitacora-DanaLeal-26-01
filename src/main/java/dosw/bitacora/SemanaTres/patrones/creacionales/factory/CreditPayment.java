package dosw.bitacora.SemanaTres.patrones.creacionales.factory;

public class CreditPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pago con tarjeta de credito por $" + amount);
    }
}
