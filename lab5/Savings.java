import java.util.Scanner;

public class Savings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount;
        int weeks;
        int sum;

        System.out.println ("Hur mycket sparar du var vecka?" );
        amount = in.nextInt();


        if (amount >= 5000) {//kontrollerar hur mycket användaren sparar i månaden
          System.out.println("Du är en duktig sparare!");
          amount = amount + 100;
        }
        else if (amount >= 2500) {//om sparandet är 2500 ge 50kr
          System.out.println("Du är en duktig sparare!");
          amount = amount + 50;
        }
        else {// annars ge kritik 
          System.out.println("du är ej bra på att spara!");
        }

        System.out.println ("Hur många veckor sparar du?" );

        weeks = in.nextInt();
        sum = weeks * amount;

        System.out.println("Efter "+weeks+ " veckor har du "+sum+ " kr.");
    }
}
