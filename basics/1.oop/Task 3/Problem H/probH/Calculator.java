package probH;

public class Calculator extends Division{

    public Calculator(double A, double B) {
        super(A, B);
    }

    void print(){
        double res=super.setDivide();


        System.out.println("Floor : "+(int)super.getA() + " / "+(int)super.getB() + " = "+(int)Math.floor(res));
        System.out.println("Ceil " + (int)super.getA() + " / " + (int)super.getB() + " = " + (int)Math.ceil(res));

        System.out.println("Round " + (int)super.getA() + " / " + (int)super.getB() + " = " + Math.round(res));

    }







}
