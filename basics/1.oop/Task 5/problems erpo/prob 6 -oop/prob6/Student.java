package prob6;

public class Student {
    private Integer id;
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    void print(){
        System.out.println("id :" +id);
        System.out.println("name :" +name);
    }
}
