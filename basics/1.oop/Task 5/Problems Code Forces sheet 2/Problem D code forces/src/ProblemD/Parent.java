package ProblemD;

public class Parent {
   protected int x;

    //constructor
    public Parent(){

    }
    public Parent(int x){
        this.x=x;

    }

    public boolean getX(int x) {
        this.x = x;


            if (x == 1999) {
                System.out.println("Correct");

             return  true;
            } else {
                System.out.println("Wrong");
                return false;
        }

        }
    }

