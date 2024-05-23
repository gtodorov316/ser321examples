import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */


public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public Fraction(int numerator, int denominator){
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public void print() {
      System.out.print(numerator + "/" + denominator + " = " + numerator / denominator);
	  
   }

   public void setNumerator(int n){
      numerator = n;
   }

   public void setDenominator(int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         int numerator, denominator =0;

         // Parse command line arguments
         if (args.length == 2) {
            numerator = Integer.parseInt(args[0]);
            denominator = Integer.parseInt(args[1]);
		} else if (args.length == 1){
            numerator = Integer.parseInt(args[0]);
         } else {
            // Default values
            numerator = 1;
            denominator = 3;
         }

         // Create a new instance of Fraction
         Fraction frac = new Fraction(numerator, denominator);

         // Print the fraction
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}

  
    
