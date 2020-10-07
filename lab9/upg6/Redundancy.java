public class Redundancy {
public static void main(String[] args) {

        int[] array = {12,13,14,13,0,0,15,15,0,13};
        int[] array1= new int[10];

        int index = 0;

        for (int i = 0; i < array.length; i++ ) {//räknar genom array

                if(array[i] != 0) {// kontrollerar om värdet i array på index i INTE är 0
                        array1[index] = array[i]; // tilldelar array1 på Index index
                        index++;
                }
        }

        System.out.println("Array ");
        for (int i = 0; i < array.length; i++ ) {//skriver ut array
                System.out.print(array[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Array 1");

        for (int i = 0; i < array1.length; i++ ) {//skriver ut array1
                System.out.print(array1[i] + " ");
        }
}
}
