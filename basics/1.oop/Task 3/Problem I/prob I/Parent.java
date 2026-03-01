package probi;

public class Parent {

    private int A;
    private int B;

    //constructor
    Parent(){

    }
    Parent(int A,int B){

        this.A=A;
        this.B=B;
    }

    public  void setParent(){

        if(A>=B){
            System.out.println("yes");
        }else {
            System.out.println("NO");
        }

    }

    public boolean getAB() {
        return A>=B;
    }



}
