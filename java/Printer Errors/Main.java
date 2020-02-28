public class Printer
{

  public static String printerError (String s)
  {
    int counter = 0;
    for (int i = 0; i < s.length (); i++)
      {
	if (s.charAt (i) > 'm')
	  counter++;
      }
    return counter + "/" + s.length ();
  }
}
