import java.util.Scanner;
import java.lang.*;

public class DentistA{

  static void printArr(String[][] arr)
  {

    for (int i = 0; i < arr.length; i++ )
    {
      for (int a = 0; a < arr[0].length;a++ )
      {
        System.out.print(arr[i][a] + " ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    String[][] treatment = {{"1: Kontroll" ,"600"},{"2: Lagning hål","1500"},{"3: Rengöring","300"}};
    boolean done = false;
    double cost = 0.0;
    System.out.println("välj en behandling\nskriv -1 när du är klar\n\n\n");


    do {
      printArr(treatment);
      int choice = input.nextInt();

      switch (choice) {
        case 1:
          cost = cost + Double.parseDouble(treatment[0][1]);
          break;
        case 2:
          cost = cost + Double.parseDouble(treatment[1][1]);
          break;
        case 3:
          cost = cost + Double.parseDouble(treatment[2][1]);
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

    System.out.println("det slutgiltiga priset blev " + cost);
  }
}
