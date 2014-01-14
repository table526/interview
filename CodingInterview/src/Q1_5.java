import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1_5 {
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String src = br.readLine();
    int flag = -1;
    if(src.length() == 0 || src == null) return;
    if(src.charAt(0) == ' ')
    {
      if(src.charAt(src.length() - 1) == ' ')
      {
        flag = 3;
      }else{
        flag = 1;
      }
    }else if(src.charAt(src.length() - 1) == ' ')
    {
      flag = 2;
    }else{
      flag = 0;
    }
    
    String [] Token = src.trim().split("\\s+");
    String dst = "";
    for(int i = 0; i < Token.length - 1; i++)
    {
      dst = dst + Token[i] + "%20";
    }
    dst = dst + Token[Token.length - 1];
    switch(flag)
    {
      case 0: break;
      case 1: dst = "%20" + dst; break;
      case 2: dst = dst + "%20"; break;
      case 3: dst = "%20" + dst + "%20"; break;
    }
    System.out.println("The output is: \"" + dst + "\".\n");
  }
}
