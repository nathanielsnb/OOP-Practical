package practical.pkg4;

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
