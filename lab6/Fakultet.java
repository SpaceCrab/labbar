import java.util.Scanner;

public class Fakultet {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int in = input.nextInt();
    int out = 1 ;//out kommer bli den slutgiltiga siffran

    for (int i = 1;i <= in ;i++ ) { // i är en räknare

      if (i == in) {
        System.out.print( ""+ i);
      }
      else{
        System.out.print(i + "*");
        out = i * out;
      }
    }

    System.out.print("= " + out);
  }
}
