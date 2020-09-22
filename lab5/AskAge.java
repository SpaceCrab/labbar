import java.util.Scanner;
public class AskAge{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age = 0;

    //frågar användaren om dess ålder och sparar det i age
    System.out.println("Ange din ålder");
    age = input.nextInt();

    //kontrollerar värdet av age och skriver ut text beroende på om age <= 17
    if (age <= 17) {
      System.out.println("Du är ett barn");
    }
    else {
      System.out.println("Du är vuxen");
    }
  }
}
