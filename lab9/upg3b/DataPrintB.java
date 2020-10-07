public class DataPrintB{
  public static void main(String[] args) {

    String[][] student={{"Adam","Ason","661122","35","U"}, {"Beata","Bson","770111","38","G"}, {"Calle","Ceson","880222","23","U"}, {"Dorotea","Deson","990311","44","VG"}, {"Eivar","Eson","550423","40","G"}};
    int indexCol = 0;
    int indexRow = 0;

    for (int i = 0 ; i < student.length ; i++ ) {

      if (Integer.parseInt(student[indexRow][3]) >= 25 && Integer.parseInt(student[indexRow][3]) < 40) { //kontrollerar varje students poäng, om det är mellan 25 och 40 blir betyget G
        student[indexRow][4] = "g";
      }
      else if (Integer.parseInt(student[indexRow][3]) >= 40) { //kontrollerar varje students poäng, om det är högre än 40 blir betyget VG
        student[indexRow][4] = "Vg";
      }

      System.out.println(student[indexRow][0] + " " + student[indexRow][1] + " " + student[indexRow][3] + " " +  student[indexRow][4]);
      indexRow++;
    }

  }
}
