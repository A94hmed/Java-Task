package Packdge2;

public class Teacher {
protected int id;
protected String name;
boolean active;

public Teacher(int id, String name,boolean active){
    this.id=id;
    this.name=name;
    this.active=active;

}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void showALL(){
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("ACTIVE: "+active);
    }


}
