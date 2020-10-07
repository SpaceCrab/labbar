import java.text.DecimalFormat;

public class Moist{
  public static void main(String[] args) {
    double[] moist = {3.3, 2.7, 6.4, 1.8, 9.5, 1.4, 9.0, 7.0, 6.5, 3.7};


    double mean = 0.0;
    double largest = 0.0;
    double smallest = 0.0;


    for (int i = 0;i < moist.length ; i++ ) {

      if (moist[i] > largest) {
          largest = moist[i];
      }
      if (moist[i] < smallest) {
          smallest = moist[i];
      }

      mean += moist[i];
    }

    mean = mean/(moist.length);

    DecimalFormat df = new DecimalFormat("###.##");
    System.out.println(df.format(mean));
    System.out.println("största värdet = " + largest);
    System.out.println("minsta värdet = " + smallest);
    System.out.printf("medelvärdet = " + df.format(mean));

  }
}
