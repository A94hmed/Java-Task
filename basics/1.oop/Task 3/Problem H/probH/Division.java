package probH;

public class Division {
    private double A;
    private double B;

    //constructor

    Division(){

    }

    Division(double A, double B){
        this.A=A;
        this.B=B;
    }

public double setDivide(){
        return A/B;
}

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }
}
