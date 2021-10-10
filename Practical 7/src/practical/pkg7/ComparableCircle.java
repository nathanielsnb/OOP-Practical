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
public class ComparableCircle extends Circle implements Comparable,Colorable {

    public ComparableCircle(double radius) {
        super(radius);
    }
    
    public void howToColor() {
        System.out.println("Color the edge");
    }   
    
    //USE COMPARETO IS NOT SUITABLE
     public int compareTo(Object o){
        ComparableCircle temp = (ComparableCircle)o;
        
        if(this.getRadius() > (temp.getRadius())){
            return 1;
        }else if(this.getRadius() < (temp.getRadius())){
            return -1;
        }else{
            return 0;
        }    
   } 


     
}
