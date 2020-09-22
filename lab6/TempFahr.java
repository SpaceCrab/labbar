
public class TempFahr{
  public static void main(String[] args) {

    double fahrenheit, celcius;

    celcius= 0.0;

    System.out.println("celcius -> fahrenheit");

    for (int i = 0;i <= 10 ;i++ ) {
      fahrenheit = i *10;
      celcius = ((fahrenheit -32.0)*5)/9;

      System.out.println( fahrenheit + " -> " + celcius);
    }
  }
}
