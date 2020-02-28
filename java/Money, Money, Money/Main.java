public class Money
{
  public static int calculateYears (double principal, double interest,
				    double tax, double desired)
  {
    double PercentPerYear = 0, tallage = 0, RestPercentage = 0, PerYear = 0;
    int i = 1;

    if (principal == desired)
      {
	return 0;
      }

    PercentPerYear = principal * interest;
    tallage = PercentPerYear * tax;
    RestPercentage = PercentPerYear - tallage;
    PerYear = principal + RestPercentage;

    while (true)
      {
	if (PerYear >= desired)
	  {
	    return (int) i;
	  }
	else
	  PercentPerYear = PerYear * interest;
	tallage = PercentPerYear * tax;
	RestPercentage = PercentPerYear - tallage;
	PerYear = PerYear + RestPercentage;
	i++;
      }
  }
}
