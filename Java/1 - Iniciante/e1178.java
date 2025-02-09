// Funcional no beecrowd
import java.util.Scanner;

public class e1178 {
  public static void main(String args[]) {
    double[] V = new double[100];
    Scanner in = new Scanner(System.in);
    double n = in.nextDouble();
    in.close();

    for (int i = 0; i < V.length; i++){
      V[i] = n;
      System.out.format("N[%d] = %.4f\n", i, V[i]);
      n /= 2;
    }
  }
}
