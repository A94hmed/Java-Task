package problemA;

public class Person {
    protected int n;


    //constructor
Person(){

}
    Person(int n){
     this.n=n;
    }

    public void setN(int n) {
        this.n = n;
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;

            System.out.println( i);

        }


    }
}
