package dosw.bitacora.SemanaTres.patrones.creacionales.factory;

public class FactoryPayment {
    public static Payment createPayment(String type) {

        switch (type.toUpperCase()) {

            case "CREDITO":
                return new CreditPayment();

            case "PAYPAL":
                return new PayPalPayment();

            case "TRANSFERENCIA":
                return new BankTransferPayment();

            default:
                throw new IllegalArgumentException("El Método de pago no es valido");
        }
    }
}

