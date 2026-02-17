package SayHello;

public class Hello {
  private String name;

    //constructor
    Hello(){

    }
    public Hello(String name )
    {
        this.name=name;
    }

    void print(){
        System.out.println( "Hello, " + name);
    }



}
