package Problem15;

public class Course extends BaseEntity {
    public Course(String name) {
        super(name);
    }

    public void showCourse() {
        System.out.println("Course: " + name);
    }
}
