import java.util.Arrays;

public class Kata
{
  public static int findShort (String s)
  {
    String[]words = s.split (" ");
    int numwords = s.split (" ").length;
    String shortestword = words[0];
    for (int i = 1; i < numwords; i++)
      {
	if (words[i].length () < shortestword.length ())
	  {
	    shortestword = words[i];
	  }
      }
    return shortestword.length ();
  }
}
