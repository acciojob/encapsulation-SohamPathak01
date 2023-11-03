package com.driver;

public class RWOnly {

     private String name;

    public RWOnly(){

        this.name="";
    }

    public void setName(String s){
        this.name=s;
    }
    public String getName(){
        return name;
    }
    
}
