package dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain;

public abstract class PaymentValidator {

    protected PaymentValidator next;

    public void setNext(PaymentValidator next) {
        this.next = next;
    }

    public boolean validate(double amount) {

        if (!check(amount)) {
            return false;
        }

        if (next == null) return true;

        return next.validate(amount);
    }

    protected abstract boolean check(double amount);
}