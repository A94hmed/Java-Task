package probk;

public class ChildMin extends Parent{


    //constructor

    ChildMin(){

    }
    ChildMin(int A,int B,int C){
        super(A,B,C);
    }

    public int checkMin(){
        int a=getA();
        int b =getB();
        int c=getC();
        int min=a;

        if(b<min){
            min=b;
        }

        if(c<min){
            min=c;
        }


        return min;





    }




}
