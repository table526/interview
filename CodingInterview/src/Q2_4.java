import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2_4 {
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line1 = br.readLine().trim();
    String line2 = br.readLine().trim();
    
    Node num1 = new Node();
    Node num2 = new Node();
    for(int i = 0; i < line1.length(); i++)
    {
      num1.append(line1.charAt(line1.length() - i - 1));
    }
    for(int i = 0; i < line2.length(); i++)
    {
      num2.append(line2.charAt(line2.length() - i - 1));
    }
    
    int carry = 0;
    Node tmp1 = num1;
    Node tmp2 = num2;
    Node dst = new Node();
    while(true)
    {
      int sum = carry;
      carry = 0;
      if(tmp1.next != null)
      {
        tmp1 = tmp1.next;
        sum = sum + Integer.parseInt(tmp1.data.toString());
      }
      if(tmp2.next != null)
      {
        tmp2 = tmp2.next;
        sum = sum + Integer.parseInt(tmp2.data.toString());
      }
      if(sum == 0) break;
      if(sum < 10)
      {
        dst.append(Integer.toString(sum));
        continue;
      }else{
        sum = sum - 10;
        carry = 1;
        dst.append(Integer.toString(sum));
        continue;
      }
    }
    
    Node tmp = dst;
    while(tmp.next != null)
    {
      tmp = tmp.next;
      System.out.print(tmp.data);
    }
  }
}
