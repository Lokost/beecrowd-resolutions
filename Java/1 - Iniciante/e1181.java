// Funcional no beecrowd
import java.util.Scanner;

public class e1181 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    String t = in.next();
    double[][] m = new double[12][12];
    double sum = 0, average;
    
    for (int i = 0; i < m.length ; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = in.nextDouble();
      }
    }
    in.close();
    
    if (t.equals("S")) {
      for (double k : m[l]) sum += k;
      System.out.println(sum);
    }

    else if (t.equals("M")) {
      for (double k : m[l])  sum += k; 
      average = sum / m[l].length;
      System.out.println(average);
    }
  }
}
