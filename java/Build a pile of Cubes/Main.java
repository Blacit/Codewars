public class ASum
{

  public static long findNb (long M)
  {
    long m = 0;
    long i = 0;
    while (m < M)
      {
	m += i * i * i;
	if (m == M)
	  {
	    return i;
	  }
	i += 1;
      }
    return -1;
  }
}
