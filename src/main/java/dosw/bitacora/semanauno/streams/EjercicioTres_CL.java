package dosw.bitacora.semanauno.streams;

import java.util.List;

public class EjercicioTres_CL {

    public static List<String> getActiveUsers(List<User> users) {
        return users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }

    public static void main(String[] args) {

        List<User> users = List.of(
                new User(100101990, "Dana", 19, true),
                new User(200223345, "Alejandro", 21, true),
                new User(344552233, "Fabio", 51, false)
        );

        List<String> result = getActiveUsers(users);

        System.out.println(result);
    }
}