import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";

		do {
			int theNumber = (int)(Math.random() * 100 + 1);
			//System.out.println(theNumber);
			int guess = 0;

				while(guess != theNumber) {

					System.out.println("Guess a number between 1 and 100:");
					guess = scan.nextInt();
					System.out.println("You entered " + guess + ".");

					if(guess < theNumber)
						System.out.println(guess + " är för lågt, försök igen");
					else if(guess > theNumber)
						System.out.println(guess + " är för högt, försök igen.");
					else
						System.out.println(guess + " är rätt, Du vann!");
				}

			System.out.println("Vill du spela igen? (y/n)");
			playAgain = scan.next();

			}while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Thanks for playing");
		scan.close();


	}

}
