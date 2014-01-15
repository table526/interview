import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class Q2_1 {
  public static void main(String [] args) throws IOException
  {
    Node head = new Node();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String [] tks = line.split("\\s+");
    for(int i = 0; i < tks.length; i++)
    {
      head.append(tks[i]);
    }
    
    HashSet<String> dict = new HashSet<String>();
    Node tmp = head;
    Node prev;
    while(tmp.next != null)
    {
      prev = tmp;
      tmp = tmp.next;
      String data = tmp.data.toString();
      if(!dict.contains(data))
      {
        dict.add(data);
      }else{
        prev.next = tmp.next;
        tmp = prev;
      }
    }
    tmp = head;
    while(tmp.next != null)
    {
      tmp = tmp.next;
      System.out.print(tmp.data.toString() + " ");
    }
  }
}
