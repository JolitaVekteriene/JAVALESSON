package student;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnswersMain {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Student student = new Student("888", "456", List.of(
                new Answer("1.", "a"),
                new Answer("2.", "b"),
                new Answer("3.", "c"),
                new Answer("4.", "b"),
                new Answer("5.", "b"),
                new Answer("6.", "c"),
                new Answer("7.", "a"),
                new Answer("8.", "b"),
                new Answer("9.", "b"),
                new Answer("10.", "a")));

        Student student2 = new Student("777", "456", List.of(
                new Answer("1.", "b"),
                new Answer("2.", "b"),
                new Answer("3.", "c"),
                new Answer("4.", "b"),
                new Answer("5.", "b"),
                new Answer("6.", "c"),
                new Answer("7.", "a"),
                new Answer("8.", "b"),
                new Answer("9.", "b"),
                new Answer("10.", "c")));


        List<Student> students = List.of(student, student2);

        File file = new File("students.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            mapper.writeValue(file, student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
