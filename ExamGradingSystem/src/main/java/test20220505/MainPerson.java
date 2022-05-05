package test20220505;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import test20220505.Person.Person;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        MainPerson main = new MainPerson();
        Scanner scanner = new Scanner(System.in);

        String action;
        do {
            main.personMenu();
            action = scanner.nextLine();
            main.callAction(action, scanner);

        } while (!action.equals("3"));


        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("testFile.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Person person = new Person ("Jolita", "Vekteriene", "48607271234");

        try {
            mapper.writeValue(file, person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            person = mapper.readValue(file, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }
    private void callAction(String action, Scanner scanner) {
        switch (action) {
            case "1" -> addPerson(scanner);
            case "2" -> System.out.println("Viso gero");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }

    private void addPerson(Scanner scanner) {
        System.out.println("Iveskite vartotojo varda:");
        String name = scanner.nextLine();
        System.out.println("Iveskite vartotojo pavarde:");
        String surname = scanner.nextLine();
        System.out.println("Iveskite vartotojo asmens koda: ");
        String personId = scanner.nextLine();
    }

    private void personMenu() {
        System.out.println("""
                [1]. ivesti vartotojo duomenis
                [2]. iseiti
                """);
    }
}


