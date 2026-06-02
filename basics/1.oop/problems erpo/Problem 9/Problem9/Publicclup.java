package Problem9;

public class Publicclup extends Player{

    Publicclup(){

    }
    Publicclup(String n,int a){
        super(n,a);
    }


    @Override
    void print() {
        System.out.println("Publicclup");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
