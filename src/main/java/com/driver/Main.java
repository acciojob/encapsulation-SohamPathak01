package com.driver;

public class Main {

    public static void main(String[] agrs){
        RWOnly a=new RWOnly("Soham");

        //System.out.print(a.name);
        a.getter();
        a.setter("goku");
        a.getter();
    }
  
}