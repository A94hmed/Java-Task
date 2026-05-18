package ProblemF;

public class Multiplication {
    int n;


    public void setN(int n) {
        this.n = n;
        int z=1;
        for(int i=1;i<=n;i++) {//i=i+1
            z = i * n;

            System.out.println(n + "*" + i + "=" + z);
        }
    }
}
