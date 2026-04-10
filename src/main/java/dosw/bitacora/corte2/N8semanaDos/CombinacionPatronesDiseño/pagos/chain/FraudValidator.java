package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain;

public class FraudValidator extends PaymentValidator {

    protected boolean check(double amount) {
        System.out.println("Se esta validando un fraude...");
        return amount < 10000;
    }
}