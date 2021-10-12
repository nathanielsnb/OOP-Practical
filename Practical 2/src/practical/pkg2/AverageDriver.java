package practical.pkg2;

public class AverageDriver {
    public static void main(String[] args) {
        
        double average1=Average.calculateAverage(5,3);
        System.out.println("Average of 5 and 3 = "+average1);
        
        double average2=Average.calculateAverage(4.4,3.2);
        System.out.println("Average of 4.4 and 3.2 = "+average2);
        
        double average3=Average.calculateAverage(3,9,8);
        System.out.println("Average of 3, 9 and 8 = "+average3);
        
        double average4=Average.calculateAverage(2.2,7.8,9.4);
        System.out.println("Average of 2.2, 7.8 and 9.4 = "+average4);
    }
}

