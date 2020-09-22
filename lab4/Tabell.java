public class Tabell
{
  public static void main(String[] args)
  {
    for (int i = 0;i <= 10 ;i++ )//loop för varje tabell(i)
    {

      System.out.println("");

      for (int a = 1; a <= 10 ;a++ )// loop för varje tal(a) i tabell(i)
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
