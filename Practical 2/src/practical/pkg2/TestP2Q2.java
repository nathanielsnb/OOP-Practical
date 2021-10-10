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

public class TestP2Q2 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Number", "SquareRoot");
        for (int i=0; i<=20; i+=2){
            System.out.printf("%-10d%-10.4f\n", i, P2Q2.squareRoot(i));
        }
    }
}
