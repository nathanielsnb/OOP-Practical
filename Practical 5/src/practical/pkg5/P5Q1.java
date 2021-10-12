
package practical.pkg5;

import java.util.Scanner; 

public class P5Q1 {
    public static int countLetter(String str, char ch){
        int count=0;
        for(int i=0; i<str.length();i++){
            if(Character.toUpperCase(str.charAt(i))==Character.toUpperCase(ch)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       
       System.out.print("Enter a word: ");
       String word = scan.nextLine();
       
       System.out.print("Enter the letter you want to count: ");
       char letter= scan.nextLine().charAt(0);
       
       int countLetter = countLetter(word,letter);
       System.out.println(word + " contains " + countLetter + letter);
    } 
}