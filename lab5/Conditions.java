import java.util.Scanner;
public class Conditions{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //create scanner for input

    System.out.println("Ange ett heltal: ");
    int number = input.nextInt();

    if ((number % 3) == 0) {
      System.out.println("numret är delbart med 3");
    }

    if ((number % 4) != 0) {
      System.out.println("numret är ej delbart med 4");
    }

    if () {

    }

    //Här skriver du kod för att testa de olika villkoren

  }
}
