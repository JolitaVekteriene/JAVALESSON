package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInfo {
    public static void main(String[] args) {
ReadFileInfo mainAnswers = new ReadFileInfo();
mainAnswers.BufferedReader();
    }

    public void BufferedReader(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("exams.json"))) {
            String line;
            while ((line = bufferedReader.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
