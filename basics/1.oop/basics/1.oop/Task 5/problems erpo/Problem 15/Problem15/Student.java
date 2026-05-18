package Problem15;

public class Student extends BaseEntity{

    private Course[] courses = new Course[2];

    public Student(String name) {
        super(name);
    }

    public void addCourse(Course c1, Course c2) {
        courses[0] = c1;
        courses[1] = c2;
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        System.out.println("Courses: ");
        System.out.println(courses[0].getName());
        System.out.println(courses[1].getName());
    }
}
