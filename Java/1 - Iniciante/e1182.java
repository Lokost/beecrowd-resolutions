// Funcional no beecrowd
import java.util.Scanner;

public class e1182 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int L = in.nextInt();
    String T = in.next();
    double sum = 0, average;
    double[][] m = new double[12][12];

    for(int i = 0; i < m.length; i++) 
      for (int j = 0; j < m[i].length; j++) m[i][j] = in.nextDouble();
    
      in.close();

    if (T.equals("S")) {
      for (int k = 0; k < m.length; k++) {
        sum += m[k][L];
      }
      System.out.println(sum);
    }
    else if (T.equals("M")) {
      for (int k = 0; k < m.length; k++) {
        sum += m[k][L];
      }
      average = sum / m.length;
      System.out.format("%.1f\n", average);
    }
  }
  
}
