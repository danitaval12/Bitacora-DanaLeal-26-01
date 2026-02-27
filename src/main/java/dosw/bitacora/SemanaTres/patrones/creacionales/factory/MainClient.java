package dosw.bitacora.SemanaTres.patrones.creacionales.factory;

public class MainClient {
    public static void main(String[] args) {

        Payment payment1 = FactoryPayment.createPayment("CREDITO");
        payment1.processPayment(1500000);

        Payment payment2 = FactoryPayment.createPayment("PAYPAL");
        payment2.processPayment(200000);

        Payment payment3 = FactoryPayment.createPayment("TRANSFERENCIA");
        payment3.processPayment(4750000);
    }
}
