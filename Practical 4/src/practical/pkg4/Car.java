/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg4;

/**
 *
 * @author Nathaniel
 */
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
