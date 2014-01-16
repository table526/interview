
public class Stack {
  public Node top;
  public Stack(){}
  public Stack(Object d)
  {
    this.push(d);
  }
  
  public Object pop()
  {
    if(top != null)
    {
      Node t = top;
      top = top.next;
      return t.data;
    }else {
      return null;
    }
  }
  
  public void push(Object d)
  {
    Node newNode = new Node(d);
    newNode.next = top;
    top = newNode;
  }
  
  public Object peek()
  {
    if(top != null)
    {
      return top.data;
    }else {
      return null;
    }
  }
}
