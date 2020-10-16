public class Game
{
  public static void main(String[] args)
  {
    int[][] map = {{1,1,2,3,3},{2,1,1,2,3},{3,2,2,1,2},{3,3,3,3,3}};
    boolean[][] deathMap = new boolean[4][5];
    int lengthVert = map.length;
    int lengthHor = map[0].length;
    int neighbors = 0;

    for (int i = 0;i < lengthVert;i++ )
    {
      for (int a = 0; a < lengthHor ;a++ )
      {

        //if(i > 0 && a >0 && i < 3 && a < 4) {
          neighbors = map[i+1][a] + map[i-1][a] + map[i][a+1] + map[i][a-1]+
           map[i+1][a-1] + map[i+1][a+1] + map[i-1][a+1] + map[i-1][a-1];
        //}

        if (map[i][a] >= 3 || neighbors >= 15)
        {
          deathMap[i][a] = false;
        }
        else{
          deathMap[i][a] = true;
        }
      }
    }

    for (int i = 0; i < lengthVert; i++)
    {
      for (int a = 0;a < lengthHor; a++ )
      {
        if (deathMap[i][a])
        {
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
