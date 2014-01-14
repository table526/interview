import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Q1_4 {
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String src1 = br.readLine();
    String src2 = br.readLine();
    if(src1.length() != src2.length())
    {
      System.out.println("No");
      return;
    }
    char [] Chars = src1.toCharArray();
    Arrays.sort(Chars);
    src1 = new String(Chars);
    Chars = src2.toCharArray();
    Arrays.sort(Chars);
    src2 = new String(Chars);
    System.out.println(src1 + '\n' + src2 + '\n');
    if(src1.equals(src2))
    {
      System.out.println("Yes.");
    }else {
      System.out.println("No.");
    }
  }
}
