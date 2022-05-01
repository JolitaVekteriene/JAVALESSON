package lt.codeacademy.login;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentMain main = new StudentMain();
        Scanner scanner = new Scanner(System.in);

        String action;
        do {
            main.studentMenu();
            action = scanner.nextLine();
            main.callAction(action, scanner);


        } while (!action.equals("4"));
    }

    private void callAction(String action, Scanner scanner) {
        switch (action) {
            case "1" -> addStudent(scanner);
          //  case "2" -> ;
          //  case "3" -> ;
            case "4" -> System.out.println("Viso gero");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void addStudent(Scanner scanner) {
        System.out.println("Iveskite studento id:");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Iveskite studento varda");
        String name = scanner.nextLine();
        System.out.println("Iveskite studento pavarde");
        String surname = scanner.nextLine();
    }

    private void studentMenu() {
        System.out.println("""
                [1]. ivesti studento duomenis
                [2]. laikyti testa
                [3]. pasiziureti pazymius
                [4]. iseiti
                """);
    }
}
