package com.driver;

public class RWOnly {

     private String name;

    public RWOnly(String name){
        this.name=name;
    }

    public void setName(String s){
        this.name=s;
    }
    public void getName(){
        System.out.println(name);
    }
    
}
