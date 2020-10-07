public class Smol {
public static void main(String[] args) {

        int[] array = {13, 2, 56, 78, 19, 45, 56, 34, 78, 2};
        int index = 0;
        int small = 0;
        int smallIndex = 0;

        for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                        small = array[i];
                }
                if (array[i] < small) {
                        small = array[i];
                        smallIndex = i;

                }
                else if (array[i] == small) {
                        index = i;
                }

        }
        System.out.println("minsta värdet är " + small + " och finns på index " + index + " och  " + smallIndex);
        System.out.println
}

}
