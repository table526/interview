
public class Node {
  public Object data;
  public Node next;
  public Node(){}
  public Node(Object d)
  {
    this.data = d;
  }
  
  public void append(Object d)
  {
    Node tmp = this;
    while(tmp.next != null)
    {
      tmp = tmp.next;
    }
    tmp.next = new Node(d);
  }
}
