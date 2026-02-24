package prob5;

public class Student {
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    void printStudent(){
        System.out.println("Age :" +age);
    }
}
