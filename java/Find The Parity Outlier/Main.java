import java.util.*;

public class FindOutlier
{
  static int find (int[]integers)
  {
    int amountOdd = 0;
    int amountEven = 0;
    int answer = 0;

    for (int i = 0; i < integers.length; i++)
      {
	if (integers[i] % 2 == 0)
	  amountEven++;
	if (integers[i] % 2 != 0)
	  amountOdd++;

	if (amountEven > 2 || amountOdd > 2)
	  break;
      }
    boolean even = amountEven < amountOdd ? true : false;

    if (even)
      {
	for (int i = 0; i < integers.length; i++)
	  {
	    if (integers[i] % 2 == 0)
	      answer = integers[i];
	  }
      }
    else
      {
	for (int i = 0; i < integers.length; i++)
	  {
	    if (integers[i] % 2 != 0)
	      answer = integers[i];
	  }
      }
    return answer;
  }
}
