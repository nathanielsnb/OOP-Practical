/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg7;

/**
 *
 * @author Nathaniel
 */
public class TestCircleRadius {
    public static void main(String[] args) {
        ComparableCircle circle1=new ComparableCircle(25);
        ComparableCircle circle2=new ComparableCircle(10);
        
        //compareTo Method
        if(circle1.compareTo(circle2)==1){
            System.out.println("The larger circle radius is " + circle1.getRadius());
        }else if(circle1.compareTo(circle2)>-1){
            System.out.println("The larger circle radius is " + circle2.getRadius());
        }else{
            System.out.println("Both circle have the same radius " + circle1.getRadius());
        }
        
        //message color
        circle1.howToColor();
    }
}