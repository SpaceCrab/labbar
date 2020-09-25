import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";

		do {
			int theNumber = (int)(Math.random() * 100 + 1);
			int guess = 0;

				while(guess != theNumber) {

					System.out.println("gissa ett nummer mellan 1 och 100:");
					guess = scan.nextInt();

					System.out.println("du skrev: " + guess + ".");

					if(guess < theNumber){
						System.out.println(guess + " är för lågt, försök igen");
					}
					else if(guess > theNumber){
						System.out.println(guess + " är för högt, försök igen.");
					}
					else{
						System.out.println(guess + " är rätt, Du vann!");
					}
				}

			System.out.println("Vill du spela igen? (y/n)");
			playAgain = scan.next();

			}while (playAgain.equalsIgnoreCase("y"));

		System.out.println("Tack för att du spelade");
		scan.close();
	}

}
