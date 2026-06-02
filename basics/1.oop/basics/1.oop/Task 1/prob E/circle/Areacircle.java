package circle;

public class Areacircle {
    private double r;
    private double pi= 3.141592653;


    //constructor
    Areacircle(){

    }
    Areacircle(double r ,double pi){
        this.r=r;
        this.pi=pi;
    }

    double circle(){
        return pi*r*r;

    }

    void print(){
        System.out.println("Area :"+circle());
    }








}
