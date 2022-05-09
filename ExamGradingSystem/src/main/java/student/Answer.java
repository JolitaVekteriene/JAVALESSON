package student;

public class Answer {
    private String number;
    private String answer;

    public Answer() {
    }

    public Answer(String number, String answer) {
        this.number = number;
        this.answer = answer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
