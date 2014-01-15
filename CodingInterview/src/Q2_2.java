import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2_2 {
  public static void main(String [] args) throws IOException
  {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String line2 = br.readLine();
    
    Node head = new Node();
    String [] tks = line.split("\\s+");
    for(int i = 0; i < tks.length; i++)
    {
      head.append(tks[i]);
    }
    int N = Integer.parseInt(line2);
    if(N >= tks.length)
    {
      System.out.println("N exceeds the length of the list.");
      return;
    }
    
    Node ln = head;
    Node rn = ln;
    for(int i = 0; i < N; i++)
    {
      rn = rn.next;
    }
    while(rn.next != null)
    {
      ln = ln.next;
      rn = rn.next;
    }
    System.out.println("The " + N + "th element to the last one is: " + ln.data.toString() + ".");
  }
}
