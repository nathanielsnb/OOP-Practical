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
public class Owner {
    private String name;
    private String ic;

public Owner(String name, String ic) {
     this.name = name;
     this.ic = ic;
}

public String getName() {
       return name;
}

public String getIC() {
       return ic;
}
public String toString() {
       return  String.format("%-14s%-13s", name, ic);
    }
}
