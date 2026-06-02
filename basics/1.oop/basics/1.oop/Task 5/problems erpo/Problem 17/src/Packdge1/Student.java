package Packdge1;

public class Student {

    protected int id;
   protected String name;
      int grade;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void showAll() {

        System.out.println("ID: "+ id);
        System.out.println("NAME: "+ name);
        System.out.println("GRADE: "+ grade);

    }








}
