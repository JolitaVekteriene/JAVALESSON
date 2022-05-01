package lt.codeacademy.login;

import java.util.Scanner;

public class LecturerMain {
    public static void main(String[] args) {
        LecturerMain main = new LecturerMain();
        Scanner scanner = new Scanner(System.in);

        String action;
        do {
            main.lecturerMenu();
            action = scanner.nextLine();
            main.callAction(action, scanner);

        } while (!action.equals("3"));
    }

    private void callAction(String action, Scanner scanner) {
        switch (action) {
            case "1" -> addExam(scanner);
            //  case "2" -> ;
            //  case "3" -> ;
            case "3" -> System.out.println("Viso gero");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void addExam(Scanner scanner) {
        System.out.println("Iveskite egzamino id:");
        int examId = Integer.parseInt(scanner.nextLine());
        System.out.println("Iveskite egzamino varda:");
        String examName = scanner.nextLine();
        System.out.println("Iveskite egzamino tipa: ");
        String examType = scanner.nextLine();
        System.out.println("Iveskite egzamino klausimus: ");
        String examQuestions = scanner.nextLine();
        System.out.println("Iveskite klausimu atsakimus: ");
        String examAnswers = scanner.nextLine();
    }

    private void lecturerMenu() {
        System.out.println("""
                [1]. sukurti egzamina
                [2]. pasiziureti pazymiu vidurki
                [3]. iseiti
                """);
    }
}

