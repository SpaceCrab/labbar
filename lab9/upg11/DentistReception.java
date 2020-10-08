mport java.util.Scanner;
public class DentistReception{
  public static void main(String[] args) {
    double cost = 0;
    int treatment = 0;


    final double checkUp = 600.00;
    final double cleaning = 300.00;
    final double cavity = 1500.00;
    final double saleLimit = 3000.0;
    final double sale = 0.9 ;

    boolean done = false;

    Scanner input = new Scanner(System.in);  //create scanner for input
    System.out.println("Ange vilken ebhandling som utförts: ");
    System.out.println("Kontroll: 1");
    System.out.println("Rengöring: 2");
    System.out.println("Laga hål: 3");
    System.out.println("klar 4");
    System.out.println("Avbryt: -1");

    do {
      treatment = input.nextInt();

      switch (treatment) {
        case 1:
          cost = cost + checkUp;
          break;
        case 2:
          cost = cost + cleaning;
          break;
        case 3:
          cost = cost + cavity;
          break;
        case 4:
          done = true;
          break;
        case -1:
          System.out.println("hejdå");
          done = true;
          break;
      }
    } while (!done);

    System.out.println("Kostnaden utan avdrag är:"+ cost);

    if (cost >= saleLimit && done ) {

      cost = cost * sale;
      System.out.println("efter som att du handlat för mer än 3000");
      System.out.println("Kostnaden är: " + cost + "med avdrag");

    }


    //Skriv din kod här för att se om avdrag ska göras


  }
}
