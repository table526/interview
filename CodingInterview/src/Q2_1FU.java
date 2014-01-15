import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2_1FU {
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
    
    Node current = head;
    Node runner;
    Node prev;
    while(current.next != null)
    {
      current = current.next;
      runner = current;
      while(runner.next != null)
      {
        prev = runner;
        runner = runner.next;
        if(runner.data.toString().equals(current.data.toString()))
        {
          prev.next = runner.next;
          runner = prev;
        }
      }
    }
    current = head;
    while(current.next != null)
    {
      current = current.next;
      System.out.print(current.data.toString() + " ");
    }
  }
}
