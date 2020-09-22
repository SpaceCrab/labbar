import java.util.Scanner;

public class WeekB {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dag = 0;
    //här behöver du lägga till kod för att läsa in val från användaren
    dag = in.nextInt();

        //kontrollerar vilken dag det är och
        switch (dag) {
          case 6:
            System.out.println("Saturday, wait");
            break;
          case 7:
            System.out.println("And Sunday always comes too late");
            break;
          case 1:
            System.out.println("Monday you can fall apart ");
            //break;
          case 2:
            System.out.println("Tuesday, ");
            //break;
          case 3:
            System.out.println("Wednesday break my heart");
            //break;
          case 4:
            System.out.println("it's Friday, I'm in love");
            //break;
          case 5:
            System.out.println("It's Friday, I'm in love");
            break;
          default:
            break;
    }
  }
}
