
public class Q3_2 extends Stack{
  public Stack minStack;
  
  public Q3_2()
  {
    minStack = new Stack();
  }
  
  public void push(Object d)
  {
    Node newNode = new Node(d);
    newNode.next = top;
    top = newNode;
    if(minStack.peek() == null || (int)minStack.peek() >= (int)top.data)
    {
      minStack.push(top.data);
    }
  }
  
  public Object pop()
  {
    if(top == null) return null;
    Object dst = top.data;
    if(dst == minStack.peek())
    {
      Object tmp = minStack.pop();
    }
    return dst;
  }
  
  public Object min()
  {
    return minStack.peek();
  }
  
  public static void main(String [] args)
  {
    Q3_2 ModifiedStack = new Q3_2();
    for(int i = 0; i < 25; i++)
    {
      ModifiedStack.push(i);
    }
    System.out.println("The minimum element is: " + ModifiedStack.min() + ".");

    for(int i = 0; i < 13; i++)
    {
      int tmp = (int)ModifiedStack.pop();
    }
    System.out.println("The minimum element is: " + ModifiedStack.min() + ".");

    for(int i = 0; i < 25; i++)
    {
      ModifiedStack.push(12 - i);
    }
    System.out.println("The minimum element is: " + ModifiedStack.min() + ".");

    for(int i = 0; i < 13; i++)
    {
      int tmp = (int)ModifiedStack.pop();
    }
    System.out.println("The minimum element is: " + ModifiedStack.min() + ".");
  }
}
