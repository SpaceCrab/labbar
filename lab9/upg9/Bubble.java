public class Bubble{

  public static void main(String[] args) {
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
    int length = array.length;

    System.out.println("osorterad array");
    for (int i = 0; i < length; i++) {
      System.out.print(array[i] + " ");
    }

    for (int i = 0; i < length; i++) {
      for (int a = i;a < length - i -1 ;a++ ) {
        if (array[a] > array[a+1]) {
          int temp = array[a];
          array[a] = array[a+1];
          array[a+1] = temp;
        }
      }
    }

    System.out.println("\nsorterad array");
    for (int i = 0; i < length; i++) {
      System.out.print(array[i] + " ");
      
    }
  }
}
