import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the temperature in Fahrenheit " + "between -45ºF and 40ºF: ");
	double temperature = input.nextDouble();
	System.out.print("Enter the wind speed between 5 and 60 miles per hour: ");
	double speed = input.nextDouble();
	double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

	System.out.println("The wind chill index is " + windChill + " degrees Fahrenheit");
	System.out.println("Programmer: Aroonav Pradhan");
	}
		

}
