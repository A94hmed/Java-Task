package problemO;

public class Parent {
    private  int n;
    Parent(){

    }

    public void setN(int n) {
        this.n = n;

        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
