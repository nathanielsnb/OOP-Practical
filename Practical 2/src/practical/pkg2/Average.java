/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;

/**
 *
 * @author Nathaniel
 */
public class Average { //calculate methods
    public static double calculateAverage(int num1,int num2){
        return ((num1 + num2)/2.0);
    }
    public static double calculateAverage(int num1, int num2, int num3){
        return ((num1 + num2 + num3)/3.0);  
    }
    public static double calculateAverage(double num1, double num2){
        return ((num1 + num2)/2);
    }
    public static double calculateAverage(double num1, double num2, double num3){
        return ((num1 + num2 + num3)/3);
    }
    
    public static void main(String[] args) {
        System.out.println(calculateAverage(4,5)); 
        System.out.println(calculateAverage(6,8,9));
        System.out.println(calculateAverage(3.2,5.12)); 
        System.out.println(calculateAverage(7.19,1.11,5.30)); 
}
}

