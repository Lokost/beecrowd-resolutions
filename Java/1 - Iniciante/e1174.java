// Funcional no Beecrowd

import java.util.Scanner;
import java.util.ArrayList;

public class e1174 {
  public static void e1174(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Double> v = new ArrayList<Double>();

    for (int i = 0; i < 100; i++) {
      double x = in.nextDouble();
      v.add(x);
    }
    in.close();

    for (int i = 0; i < v.toArray().length; i++) {
      double x = v.get(i);
      if (x <= 10) {
        System.out.format("A[%d] = %.1f\n", i, x);
      }
    }
  }
}
