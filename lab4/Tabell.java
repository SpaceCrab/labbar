import java.util.Scanner;

public class Tabell
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("skriv två tal");

    int tal1 = input.nextInt();//hämtar de två talen från användaren
    int tal2 = input.nextInt();

    for (int i = tal1;i <= tal2 ;i++ )//loop för varje tabell(i) som startar med tabellen för tal1 och avslutar med tabellen för tal2
    {
      System.out.println("");
      for (int a = 0; a <= 10 ;a++ )// loop för varje tal(a) i tabell(i)
      {
        if((i*a)<10){
          System.out.print("  " + i * a);
        }
        else{
          System.out.print(" " + i * a);
        }

      }
    }
  }
}
