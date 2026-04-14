package com.java;

public class App {
    private Integer num;
    private String name;

    public void setNumber(int num){
        if(num>0){
            this.num=num;

        }else{
            System.out.println("invalid");
        }
    }

    public void setName(String name){
        if(name.length()>5){
            this.name=name;

        }else{
            System.out.println("invalid name");
        }

    }
    public int getNumber(){
        return num;

    }
    public String getName(){
        return name;

    }

    void print(){
        System.out.println("number : "+num);
        System.out.println("name : "+name);

    }

}
