package ProblemG;

import java.util.Scanner;

public class Parent {
    protected int n;


    public Parent(){

    }

    public Parent(int n){
        this.n=n;

    }

    public int setN(int n) {

        this.n = n;

        int factorial=1;
        for (int j=1;j<=n;j++) { //2


            for (int i = 1; i <= j; i++) {

                factorial*=i;

            }
            System.out.println(factorial);


        }
        return  factorial;
    }


}
