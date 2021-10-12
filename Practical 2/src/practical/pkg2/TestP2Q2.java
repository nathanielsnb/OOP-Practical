package practical.pkg2;

public class TestP2Q2 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Number", "SquareRoot");
        for (int i=0; i<=20; i+=2){
            System.out.printf("%-10d%-10.4f\n", i, P2Q2.squareRoot(i));
        }
    }
}
