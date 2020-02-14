
	import java.util.Scanner;
	/**
	 * The purpose of this class is to model a television.
	 * @author pradhanaroonav
	 * 02/13/2020
	 */

	public class TelevisionDemo {
	   public static void main(String[] args) {
	       // Create a Scanner object to read from the keyboard
	       Scanner keyboard = new Scanner(System.in);

	       // Declare variables
	       int station; // The user's channel choice

	       // Declare and instantiate a television object
	       Television bigScreen = new Television("Toshiba", 55);

	       // Turn the power on
	       bigScreen.power();

	       // Display the state of the television
	       System.out.println("A " + bigScreen.getScreenSize() + " inch "
	               + bigScreen.getManufacturer() + " has been turned on.");

	       // Prompt the user for input and store into station
	       System.out.print("What channel do you want? ");
	       station = keyboard.nextInt();

	       // Change the channel on the television
	       bigScreen.setChannel(station);
	       // Increase the volume of the television
	       bigScreen.increaseVolume();

	       // Display the the current channel and
	       // volume of the television
	       System.out.println("Channel: " + bigScreen.getChannel() + " Volume: "
	               + bigScreen.getVolume());
	       System.out.println("Too loud! I am lowering the volume.");

	       // Decrease the volume of the television
	       bigScreen.decreaseVolume();
	       bigScreen.decreaseVolume();
	       bigScreen.decreaseVolume();
	       bigScreen.decreaseVolume();
	       bigScreen.decreaseVolume();
	       bigScreen.decreaseVolume();

	       // Display the the current channel and
	       // volume of the television
	       System.out.println("Channel: " + bigScreen.getChannel() + " Volume: "
	               + bigScreen.getVolume());

	       System.out.println(); // For a blank line

	       // HERE IS WHERE YOU DO TASK #5
	       
	       // Instantiate portable to be a Sharp 19 inch television.
	       Television television = new Television("Sharp", 19);

	       // Use a call to the method to turn the power on.
	       television.power();
	       // Use calls to the accessor methods to print what television was turned
	       // on.
	       System.out.println("A " + television.getScreenSize() + " inch "
	               + television.getManufacturer() + " has been turned on.");
	       // Use calls to the mutator methods to change the to the user’s
	       // preference and decrease the by two.
	       television.decreaseVolume();
	       television.decreaseVolume();

	       // Use calls to the accessor methods to print the changed state of the
	       // portable.
	       // Prompt the user for input and store into station
	       System.out.print("What channel do you want? ");
	       station = keyboard.nextInt();

	       // Change the channel on the television
	       television.setChannel(station);
	       // Display the the current channel and
	       // volume of the television
	       System.out.println("Channel: " + television.getChannel() + " Volume: "
	               + television.getVolume());

	   }
	}

