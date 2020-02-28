public class Chocolate
{
  public static int breakChocolate (int n, int m)
  {
    if ((n > 1 && m > 1) || (n > 1 && m == 1) || (n == 1 && m > 1))
      return m * n - 1;
    else
      return 0;
  }
}
