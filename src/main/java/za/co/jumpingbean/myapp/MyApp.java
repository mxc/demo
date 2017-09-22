/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jumpingbean.myapp;

/**
 *
 * @author mark
 */
public class MyApp {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println("=============");
        System.out.println("5+2");
        System.out.println(app.addInt(5,2));
        System.out.println("==============");
    }
    
    public int addInt(int a,int b){
        return a+b;
    }
    
}
