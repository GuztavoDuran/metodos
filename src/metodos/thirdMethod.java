
package metodos;
import java.util.Scanner;
/**
 * @author Gustavo
 */
public class thirdMethod {
    
    public void message(){
        System.out.println("SITEMAS NUMERICOS   ");
    }
    
    public void convertidor(){
        // Read the conversion choice from the user
      System.out.println("Choose 1 or 2 or 3:");

      System.out.println("1: conversion from base 10 to base 2 ");

      System.out.println("2: conversion from base 10 to base 8");

      System.out.println("3: conversion from base 10 to base 16");
      // do you want 1, 2 , or 3? you have your choice
      Scanner in = new Scanner(System.in);

      int choice = in.nextInt();

      String string = in.nextLine();

      // Read in the number to be converted and do the conversion

      String output= "";

      System.out.println("Please enter the number to be converted:");

      int input = in.nextInt();

      if (choice == 1)
      // if the user chooses choice #1, it will convert from base 10 to base 2
          output = Integer.toString(input, 2);

      else if (choice == 2)

          output = Integer.toString(input, 8);

     // if the user chooses choice #2, it will convert from base 10 to base of 8 
    else if (choice == 3)

          output = Integer.toString(input, 16);
    // if the user chooses choice #3, it will convert from base 10 to base 16
    else

      System.out.println("invalid entry");
      // everything else, it is invalid
      System.out.println("final output = " + output);
      // this prints the final output. 
      System.out.println("");
    }
    
    
}
