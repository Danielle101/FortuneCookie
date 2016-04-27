//This is a virtual fortune cookie app
package fortuneCookie;

import java.util.*;

public class FortuneMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = "y";

		// welcome message
		System.out.println("Welcome to the Fortune Cookie Depot!");
		// prompt for user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("\nHow many fortune cookies would you like to purchase?(1-3):");
			int numberOfFortunes = Validator.getValidInt(1, 3);
			//print different prompts based on how many cookies the user purchases
			if (numberOfFortunes > 1) {
				System.out.println("\nThank you for your purchase of " + numberOfFortunes + " fortune cookies!");
				System.out.println("\nYour fortunes are as follows:");
			} 
			else {
				System.out.println("Thank you for purchasing a fortune cookie!");
			System.out.println("\nYour fortune:");
			}
			//array with fortunes for the cookies
			String[] fortune = new String[9];
			fortune[0] = "You will live a long life!";
			fortune[1] = "You will win the lottery!";
			fortune[2] = "You will have many children!";
			fortune[3] = "You will meet your soulmate soon!";
			fortune[4] = "You will get a raise at work!";
			fortune[5] = "You will grow 2 inches this year!";
			fortune[6] = "You will win tickets to the Super Bowl!";
			fortune[7] = "You will buy more fortune cookies soon!";
			fortune[8] = "You will be famous java programmer!";
			getFortune(numberOfFortunes, fortune);

			choice = Validator.getString("\nWould you like to purchase more fortune cookies?\n");
		}
		System.out.println("Thanks again for your purchase! Come back soon!");

	}

	/**
	 * @param numberOfFortunes
	 * @param fortune
	 */
	// method to choose random fortunes from the fortune array
	public static void getFortune(int numberOfFortunes, String[] fortune) {
		Random generator = new Random();
		int randomIndex = generator.nextInt(fortune.length);
		for (int i = 0; i < numberOfFortunes; i++)
			System.out.println(fortune[randomIndex*i]);
		
	}
}
