package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain;

public class LimitValidator extends PaymentValidator {

    protected boolean check(double amount) {
        System.out.println("Validando límite...");
        return amount <= 5000;
    }
}