package com.driver;

public class RWOnly {

     private String name;

    public RWOnly(String name){
        this.name=name;
    }

    public void setter(String s){
        this.name=s;
    }
    public void getter(){
        System.out.println(name);
    }
    
}
