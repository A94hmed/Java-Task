package ProblemJ;

public class Primes {
    int n;

    public void setN(int n) {
        this.n = n;

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("Not prime number");
            }else{
                System.out.println("prime number");

            }
        }

    }
}
