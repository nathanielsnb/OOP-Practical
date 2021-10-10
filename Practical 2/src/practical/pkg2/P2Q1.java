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
public class P2Q1 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("%-10s%-10s\n", "Number", "SquareRoot");
        for(int i=0; i<=20; i+=2) {
            System.out.printf("%-10d%-10.4f\n", i, Math.sqrt(i));
        }
        //Implicit casting (auto)
        //- smaller data type is coverted into a larger data type
        //Explicit casting (manual)
        //- larger data type is converted into a smaller data type
        //E.g int a= (int)5.3; // a = 5
    }
}
