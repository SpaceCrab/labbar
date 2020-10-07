import java.lang.*;

public class CalMoist{
  public static void main(String[] args) {

    double[] sensorA = {3.3, 2.7, 6.4, 1.8, 9.5, 1.4, 9.0, 7.0, 6.5, 3.7};
    double[] sensorB = {5.6, 4.7, 2.8, 3.7, 5.8, 2.7, 6.4, 1.8, 9.5,10.2};

    int fail = 0;
    double largestFailure = 0.0;

    for (int i = 0;i < 10 ;i++ ) {//stegar genom varje index

        if (sensorA[i] != sensorB[i]) { // kontrollerar om  index i arrayerna  är lika stora
          fail++; // lägger till ett fel i variabeln fail

          if (Math.abs(sensorA[i] - sensorB[i]) > largestFailure) { //kontrollerar om felet är större än största felet hittils
            largestFailure = Math.abs(sensorA[i] - sensorB[i]); //lägger till största felet
          }
        }
    }

    //skriver ut största felet och antal fel
    System.out.println("antal fel :"  + fail);
    System.out.println("största felet : " + largestFailure);

  }
}
