package probk;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A: ");
        int x= scanner.nextInt();
        System.out.println("Enter B: ");
        int y= scanner.nextInt();
        System.out.println("Enter C: ");
        int z= scanner.nextInt();


        Parent parent=new Parent();
        ChildMax childMax=new ChildMax(x,y,z);
        ChildMin childMin=new ChildMin(x,y,z);

        childMax.checkMax();
        childMin.checkMin();

        System.out.println(childMin.checkMin()+" "+childMax.checkMax());


    }
}