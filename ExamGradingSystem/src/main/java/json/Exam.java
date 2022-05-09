package json;

import java.util.List;

public class Exam {
    private String name;
    private Tipas tipas;
    private String id;
    private List<Question> question;

    public Exam() {
    }

    public Exam(String name, Tipas tipas, String id, List<Question> question) {
        this.name = name;
        this.tipas = tipas;
        this.id = id;
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tipas getTipas() {
        return tipas;
    }

    public void setTipas(Tipas tipas) {
        this.tipas = tipas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }
}
