import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1_2 {
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String src = br.readLine() + '\0';
    String dst = "";
    //System.out.println(/*src + '\n' + */src.length() + '\n');
    for(int i = src.length() - 2; i >= 0; i--)
    {
      dst = dst + src.charAt(i);
    }
    dst = dst + '\0';
    System.out.println("The reversed string is: " + dst + ".\n");
  }
}
