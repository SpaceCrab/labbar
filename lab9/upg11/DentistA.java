import java.util.Scanner;

public class DentistA{
  static void printArr(String[][] arr){

    for (int i = 0; i < arr.length; i++ ) {
      for (int a = 0; a < arr[0].length;a++ ) {
        System.out.print(arr[i][a] + " ");
      }
      System.out.println("");
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[][] treatment = {{"Kontroll" ,"600"},{"Lagning hål","1500"},{"Rengöring","300"}};
    boolean done = false;

    System.out.println("välj en behandling");


    do {
      printArr(treatment);

      done = true;
    } while (!done);

  }
}
