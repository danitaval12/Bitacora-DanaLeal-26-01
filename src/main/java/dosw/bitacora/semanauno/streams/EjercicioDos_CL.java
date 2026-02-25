package dosw.bitacora.semanauno.streams;

import java.util.List;

public class EjercicioDos_CL {

    public static void main(String[] args) {

        List<String> words = List.of("java","stream","api","functional","code","git");

        List<String> processed = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        long count = processed.stream()
                .count();

        System.out.println("Lista procesada: " + processed);
        System.out.println("La cantidad Total: " + count);

    }
}
