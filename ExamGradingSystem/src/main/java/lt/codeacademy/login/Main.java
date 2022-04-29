package lt.codeacademy.login;

import service.LoginService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.selectAction(scanner);
    }

    private void menu() {
        System.out.println("""
                [1]. registracija
                [2]. login
                [3]. exit
                """);
    }

    private void selectAction(Scanner scanner) {
        LoginService service = new LoginService();
        String action;
        do {
            menu();
            action = scanner.nextLine();
            switch (action) {
                case "1" -> service.userRegistration(scanner);
                case "2" -> service.login(scanner);
                case "3" -> System.out.println("Viso gero:");
                default -> System.out.println("Tokio veiksmo nera");
            }
        }while (!action.equals("3"));

    }
}