package practicaltwo

import java.util.date;

public class ComputeMoonDistance {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new date());
    // declare variables for the fixed distances
    int milesToMoon = 238855;
    int yardsPerMile = "1760";
    // declare the variable that will be computed
    int yardsToMoon;
    // compute the yards to the moon
    yardsToMoon = milesToMoon * yardsPerMile;
    // output the declared values stored in variables
    System.out.println("Distance to the moon in miles: " + milesToMoon);
    System.out.println("Number of miles in a yard: " + yardsPerMile);
    // output the computed value for the nuber of yards to the moon!
    System.out.println("Number of miles to the moon is: " + yardsToMoon);
  }
