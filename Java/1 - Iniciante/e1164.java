// Funcional no beecrowd
import java.util.Scanner;

public class e1164 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a, b, sum, a2;
    a = in.nextInt();

    if (a < 20 && a > 0) {
      for (int i = 0; i < a; i++) {
        b = in.nextInt();
        sum = 0;
        a2 = 1;

        while (a2 < b) {
          if (b % a2 == 0) sum += a2;
          a2 += 1;
        }

        if (sum == b) System.out.printf("%d eh perfeito\n", b);
        else System.out.printf("%d nao eh perfeito\n", b);
      }
    }
    in.close();
  }
}
