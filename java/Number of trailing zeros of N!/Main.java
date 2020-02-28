public class Solution
{
  public static int zeros (int number)
  {

    int count = 0;
    int divider = 5;

    while ((number / divider) > 0)
      {
	count += number / divider;
	divider = divider * 5;
      }
    return count;
  }
}
