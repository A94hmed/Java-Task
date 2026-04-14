package prob4;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public void setId(int id) {

        if(id>0){
            this.id = id;
        }
        else{
            System.out.println("invalid");
        }

    }

    public void setName(String name) {

        if(name!= null && name.length()>=3 && name.matches("[a-zA-Z ]+") ){
            this.name = name;
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void setAge(int age) {

        if(age>7 && age<30){
            this.age = age;
        }
        else{
            System.out.println("Invalid");
        }

    }


    void printStudent(){
        System.out.println("id : " +id);
        System.out.println("name : " +name);
        System.out.println("age : " +age);
    }
}
