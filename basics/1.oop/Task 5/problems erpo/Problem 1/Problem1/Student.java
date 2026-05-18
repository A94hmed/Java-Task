package Problem1;

public class Student extends Parent {

    private int id;
    private String name;
    private int age;


    Student(){

    }

    Student(int id,String name,int age) {
        this.id = id;
        this.name=name;
        this.age=age;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void  print(){
        System.out.println("id: " +id);
        System.out.println("name: "+name);
        System.out.println("Age: "+age);
    }


}
