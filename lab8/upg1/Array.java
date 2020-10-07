public class Array{
  public static void main(String[] args) {

    int[] array = {13, 42, 56, 78, 19, 45, 57, 34, 77, 2};
    int searchValue = 78;
    int index = 0;
    int indexSearchValue = -1;


    System.out.println("första");

    for (int i = 0; i < array.length ;i++ ) {
      if (array[index] == searchValue) {

        indexSearchValue = index;
        System.out.println(searchValue + " ligger på index " + index);
        break;
      }
      index++;

    }
  }

}
