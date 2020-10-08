public class Game
{
  public static void main(String[] args) {
    int[][] map = new int[4][5];
    boolean[][] deathMap = new boolean[4][5];
    int lengthVert = map.length;
    int lengthHor = map[0].length;

    for (int i = 0;i < lengthVert ;i++ ) {
      for (int a = 0; a < lengthHor ;i++ ) {

        int neighbors = map[i+1][a] + map[i-1][a] + map[i][a+1] + map[i][a-1]+
         map[i+1][a-1] + map[i+1][a+1] + map[i-1][a+1] + map[i-1][a-1];

        if (map[i][a] >= 3 || neighbors >= 15) {
          deathMap[i][a] = false;
        }
        else {
          deathMap[i][a] = false;
        }
      }
    }

    for (int i = 0; i < lengthVert; i++) {
      for (int a = 0;a < lengthHor; a++ ) {
        if (deathMap[i][a]) {
          System.out.print("T ");
        }
        else {
          System.out.print("F ");
        }
      }
      System.out.println("");
    }
  }
}
