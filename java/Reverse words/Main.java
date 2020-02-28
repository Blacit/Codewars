public class Kata
{
  public static String reverseWords (final String original)
  {
    char[] temp = null;
    StringBuffer sb = new StringBuffer ();
      String[] words = original.split ("\\s");
    if (words.length == 0)
      {
	return original;
      }
    for (int i = 0; i < words.length; i++)
      {
	temp = words[i].toCharArray ();
	sb.append (new StringBuilder (new String (temp)).reverse ());
	sb.append (" ");
	System.out.print (sb);
      }
    sb.deleteCharAt (sb.length () - 1);
    return sb.toString ();
  }
}
