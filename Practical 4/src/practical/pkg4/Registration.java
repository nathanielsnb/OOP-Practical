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
public class Registration{
    private int regNo;
    private Owner owner;
    private Car car;
    private static int nextRegNo = 1001;


public Registration (Owner owner, Car car) {
    this.regNo = nextRegNo++;
    this.owner = owner; 
    this.car = car;	
}

public static int getnextRegNo() {
    return nextRegNo;
}


public String toString() {
    return String.format("\n%-10s%-10s%-10s", regNo, owner.toString(), car.toString());
}
}