package prob3;

public class Application {
    private Integer num1;
    private Integer num2;
    private Integer num3;

    public void setNum1(int num1) {

        if (num1 % 2 == 0) {
            this.num1 = num1;
        } else {
            System.out.println("Invalid");

        }

    }
    public void setNum2(int num2){
        if(num2%2==0){
            this.num2 = num2;
        }
        else{
            System.out.println("Invalid");

        }

}
    public void setNum3(int num3) {
        if (num3 % 2 == 0) {
            this.num3 = num3;
        } else {
            System.out.println("Invalid");

        }
    }

    public int getsum() {
        return num1+num2+num3;
    }

    void print(){
        System.out.println("num1: " +num1);
        System.out.println("num2: " +num2);
        System.out.println("num3: " +num3);
    }
}