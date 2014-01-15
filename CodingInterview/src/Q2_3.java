import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2_3 {
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
    String targetStr = line2;
    Node target = head;
    while(target.next != null)
    {
      target = target.next;
      if(target.data.toString().equals(targetStr)) break;
    }
    if(target.next == null) 
    {
      System.out.println("Not middle element.");
      return;
    }else {
      Node tmp = target.next;
      target.data = tmp.data;
      target.next = tmp.next;
    }
    target = head;
    while(target.next != null)
    {
      target = target.next;
      System.out.print(target.data.toString() + " ");
    }
  }
}
