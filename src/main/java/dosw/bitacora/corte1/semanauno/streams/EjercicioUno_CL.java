package dosw.bitacora.semanauno.streams;

import java.util.ArrayList;
import java.util.List;

public class EjercicioUno_CL {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(31);
        numbers.add(12);
        numbers.add(16);
        numbers.add(33);
        numbers.add(22);
        numbers.add(55);
        numbers.add(15);
        numbers.add(14);
        numbers.add(88);
        numbers.add(37);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .toList();

        System.out.println("El Resultado es: ");
        System.out.println(result);
    }
}


