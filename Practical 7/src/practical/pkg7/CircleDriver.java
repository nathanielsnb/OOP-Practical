
package practical.pkg7;

public class CircleDriver {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(2.5);
        ComparableCircle c2=new ComparableCircle(1.5);

        if(c1.compareTo(c2)==0){
            System.out.println("Same");
        }else if(c1.compareTo(c2)>0){
            System.out.println("c1 greater than c2");
        }else{
            System.out.println("c1 less than c2");
        }
        c1.howToColor();
    }
}
