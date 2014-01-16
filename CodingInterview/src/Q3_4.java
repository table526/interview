import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q3_4 {
  Stack [] bottom = new Stack[3];
  public Q3_4()
  {
    for(int i = 0; i < 3; i++)
    {
      bottom[i] = new Stack();
    }
  }
  public Q3_4(int n)
  {
    for(int i = 0; i < 3; i++)
    {
      bottom[i] = new Stack();
    }
    for(int i = 0; i < n; i++)
    {
      bottom[0].push(n - i);
    }
  }
  
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    Q3_4 game = new Q3_4(Integer.parseInt(line));
    game.Hanoi(0, 2, Integer.parseInt(line));
  }
  
  public void Hanoi(int src, int dst, int num)
  {
    if(num <= 1) 
    {
      Object tmp = bottom[src].pop();
      System.out.println("Put \"" + (int)tmp + "\" from plate " + src + " to plate " + dst + ".");
      bottom[dst].push(tmp);
      return;
    }else{
      Hanoi(src, (3 - src - dst), num - 1);
      Object tmp = bottom[src].pop();
      System.out.println("Put \"" + (int)tmp + "\" from plate " + src + " to plate " + dst + ".");
      bottom[dst].push(tmp);
      Hanoi((3 - src - dst), dst, num - 1);
    }
  }
}
