/* This one cannot be ran correctly. Because input is not easy to mimic.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2_5 {
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    Node head = new Node();
    String [] tks = line.trim().split("\\s+");
    for(int i = 0; i < tks.length; i++)
    {
      head.append(tks[i]);
    }
    if(tks.length <= 1)
    {
      System.out.println("List length too small. Exit.");
      return;
    }
    Node slow = head;
    Node fast = head;
    while(fast.next != null)
    {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) break;
    }
    if(fast.next == null)
    {
      System.out.println("No loops found.");
      return;
    }
    slow = head;
    while(slow != fast)
    {
      slow = slow.next;
      fast = fast.next;
    }
    System.out.println("The begin of the loop is: " + slow.data.toString() + ".");
  }
}
