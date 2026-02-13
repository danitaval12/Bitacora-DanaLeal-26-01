package dosw.bitacora.semanauno.streams;

import java.util.Arrays;
import java.util.List;

public class EjercicioUnoCL {

    List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .filter(n -> n > 10)
            .toList();
}

