package probG;

public class Parent {
    private int n;


    public void setN(int n) {


        if(n>0){
            this.n = n;
        }else{
            System.out.println("Invalid");
        }
    }



    public int getN() {
        return n;
    }

    public int result(){
        int sum=0;
        for(int i=1;i<=getN();i++){
            sum+=i;
        }
        return sum;

    }

    public void print(){
        System.out.println("sum: "+result());
    }


}
