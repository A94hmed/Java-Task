package com.java;

public class BasicDataTypes {
    int i;
    long l;
    char c;
    float f;
    double d;
  //constructor
    BasicDataTypes(){

    }
    BasicDataTypes(int i,long l,char c,float f,double d){
        this.i=i;
        this.l=l;
        this.c=c;
        this.f=f;
        this.d=d;
    }

    void print(){
        System.out.println("int : " +i);
        System.out.println("long : " +l);
        System.out.println("char : " +c);
        System.out.println("float  : " +f);
        System.out.println("double  : " +d);
    }
}
