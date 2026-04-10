package edu.dosw.bitacora.Bitacora.Dana.Leal.CorteDos;
import org.junit.jupiter.api.Test;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.adapter.CreditCardAdapter;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.adapter.PaymentProcessor;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain.FraudValidator;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain.BalanceValidator;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain.LimitValidator;
import dosw.bitacora.corte2.N8semanaDos.CombinacionPatronesDiseño.pagos.chain.PaymentValidator;

import static org.junit.jupiter.api.Assertions.*;

public class PagosTest {

    @Test
    void testPaymentWithValidationAndAdapter() {

        PaymentValidator balance = new BalanceValidator();
        PaymentValidator fraud = new FraudValidator();
        PaymentValidator limit = new LimitValidator();

        balance.setNext(fraud);
        fraud.setNext(limit);

        double amount = 3000;

        boolean isValid = balance.validate(amount);

        assertTrue(isValid);

        PaymentProcessor processor = new CreditCardAdapter();
        processor.processPayment(amount);
    }

    @Test
    void testPaymentRejected() {

        PaymentValidator balance = new BalanceValidator();
        PaymentValidator limit = new LimitValidator();

        balance.setNext(limit);

        double amount = 10000; // excede el límite

        boolean isValid = balance.validate(amount);

        assertFalse(isValid);
    }
}