package com.java;

public class Calculator {
   private int x;
   private int y;

//constructor
    Calculator(int x ,int y){
        this.x=x;
        this.y=y;
    }

    void sum(){
        System.out.println("sum : "+  (x+y));



    }

    void sub(){
        System.out.println("substract : "+ (x-y));
    }

    void multiple(){
        System.out.println("multiply : "+  (x*y));
    }



}
