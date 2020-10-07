public class Large {
public static void main(String[] args) {

        int[][] array1 = {{1,2,3},{11,12,13},{21,22,23}};
        int[][] array2 = {{1,1,4},{1,2,3},{6,7,2}};
        int[][] array3 = new int[3][3];

        if (array1.length == array2.length && array1[0].length == array2[0].length) {//kontrollerar så att båda arrayerna är lika stora

                //stegar genom array1 och array2
                for (int i = 0; i < array1.length; i++ ) {
                        for (int a = 0; a < array1[0].length; a++ ) {

                                //System.out.println(array1[i][a]);
                                //kontrollerar vilken av array1 och array2 är störs på index [i][a] där i är rad och a är kolumn
                                //samt assignar det största värdet till array3[i][a]
                                if (array1[i][a] >= array2[i][a]) {
                                        array3[i][a] = array1[i][a];
                                }
                                else if (array1[i][a] <= array2[i][a]) {
                                        array3[i][a] = array2[i][a];
                                }
                        }
                }
                //skriver ut array3
                for (int i = 0; i < array1.length; i++ ) {
                        for (int a = 0; a < array1[0].length; a++ ) {
                                System.out.print(array3[i][a] + " ");
                        }
                        System.out.println(" ");
                }
        }

}
}
