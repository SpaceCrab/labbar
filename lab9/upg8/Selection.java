import java.io.IOException;
public class Selection{

  public static void main(String[] args) {
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

    //hämtar längden på array
    int length = array.length;

    System.out.flush();
    System.out.println("osorterad array");
    for (int i = 0; i < length ; i++) {
      System.out.print(array[i] + " ");

    }
      //stegar genom array
    for (int i = 0;i < length -1  ;i++ ) {
      int minIndex = i;
      // stegar genom den osorterade delen av arrayen
      // och flyttar gränsen för den

      for (int a = i + 1;a < length ;a++ ) {

        if (array[a] < array[minIndex]) {
          minIndex = a;
        }

        //byter plats på elementen
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
      }
    }

    //skriver ut array efter sortering
    System.out.println("\nsorterad array");
    for (int i = 0; i < length; i++ ) {
      System.out.print(array[i] + " ");
    }

}
}
/*
                 __       __
                / <`     '> \
               (  / @   @ \  )
                \(_ _\_/_ _)/
              (\ `-/     \-' /)
               "===\     /==="
                .==')___(`==.
               ' .='     `=.
*/
