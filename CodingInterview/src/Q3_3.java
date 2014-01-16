/* This code cannot cannot be ran.*/

import java.util.ArrayList;


public class Q3_3 {
  public ArrayList<Stack> stackList = new ArrayList<Stack>();
  public int capacity;
  public final int threshold = 5;
  public Q3_3()
  {
    capacity = threshold;
  }
  
  public Object pop()
  {
    if(stackList.size() == 0) return null;
    Object dst = stackList.get(stackList.size() - 1).pop();
    capacity--;
    if(capacity == 0)
    {
      stackList.remove(stackList.size() - 1);
      capacity = threshold;
    }
    return dst;
  }
  
  public void push(Object d)
  {
    if(capacity == threshold)
    {
      Stack newStack = new Stack();
      newStack.push(d);
      stackList.add(newStack);
      capacity = 1;
    }else{
      stackList.get(stackList.size() - 1).push(d);
      capacity++;
    }
  }
  
}
