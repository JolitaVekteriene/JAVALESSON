package service;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginService {
    private static final int MAX_RETRY = 5;
    private final Map<String, String> credentials = new HashMap<>();

    public void userRegistration(Scanner scanner) {
        String userName = getUniqueUserName(scanner);

        System.out.println("Iveskite slaptazodi:");
        String password = scanner.nextLine();

        if (!isRepeatPasswordCorrect(scanner, password)){
            System.out.println("Userio sukurti nepavyko");
            return;
        }

        credentials.put(userName, DigestUtils.sha512Hex(password));
    }

    public void login() {

    }

    private boolean isRepeatPasswordCorrect(Scanner scanner, String password) {

        for (int i = 0; i < MAX_RETRY; i++) {
            System.out.println("Pakartokite slaptazodzio ivedima:");
            String repeatPassword = scanner.nextLine();

            if (!repeatPassword.equals(password)) {
                System.out.println("Slaptazodziai nesutampa");
                continue;
            }

            return true;
        }

        return false;
    }

    private String getUniqueUserName(Scanner scanner) {
        while (true) {
            System.out.println("Iveskite username:");
            String newUserName = scanner.nextLine();

            String user = credentials.get(newUserName);
            if (user != null) {
                System.out.printf("Vartotojo vardas %s egzistuoja\n", newUserName);
                continue;
            }

            return newUserName;
        }
    }
}
