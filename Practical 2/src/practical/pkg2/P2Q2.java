/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg2;

/**
 *
 * @author Nathaniel
 */
public class P2Q2 {
    public static double squareRoot(double x){
        double l, u; // lower and upper limit
        double m; // midpoint
        double m2;// midpoint square
        
        if (x < 0) {
	  System.out.print( "Error: square root of negative number\n");
	  System.exit(1);
	}
        if (x == 0)
	   return 0;
        else if (x < 1.0) {
	  l = x;
	  u = 1.0;
	} else if (x > 1.0) {
	  l = 1.0;
	  u = x;
        } else
          return 1;
        
        while ((u - l) / l >= 1.0e-8) {
            m = (l + u) / 2.0;
            m2 = m * m;
            if (m2 > x)
              u = m;
            else
              l = m;
	}
        return (l + u) / 2.0;
    }

}