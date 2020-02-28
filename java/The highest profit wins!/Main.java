import java.util.*;
import java.io.*;

class MinMax
{
  public static int[] minMax (int[]arr)
  {
    int len = arr.length;
    int[] massiv = new int[2];
      Arrays.sort (arr);
      massiv[0] = arr[0];
      massiv[1] = arr[len - 1];
      return massiv;
  }
}
