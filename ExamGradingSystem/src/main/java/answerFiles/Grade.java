package answerFiles;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Jeigu egzamino neislaikete, egzamina perlaikyti galesite po 48 valandu\n" + localDateTime.plusHours(48));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirmo atsakymo varianta:");
        String answer1 = scanner.next();
        System.out.println(answer1);

        System.out.println("Iveskite antro atsakymo varianta:");
        String answer2 = scanner.next();
        System.out.println(answer2);

        System.out.println("Iveskite trecio atsakymo varianta:");
        String answer3 = scanner.next();
        System.out.println(answer3);

        System.out.println("Iveskite ketvirto atsakymo varianta:");
        String answer4 = scanner.next();
        System.out.println(answer4);

        System.out.println("Iveskite penkto atsakymo varianta:");
        String answer5 = scanner.next();
        System.out.println(answer5);

        System.out.println("Iveskite sesto atsakymo varianta:");
        String answer6 = scanner.next();
        System.out.println(answer6);

        System.out.println("Iveskite septinto atsakymo varianta:");
        String answer7 = scanner.next();
        System.out.println(answer7);

        System.out.println("Iveskite astunto atsakymo varianta:");
        String answer8 = scanner.next();
        System.out.println(answer8);

        System.out.println("Iveskite devinto atsakymo varianta:");
        String answer9 = scanner.next();
        System.out.println(answer9);

        System.out.println("Iveskite desimto atsakymo varianta:");
        String answer10 = scanner.next();
        System.out.println(answer10);
    }
}
