package ProblemB;

public class Even {
    int n;
Even(){

}
Even(int n){
    this.n=n;
}
    void print() {

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
        if(n%2!=0){
            System.out.println(-1);
            return;
        }
    }
}
