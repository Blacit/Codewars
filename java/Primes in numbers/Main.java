import java.util.ArrayList;

public class PrimeDecomp
{
  public static String factors (int n)
  {
    if (n < 2)
      throw new
	IllegalArgumentException
	("A natural number greater than 1 is required!");
      ArrayList < Integer > factors = new ArrayList <> ();
    for (int i = 2; i <= n / i; i++)
      for (; n % i == 0; n /= i)
	  factors.add (i);
    if (n > 1)
        factors.add (n);

    StringBuilder sb = new StringBuilder ();
      sb.append ('(').append (factors.get (0));
    int count = 1;
    for (int i = 1; i < factors.size (); i++)
      {
	if (factors.get (i).equals (factors.get (i - 1)))
	  count++;
	else
	  {
	    if (count != 1)
	      sb.append ("**").append (count);
	    sb.append (")(").append (factors.get (i));
	    count = 1;
	  }
      }
    return count == 1
      ? sb.append (')').toString ()
      : sb.append ("**").append (count).append (')').toString ();
  }

  public static String factorsMerged (int n)
  {
    if (n < 2)
      throw new
	IllegalArgumentException
	("A natural number greater than 1 is required!");
    StringBuilder sb = new StringBuilder ();
    for (int factor = 2; factor <= n / factor; factor++)
      {
	int count;
	for (count = 0; n % factor == 0; count++)
	  n /= factor;
	if (count > 0)
	  sb.append ('(').append (factor).append (count >
						  1 ? "**" +
						  count : "").append (')');
      }
    if (n > 1)
      sb.append ('(').append (n).append (')');
    return sb.toString ();
  }

  public static void main (String[]args)
  {
    System.out.println (factors (948640));
    System.out.println (factorsMerged (7775460));
  }
}
