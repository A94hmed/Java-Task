package probk;

public class ChildMax extends Parent{


    //constructor
    ChildMax(){

    }
    ChildMax(int A, int B,int C){
    super(A,B,C);

    }
    public int checkMax() {
        int a = getA();
        int b = getB();
        int c = getC();
        int max=a;

        if(b>max){
            max=b;
        }

        if(c>max){
            max=c;
        }
        return max;



    }
}
