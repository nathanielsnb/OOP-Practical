package practical.pkg2;

public class UnitConverter {
    public static double inchToCentimeter(double in){
        return in*2.54;
    }
    public static double centimeterToInch(double cm){
        return cm/2.54;
    }
    public static void main(String[] args) {
        
        System.out.printf("%-10s%-20s%-20s%-30s\n", "Inches", "Centimeters","Centimeters","Inches");
        
        for(float i=1,j=5;i<=10&j<=50;i+=1,j+=5){
            System.out.printf("%-10.1f%-20.2f%-20.1f%-30.2f\n",i,inchToCentimeter(i),j,centimeterToInch(j));
        }
    }
}

