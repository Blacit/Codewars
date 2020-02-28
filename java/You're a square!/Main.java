public class Square
{
  public static boolean isSquare (int n)
  {
    int i = (int) Math.sqrt (n);
    int temp = (int) Math.pow (i, 2);
    if (n == 0)
      {
	return true;
      }
    if (temp == n)
      {
	return true;
      }
    else
      return false;
  }
}
