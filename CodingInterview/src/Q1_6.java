import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Q1_6 {
  public static void main(String [] args) throws IOException
  {
    String src = "";
    int N = 0;
    try {
      BufferedReader br = new BufferedReader(new FileReader("/home/pan/11791/CodingInterview/resource/Q1_6.in"));
      String line;
      while((line = br.readLine()) != null)
      {
        src = src + line + " ";
        N++;
      }
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    int [] matrix = new int[N * N];
    String [] element = src.split("\\s+");

    for(int i = 0; i < N * N; i++)
    {
      matrix[i] = Integer.parseInt(element[i]);
      /*System.out.print(matrix[i] + " ");
      if((i + 1) % N == 0)
      {
        System.out.print("\n");
      }*/
    }
    
    int tmp;
    for(int i = 0; i < (N / 2); i++)
    {
      for(int j = 0; j < ((N - 1) / 2) + 1; j++)
      {
        tmp = matrix[i * N + j];
        matrix[i * N + j] = matrix[(N - j - 1) * N + i];
        matrix[(N - j - 1) * N + i] = matrix[(N - i - 1) * N + (N - j - 1)];
        matrix[(N - i - 1) * N + (N - j - 1)] = matrix[j * N + (N - i - 1)];
        matrix[j * N + (N - i - 1)] = tmp;
      }
    }
    
    for(int i = 0; i < N * N; i++)
    {
      System.out.print(matrix[i] + " ");
      if((i + 1) % N == 0)
      {
        System.out.print("\n");
      }
    }
  }
}
