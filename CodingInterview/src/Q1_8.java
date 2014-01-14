import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1_8 {
  public static boolean isSubstring(String src1, String src2)
  {
    if(src1.length() > src2.length()) return false;
    for(int i = 0; i < src2.length() - src1.length(); i++)
    {
      if(src2.substring(i, i + src1.length()).equals(src1))
      {
        return true;
      }
    }
    return false;
  }
  
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String src1 = br.readLine();
    String src2 = br.readLine();
    src1 = src1 + src1;
    if(isSubstring(src2, src1))
    {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    return;
  }
}
