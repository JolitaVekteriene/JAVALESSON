package service;

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

        if (!isRepeatPasswordCorrect(scanner, password)) {
            System.out.println("Vartotojo sukurti nepavyko");
            return;
        }

        credentials.put(userName, password);
        System.out.println("Studento registracija sekminga");
    }
    public void login(Scanner scanner) {
        System.out.println("Iveskite vartotojo varda:");
        String userName = scanner.nextLine();
        System.out.println("Iveskite slaptazodi:");
        String password = scanner.nextLine();

        String userPassword = credentials.get(userName);
        if (userPassword == null) {
            System.out.println("Tokio vartotojo vardo nera");
            return;
        }
        if (!userPassword.equals(password)) {
            System.out.println("Neteisingas slaptazodis");
            return;
        }

        System.out.printf("Sveikiname  %s prisijungus\n", userName);
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
            System.out.println("Iveskite vartotojo varda:");
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
