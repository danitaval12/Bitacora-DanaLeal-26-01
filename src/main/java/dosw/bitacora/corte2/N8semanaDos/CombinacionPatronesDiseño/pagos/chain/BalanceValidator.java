package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain;

public class BalanceValidator extends PaymentValidator {

    protected boolean check(double amount) {
        System.out.println("Se encuentra validando el saldo...");
        return amount > 0;
    }
}