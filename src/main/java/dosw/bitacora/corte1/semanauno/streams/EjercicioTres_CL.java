package dosw.bitacora.semanauno.streams;

import java.util.List;

public class EjercicioTres_CL {

    public static List<String> getActiveUsers(List<User> users) {
        return users.stream()
                .filter(User::isActive)
                .filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }

    public static void main(String[] args) {

        List<User> users = List.of(
                new User(100101990, "Dana", 19, true),
                new User(200223345, "Alejandro", 21, true),
                new User(344552233, "Fabio", 51, true),
                new User(100012345, "Amy", 13, false),
                new User(234567894, "Francisco", 34, false)
        );

        List<String> result = getActiveUsers(users);

        System.out.println(result);
    }
}