public class Hueg{
  public static void main(String[] args) {
      int[] array = {13, 42, 56, 78, 19, 45, 56, 34, 78, 2};
      int index = 0;
      int large = 0;
      int largeIndex = 0;

      for (int i = 0;i < array.length; i++) {
        if (array[i] > large) {
          large = array[i];
          index = i;
        }
        else if (array[i] == large) {
          largeIndex = i;
        }

      }
      System.out.println("största värdet är " + large + " och finns på index " + index + ", " + largeIndex);
  }

}
