package com.java;

public class Difference {
    private int A;
    private int B;
    private int C;
    private int D;


//constructor
    Difference(){

    }

    Difference(int A,int B,int C,int D){
        this.A=A;
        this.B=B;
        this.C=C;
        this.D=D;
    }





    void print() {
        System.out.println("Difference : " +((A * B)-(D*C)));
    }


}
