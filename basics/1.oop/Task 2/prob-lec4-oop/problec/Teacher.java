package problec;

public class Teacher {
    private Long id;
    private String name;
    private Float age;
    private String phoneNumber;
    private Float salary;

    public void setId(long id) {

        if(id >0){
            this.id = id;
        }else{
            System.out.println("Invalid");
        }
    }

    public void setName(String name) {

        if( name != null && name.length()>=3 && name.matches("[a-zA-Z0-9]+")){
            this.name = name;
        }else{
            System.out.println("not name");
        }
    }

    public void setAge(float age) {

        if(age>=25 && age<=60){
            this.age = age;
        }else{
            System.out.println("Invalid");
        }

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

        if (phoneNumber != null
                && phoneNumber.matches("\\+20\\d{10}")) {

            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    public void setSalary(float salary) {


        if(salary>=3000){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid");
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }






}
