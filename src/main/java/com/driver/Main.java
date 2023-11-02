package com.driver;

public class Main {

    public static void main(String[] agrs){
        RWOnly a=new RWOnly("Soham");

        //System.out.print(a.name);
        //'name' has private access in 'com.driver.RWOnly'
        a.getName();
        a.setName("goku");
        a.getName();
    }
  
}