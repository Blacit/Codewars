public class Solution
{

  public static String camelCase (String str)
  {
    StringBuilder sb = new StringBuilder ();
    boolean cnl = true;
    for (char c:str.toCharArray ())
      {
	if (cnl && Character.isLetter (c))
	  {
	    sb.append (Character.toUpperCase (c));
	    cnl = false;
	  }
	else
	  {
	    sb.append (Character.toLowerCase (c));
	  }
	if (Character.isWhitespace (c))
	  {
	    cnl = true;
	  }
      }
    String temp = sb.toString ();
    return temp.replaceAll (" ", "");
  }
}
