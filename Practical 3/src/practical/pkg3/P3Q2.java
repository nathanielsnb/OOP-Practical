/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;

/**
 *
 * @author Nathaniel
 */
public class P3Q2 {
    public static int min(int[] arr) {
        int ptr = 0; int min = 0;
        for(int i = 0; i < arr.length; i++) {
            int buffer = min;
            min = Math.min(arr[i], min);
            if(buffer != min) {
                ptr = Math.max(i, ptr);
            }
        }
        return ptr;
    }
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 4, 5, 10, 100, 2, -22, 4, -22};
        int index = min(list);
        System.out.println(index);
    }
}