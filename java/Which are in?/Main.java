import java.util.Arrays;
public class WhichAreIn
{

  public static String[] inArray (String[]array1, String[]array2)
  {
    String[]array3 = new String[array1.length];
    int cnt = 0;
    for (int i = 0; i < array1.length; i++)
      {
	for (int c = 0; c < array2.length; c++)
	  {
	    if (array2[c].contains (array1[i]))
	      {
		array3[cnt++] = array1[i];
		break;
	      }
	  }
      }

    if (cnt < array3.length)
      {
	String[]tmp = new String[cnt];
	System.arraycopy (array3, 0, tmp, 0, cnt);
	array3 = tmp;
      }

    Arrays.sort (array3);
    return array3;
  }
}
