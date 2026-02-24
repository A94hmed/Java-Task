package prob7;

public class Player {
    private Integer id;
    private String name;
    private Integer number;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    void printPlayer(){
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.out.println("number :"+number);
    }
}
