package ProblemK;

public class Parent {
    private int n;
    Parent(){

    }

    Parent(int n){
        this.n=n;
    }

    public int setN(int n) {
        this.n = n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);

            }

        }
        return n;

    }
}


