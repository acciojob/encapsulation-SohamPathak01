package com.driver;

public class Main {

    public static void main(String[] agrs){
        RWOnly a=new RWOnly();

        //System.out.print(a.name);
        //'name' has private access in 'com.driver.RWOnly'
        System.out.println(a.getName());
        a.setName("goku");
        System.out.println(a.getName());
    }
  
}