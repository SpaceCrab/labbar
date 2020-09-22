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
            System.out.println("lör");
            //break;
          case 7:
            System.out.println("sön");
            //break
          case 1:
            System.out.println("Mån ");
            //break;
          case 2:
            System.out.println("tis");
            //break;
          case 3:
            System.out.println("ons");
            //break;
          case 4:
            System.out.println("tors");
            //break;
          case 5:
            System.out.println("fre");
            break;
          default:
            break;
    }
  }
}
