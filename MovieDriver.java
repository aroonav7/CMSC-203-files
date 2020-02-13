import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        char ch = 'y';
while(ch == 'y')
{
Movie m = new Movie();
System.out.println("Enter the name of the movie : ");
String title = keyboard.nextLine();
m.setTitle(title); //setting title

System.out.println("Enter the rating of the movie : ");
String rating = keyboard.next();
m.setRating(rating); //setting rating

System.out.println("Enter the number of tickets sold for this movie : ");
int noOfTickets = keyboard.nextInt();
m.setSoldTickets(noOfTickets); //setting no of tickets

System.out.println(m.toString());

System.out.println("Do you want to enter another movie?(y or n)");
ch = keyboard.next().charAt(0);
keyboard.nextLine(); //for line feed

}

System.out.println("Goodbye!");


   }

}
