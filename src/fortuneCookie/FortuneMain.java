//This is a virtual fortune cookie app
package fortuneCookie;
import java.util.*;

public class FortuneMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
System.out.println("Welcome to the Fortune Cookie Depot!");
System.out.println("How many fortune cookies would you like to purchase?(1-3):");
int numberOfFortunes = scan.nextInt();
System.out.println("Thank you for your purchase of " + numberOfFortunes + " fortune cookies!");
System.out.println("Your fortunes are as follows:");
String [] fortune = new String [9];
fortune [0] = "You will live a long life!";
fortune [1] = "You will be very successful!";
fortune [2] = "You will have many children!";
fortune [3] = "You will meet your soulmate soon!";
fortune [4] = "You will get a raise at work!";
fortune [5] = "You will grow 2 inches this year!";
fortune [6] = "You will win tickets to the Super Bowl!";
fortune [7] = "You will buy more fortune cookies soon!";
fortune [8] = "You will be famous java programmer";
getFortune(numberOfFortunes, fortune);

	}

	/**
	 * @param numberOfFortunes
	 * @param fortune
	 */
	public static void getFortune(int numberOfFortunes, String[] fortune) {
		Random generator = new Random();
		int randomIndex = generator.nextInt(fortune.length);
		for(int i=0;i<numberOfFortunes;i++)
		System.out.println( fortune[randomIndex*i]);
	}
}
