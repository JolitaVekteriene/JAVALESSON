package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class QuestionMain {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<Exam> exams = List.of(new Exam("Sudetis", Tipas.TESTAS, "456", List.of(
                        new Question("1. Kiek bus 2 + 2?", List.of("a. 4", "b. 2", "c. 3"), "a"),
                        new Question("2. Kiek bus 2 + 3?", List.of("a. 4", "b. 5", "c. 3"), "b"),
                        new Question("3. Kiek bus 2 + 4?", List.of("a. 4", "b. 2", "c. 6"), "c"),
                        new Question("4. Kiek bus 2 + 5?", List.of("a. 4", "b. 7", "c. 3"), "b"),
                        new Question("5. Kiek bus 2 + 6?", List.of("a. 4", "b. 8", "c. 3"), "b"),
                        new Question("6. Kiek bus 2 + 7?", List.of("a. 4", "b. 2", "c. 9"), "c"),
                        new Question("7. Kiek bus 2 + 8?", List.of("a. 10", "b. 2", "c. 3"), "a"),
                        new Question("8. Kiek bus 2 + 9?", List.of("a. 4", "b. 11", "c. 3"), "b"),
                        new Question("9. Kiek bus 2 + 10?", List.of("a. 4", "b. 12", "c. 3"), "b"),
                        new Question("10. Kiek bus 2 + 11?", List.of("a. 4", "b. 2", "c. 13"), "c"))),
                new Exam("Daugyba", Tipas.TESTAS, "789", List.of(
                        new Question("1. Kiek bus 2 x 2?", List.of("a. 4", "b. 2", "c. 3"), "a"),
                        new Question("2. Kiek bus 2 x 3?", List.of("a. 4", "b. 6", "c. 3"), "b"),
                        new Question("3. Kiek bus 2 x 4?", List.of("a. 4", "b. 2", "c. 8"), "c"),
                        new Question("4. Kiek bus 2 x 5?", List.of("a. 10", "b. 2", "c. 3"), "a"),
                        new Question("5. Kiek bus 2 x 6?", List.of("a. 4", "b. 12", "c. 3"), "b"),
                        new Question("6. Kiek bus 2 x 7?", List.of("a. 14", "b. 2", "c. 3"), "a"),
                        new Question("7. Kiek bus 2 x 8?", List.of("a. 4", "b. 16", "c. 3"), "b"),
                        new Question("8. Kiek bus 2 x 9?", List.of("a. 4", "b. 2", "c. 18"), "c"),
                        new Question("9. Kiek bus 2 x 10?", List.of("a. 4", "b. 20", "c. 3"), "b"),
                        new Question("10. Kiek bus 2 x 11?", List.of("a. 4", "b. 22", "c. 3"), "b"))));


        File file = new File("exams.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            mapper.writeValue(file, exams);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

