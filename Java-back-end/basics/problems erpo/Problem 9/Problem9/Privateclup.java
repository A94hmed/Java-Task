package Problem9;

public class Privateclup extends Player{

    Privateclup(){

    }

    Privateclup(String n,int a){
        super(n,a);
    }

    @Override
    void print() {
        System.out.println("Privateclup");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
