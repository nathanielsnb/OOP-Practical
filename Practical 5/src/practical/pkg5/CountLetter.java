/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg5;

/**
 *
 * @author Nathaniel
 */

public class CountLetter {
    public static int countLetter(String str, char ch) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
        if(str.charAt(i) == ch)
        count++;
        }
      
        return count;
    }
}
