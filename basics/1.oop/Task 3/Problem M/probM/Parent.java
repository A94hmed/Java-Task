package probM;

public class Parent {
    private char x;
    //constructor
    Parent(){

    }
    Parent(char x){
      this.x=x;
    }


    public void check(){
        char c=getX();

        if(c>=48 && c<=57){
            System.out.println("IS DIGIT");

        }else if (c >= 65 && c <= 90) {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        } else if (c >= 97 && c <= 122) {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }else{
            System.out.println("Not Valid");
        }

        }

    public char getX() {
        return x;
    }
    }

