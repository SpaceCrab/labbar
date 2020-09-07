import java.util.Scanner;

public class Ticket
{
  public static void main(String[] args)
  {
      //printar ut nödvändig information till användaren
      System.out.println("Välkommen till dagens familjefilm");
      System.out.println("Dagens film kostar 100kr/person");
      System.out.println("Barn har 25% rabatt");

      CalculateAmountToPay();
  }//slut main

  public static void CalculateAmountToPay()
  {
    //deklarera samtliga variabler som används i metoden
    String name = "";
    int adults = 0;
    int kids = 0;
    double price = 100.0;
    final double sale = 0.75;

    //skapar en ny scanner för att hämta info från användaren
    Scanner scanner = new Scanner(System.in);

    //ber användaren om information och hämtar informationen
    System.out.println("ange ditt namn: ");
    name = scanner.nextLine();

    System.out.println("antal vuxna: ");
    adults = scanner.nextInt();

    System.out.println("antal barn: ");
    kids = scanner.nextInt();

    //räknar ut det slutgiltiga priset
    price = price * adults + kids*price*sale;

    //skriver ut det slutgiltiga kvittot
    System.out.printf("Ditt kvitto " + name + "\n" + "totalt att betala  %.3 %n", price);
  }//slut CalculateAmountToPay

}
