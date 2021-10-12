package practical.pkg7;

public class ComparableCircle extends Circle implements Comparable,Colorable {

    public ComparableCircle(double radius) {
        super(radius);
    }
    
    public void howToColor() {
        System.out.println("Color the edge");
    }   
    
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
