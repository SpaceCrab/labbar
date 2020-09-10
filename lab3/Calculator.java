import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args) {
    System.out.println("Välkommen till världens bästa Kalkylator");

    //anropar metoderna TestTypes TempConversion och TempConversion2
    TestTypes();
    TempConversion();
    TempConversion2();

    }//slut main
}
  public static void TestTypes()
  {
      int tal1 = 9 / 5;
      double tal2 = 9 / 5;
      double tal3 = 9.0 / 5;
      double tal4 = 9.0 / 5.0;

      System.out.println("Tal 1 9/5 ger " + tal1);
      System.out.println("Tal 2 9/5 ger " + tal2);
      System.out.println("Tal 3 9/5 ger " + tal3);
      System.out.println("Tal 4 9/5 ger " + tal4);
  }//slut TestTypes

  public static void TempConversion()
  {
    double celsius = 30.0;
    double fahrenheit = (9.0 / 5.0 * celsius) + 32.0;

    System.out.println("temperatur i c grader är " + celsius);
    System.out.println(celsius + " grader i sverige motsvarar " + fahrenheit + "fahrenheit");
  }//slut TempConversion

  public static void TempConversion2()
  {
    Scanner tempIn = new Scanner(System.in);
    System.out.println("skriv din temperatur i fahrenheit här :");

    double tempFahrenheit = Double.parseDouble(tempIn.nextLine());
    double tempCelsius = 5.0/9.0 * (tempFahrenheit - 32.0);

    System.out.println(tempFahrenheit + "din temperatur i celsius är : " + tempCelsius);
  }//slut TempConversion2
}
