public class DataPrint{
  public static void main(String[] args) {

    String[][] student={{"Adam","Ason","661122","35","U"}, {"Beata","Bson","770111","38","G"}, {"Calle","Ceson","880222","23","U"}, {"Dorotea","Deson","990311","44","VG"}, {"Eivar","Eson","550423","40","G"}};

    //int indexCol = 0;
    int indexRow = 0;


    for (int i = 0 ; i < student.length ; i++ ) {

      if (student[indexRow][4] == "G"||student[indexRow][4] == "VG") {

        System.out.println(student[indexRow][1] + " " + student[indexRow][3]);

      }
      indexRow++;
    }

  }
}
