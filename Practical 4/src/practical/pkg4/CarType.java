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
public class CarType {
       String make, model;
       double capacity;
       
public CarType (String make, String model, double capacity) {
      this.make = make;
      this.model = model;
      this.capacity = capacity;
}

public String toString() {
    return String.format("%-10s%-11s%-9s", make, model, capacity);
}
}
