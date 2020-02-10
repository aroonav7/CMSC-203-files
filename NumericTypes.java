//Task #3
/*import java.util.Scanner;
public class NumericTypes
{
   public static void main (String [] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   //identifier declarations
       final int NUMBER = 2 ;       // number of scores
      
       final double SCORE1 = 100;      
       final double SCORE2 = 95;      
       final int BOILING_IN_F = 212;         
   
       double fToC;           // temperature in celsius
       double average;           // arithmetic average
       String output;           // line of output to print out
      
       // Error correction1:
       //average=(score1+score2)/number
       average = (SCORE1 + SCORE2)/ NUMBER;
       output = SCORE1 + " and " + SCORE2 + " have an average of "
               + average;
       System.out.println(output);

       // Convert Fahrenheit temperatures to Celsius
       //Change the values of 9 and 32 to double type
       // by writing as 9.0 and 32.0 that becomes as double types
       fToC = 5/9.0 * (BOILING_IN_F - 32.0);
       output = BOILING_IN_F + " in Fahrenheit is " + fToC
               + " in Celsius.";
       System.out.println(output);
   }
}
*/

//Task #1 and #2.
/*The java program that prompts the user to enter
* the score1 and score2 and find the average
* value and print the average and prompts
* the user to enter the celcius and convert
* to the fahrenheit */
//NumericTypes.java

import java.util.Scanner;
public class NumericTypes
{
   public static void main (String [] args)
   {
	   Scanner keyboard = new Scanner(System.in);
	   //identifier declarations
       final int NUMBER = 2 ;       // number of scores
      
       double SCORE1 = 100;      
       double SCORE2 = 95;      
       final int BOILING_IN_F = 212;         
   
       double fToC;           // temperature in celsius
       double average;           // arithmetic average
       String output;           // line of output to print out
  
  System.out.println("Enter SCORE1: ");
//read score1 from user and convert the string to integer
//using Integer.parseInt method
SCORE1 = keyboard.nextDouble();


System.out.println("Enter SCORE2: ");
//read score1 from user and convert the string to integer
//using Integer.parseInt method
SCORE2 = keyboard.nextDouble();

// Find an arithmetic average
average = (SCORE1 + SCORE2 )/ NUMBER;

output = SCORE1 + " and " + SCORE2 + " have an average of "
        + average;
System.out.println(output);

// Convert Fahrenheit temperatures to Celsius
fToC = 5/9.0 * (BOILING_IN_F - 32.0);
output = BOILING_IN_F + " in Fahrenheit is " + fToC
        + " in Celsius.";

System.out.println(output);

//declare a celcius
double celcius;
System.out.println("Enter temperature in Celsius");

celcius = keyboard.nextDouble();

//Convert celcius to the fahrenheit
double cToF=celcius *(9/5.0) + 32.0;

output = celcius + " in Celsius is " + cToF
        + " in Fahrenheit";

//print celcius temperature to fahrenheit
System.out.println(output);
System.out.println("Goodbye"); // to show that the program is ended
}   //end of the main method

}//end of the class


   