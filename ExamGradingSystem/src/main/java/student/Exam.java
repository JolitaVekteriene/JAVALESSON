package student;

public class Exam {
    private final int id;
    private final String name;
    private final String type;
    private final String questions;
    private final String answers;

    public Exam(int id, String name, String type, String questions, String answers) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.questions = questions;
        this.answers = answers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exam{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", questions='").append(questions).append('\'');
        sb.append(", answers='").append(answers).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
