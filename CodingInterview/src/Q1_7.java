import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;


public class Q1_7 {
  public static void main(String [] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new FileReader("/home/pan/git/interview/CodingInterview/resource/Q1_7.in"));
    String line;
    String src = "";
    int N = 0, M = 0;
    while((line = br.readLine()) != null)
    {
      src = src + line + " ";
      M++;
    }
    br.close();
    String [] input = src.trim().split("\\s+");
    N = input.length / M;
    int [] matrix = new int[M * N];
    
    HashSet<Integer> ZeroRows = new HashSet<Integer>();
    HashSet<Integer> ZeroColumns = new HashSet<Integer>();
    for(int i = 0; i < matrix.length; i++)
    {
      matrix[i] = Integer.parseInt(input[i]);
      if(matrix[i] == 0)
      {
        ZeroRows.add(i / N);
        ZeroColumns.add(i % N);
      }
    }
    
    Iterator iterR = ZeroRows.iterator();
    Iterator iterC = ZeroColumns.iterator();
    
    while(iterR.hasNext())
    {
      int rowN = (int)(iterR.next());
      for(int i = rowN * N; i < (rowN + 1) * N; i++)
      {
        matrix[i] = 0;
      }
    }
    while(iterC.hasNext())
    {
      int ColumnN = (int)iterC.next();
      for(int i = ColumnN; i < N * M; i = i + N)
      {
        matrix[i] = 0;
      }
    }
    
    for(int i = 0; i < M; i++)
    {
      for(int j = 0; j < N; j++)
      {
        System.out.print(matrix[i * N + j] + " ");
      }
      System.out.print("\n");
    }
  }
}
