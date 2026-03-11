package dosw.bitacora.semanauno.streams;

import java.util.List;

public class EjercicioCinco_EC {
    public static boolean isBValid(List<Transaction> transactions) {

        boolean existsNotApproved = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.isApproved());

        return !existsNotApproved;
    }

    public static void main(String[] args) {

        List<Transaction> transactions = List.of(
                new Transaction("T1", 100000, true),
                new Transaction("T2", 5000, true),
                new Transaction("T3", 3550000, false)
        );

        boolean valid = isBValid(transactions);

        System.out.println("¿El lote de transacciones es válido? " + valid);
    }
}
