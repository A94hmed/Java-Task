package outsidepackdge;





import Packdge1.Student;
import Packdge2.Teacher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);


      //Student
        System.out.println("Student: ");
      System.out.println("Enter ID: ");
      int s =scanner.nextInt();
        System.out.println("Enter NAME: ");
        String n=scanner.next();

        Student student=new Student(s,n,2);

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println("---------------------");
        //Teacher
        System.out.println("Teacher: ");
        System.out.println("Enter ID: ");
        int st =scanner.nextInt();
        System.out.println("Enter NAME: ");
        String nt=scanner.next();

        Teacher teacher=new Teacher(st,nt,true);

        System.out.println(teacher.getId());
        System.out.println(teacher.getName());

    }
}