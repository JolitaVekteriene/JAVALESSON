package student;

import java.util.List;

public class Student {
    private String studentId;
    private String examId;
    private List<Answer> answer;

    public Student() {
    }

    public Student(String studentId, String examId, List<Answer> answer) {
        this.studentId = studentId;
        this.examId = examId;
        this.answer = answer;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}