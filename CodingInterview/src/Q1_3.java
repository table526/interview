import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Q1_3 {
  public static String Convert(String src)
  {
    HashMap dup = new HashMap();
    for(int i = 0; i < src.length(); i++)
    {
      if(dup.containsKey(src.charAt(i)))
      {
        src = src.substring(0, i).concat(src.substring(i + 1));
        i--;
      }else{
        dup.put(src.charAt(i), 1);
      }
    }
    return src;
  }
  
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String src = br.readLine();
    String dst = Convert(src);
    System.out.println("The output is: " + dst + "\n");
  }
}
