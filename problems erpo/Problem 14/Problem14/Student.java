package Problem14;

public class Student extends BaseEntity{

    String grade;
    String subject;
    String assignment;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getGrade() {
        return grade;
    }

    public String getAssignment() {
        return assignment;
    }

    public String getSubject() {
        return subject;
    }
}
