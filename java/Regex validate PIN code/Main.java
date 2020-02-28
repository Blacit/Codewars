public class Solution
{

  public static boolean validatePin (String pin)
  {
    char[] chArray = pin.toCharArray ();
    for (int i = 0; i < chArray.length; i++)
      {
	if (chArray[i] <= 47 || chArray[i] >= 58)
	  {
	    return false;
	  }
      }

    if (chArray.length == 4 || chArray.length == 6)
      {
	return true;
      }
    else
      return false;
  }

}
