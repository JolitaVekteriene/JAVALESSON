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
            case "2" -> System.out.println("Viso gero");
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
        System.out.println("Iveskite egzamino 1 klausima: ");
        String examQuestions = scanner.nextLine();
        System.out.println("Iveskite klausimo 1 atsakima: ");
        String examAnswers = scanner.nextLine();
        System.out.println("Iveskite egzamino 2 klausima: ");
        String examQuestions1 = scanner.nextLine();
        System.out.println("Iveskite klausimo 2 atsakima: ");
        String examAnswers2 = scanner.nextLine();
        System.out.println("Iveskite egzamino 3 klausima: ");
        String examQuestions3 = scanner.nextLine();
        System.out.println("Iveskite klausimo 3 atsakima: ");
        String examAnswers3 = scanner.nextLine();
        System.out.println("Iveskite egzamino 4 klausima: ");
        String examQuestions4 = scanner.nextLine();
        System.out.println("Iveskite klausimo 4 atsakima: ");
        String examAnswers4 = scanner.nextLine();
        System.out.println("Iveskite egzamino 5 klausima: ");
        String examQuestions5 = scanner.nextLine();
        System.out.println("Iveskite klausimo 5 atsakima: ");
        String examAnswers5 = scanner.nextLine();
        System.out.println("Iveskite egzamino 6 klausima: ");
        String examQuestions6 = scanner.nextLine();
        System.out.println("Iveskite klausimo 6 atsakima: ");
        String examAnswers6 = scanner.nextLine();
        System.out.println("Iveskite egzamino 7 klausima: ");
        String examQuestions7 = scanner.nextLine();
        System.out.println("Iveskite klausimo 7 atsakima: ");
        String examAnswers7 = scanner.nextLine();
        System.out.println("Iveskite egzamino 8 klausima: ");
        String examQuestions8 = scanner.nextLine();
        System.out.println("Iveskite klausimo 8 atsakima: ");
        String examAnswers8 = scanner.nextLine();
        System.out.println("Iveskite egzamino 9 klausima: ");
        String examQuestions9 = scanner.nextLine();
        System.out.println("Iveskite klausimo 9 atsakima: ");
        String examAnswers9 = scanner.nextLine();
        System.out.println("Iveskite egzamino 10 klausima: ");
        String examQuestions10 = scanner.nextLine();
        System.out.println("Iveskite klausimo 10 atsakima: ");
        String examAnswers10 = scanner.nextLine();
    }

    private void lecturerMenu() {
        System.out.println("""
                [1]. sukurti egzamina
                [2]. iseiti
                """);
    }
}


