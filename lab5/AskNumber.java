import java.util.Scanner;
public class AskNumber{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange ett heltal: ");
    int number = input.nextInt();

    //kontrollerar att talet är större än hundra
    if (number > 100) {
      System.out.println("Talet är större än 100");
    }
    else {
      System.out.println("Talet är högst hundra");
    }
  }
}
