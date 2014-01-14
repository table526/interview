import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Q1_1 {
  public static void main(String [] args) throws IOException
  {
    HashMap DupDetector = new HashMap();
    BufferedReader UserInput = new BufferedReader(new InputStreamReader(System.in));
    String str = UserInput.readLine();
    for(int i = 0; i < str.length(); i++)
    {
      char c = str.charAt(i);
      if(DupDetector.containsKey(c))
      {
        System.out.println("Duplicated character: " + c + "detected.\n");
        return;
      }else {
        DupDetector.put(c, 1);
      }
    }
    System.out.println("This str has all unique characters.\n");
  }
}
