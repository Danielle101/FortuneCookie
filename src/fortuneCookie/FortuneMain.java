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
			System.out.println("\nHow many fortune cookies would you like to buy?(1-3):");
			int numberOfFortunes = Validator.getValidInt(1, 3);
			//print different prompts based on how many cookies the user buys
			if (numberOfFortunes > 1) {
				System.out.println("\nThank you for your purchase of " + numberOfFortunes + " fortune cookies!");
				System.out.println("\nYour fortunes are as follows:");
			} 
			else {
				System.out.println("Thank you for buying  a fortune cookie!");
			System.out.println("\nYour fortune:");
			}
			//array with fortunes for the cookies
			String[] fortune = new String[14];
			fortune[0] = "You will live a long life!";
			fortune[1] = "You will win the lottery!";
			fortune[2] = "You will have many children!";
			fortune[3] = "You will meet your soulmate today!";
			fortune[4] = "You will get a raise at work!";
			fortune[5] = "You will grow 2 inches this year!";
			fortune[6] = "You will win tickets to the Super Bowl!";
			fortune[7] = "You will buy more fortune cookies soon!";
			fortune[8] = "You will be a famous java programmer!";
			fortune[9] = "You will marry a millionaire!";
			fortune[10] = "Two days from now, tomorrow will be yesterday!";
			fortune[11] = "Your smile will tell you what makes you feel good.";
			fortune[12] = "You cannot love life until you live the life you love.";
			fortune[13] ="The man or woman you desire feels the same about you.";

			//print out fortunes based on the amount of cookies the user purchased
			getFortune(numberOfFortunes, fortune);

			//ask the customer if they would like to buy more cookies
			choice = Validator.getString("\nWould you like to buy more fortune cookies?\n");
		}
		//exit message
		System.out.println("Thanks again for your purchase! Come back soon!");
		scan.close();
	}

	/**
	 * @param numberOfFortunes
	 * @param fortune
	 */
	// method to choose random fortunes from the fortune array
	public static void getFortune(int numberOfFortunes, String[] fortune) {
		while (numberOfFortunes > 0){
			Random generator = new Random();
		int randomIndex = generator.nextInt(fortune.length);
		System.out.println(fortune[randomIndex]);
		numberOfFortunes--;
		
	}
}
}
