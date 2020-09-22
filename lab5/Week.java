import java.util.Scanner;

public class Week {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dag = 0;
    //här behöver du lägga till kod för att läsa in val från användaren
    dag = in.nextInt();

        //kontrollerar vilken dag det är och skriv ut texten till låten
    switch (dag) {

        //break;
      case 1:
        System.out.println("Monday you can fall apart ");
        //break;
      case 2:
        System.out.print("Tuesday, ");
        //break;
      case 3:
        System.out.println("Wednesday break my heart");
        //break;
      case 4:
        System.out.println("Oh, Thursday doesn't even start");
        //break;
      case 5:
        System.out.println("It's Friday, I'm in love");
        //break;
      case 6:
        System.out.println("Saturday, wait");
          //break;
      case 7:
        System.out.println("And Sunday always comes too late");
        break;
      default:
        break;
    }
  }
}
