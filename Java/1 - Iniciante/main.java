import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String Op = in.next();
    double[][] m = new double[12][12];
    double sum = 0;
    int count = 0, n = 1;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = in.nextDouble();
      }
   }
   in.close();

   for (int i = 0; i < m.length; i++) {
    for (int j = n; j < m[i].length; j++) {
      if (j > i) {
        sum += m[i][j];
        count++;
      }
    }
    n++;
   }

   if (Op.equals("S")) System.out.format("%.1f\n", sum);
   else if(Op.equals("M")) System.out.format("%.1f\n", sum / count);
  }
}
