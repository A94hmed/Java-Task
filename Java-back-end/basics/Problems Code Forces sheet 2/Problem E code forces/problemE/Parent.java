package problemE;

public class Parent {
    protected int N;
    protected int num;


    //constructor
    Parent() {

    }

    public Parent(int N,int num) {
        this.N = N;
        this.num=num;




    }


    public int setN(int N,int num) {
        this.N = N;
        this.num=num;


        for(int i=0;i<=N;i++) {
            System.out.println(i);
            if (N > this.num) {
                this.num=N;
                System.out.println(this.num);

            }
        }
        return this.num;
}



}
