package practical.pkg4;

public class Car {
     private String plateNo;
     private String color;
     private int year;
     private CarType carType;


public Car (String plateNo, String color, int year, CarType carType) {
      this.plateNo = plateNo;
      this.color = color;
      this.year = year;
      this.carType = carType;
}


public String toString() {
      return String.format("%-13s%-10s%-10s%-9s", plateNo, color, year, carType.toString());
    }
}
