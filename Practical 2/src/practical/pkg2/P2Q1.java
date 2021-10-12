package practical.pkg2;

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
