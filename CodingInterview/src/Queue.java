
public class Queue {
  public Node first, last;
  public Queue(){}
  public Queue(Object d)
  {
    this.enqueue(d);
  }
  
  public Object dequeue()
  {
    if(first == null) return null;
    else{
      Object tmp = first.data;
      first = first.next;
      return tmp;
    }
  }
  
  public void enqueue(Object d)
  {
    if(first == null)
    {
      last = new Node(d);
      first = last;
    }else{
      Node tmp = new Node(d);
      last.next = tmp;
      last = tmp;
    }
  }
}
