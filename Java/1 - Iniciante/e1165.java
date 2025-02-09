// Funcional no beecrowd
import java.util.Scanner;

public class e1165 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int s, num;

    for (int i = 0; i < n; i ++) {
      num = in.nextInt();
      s = 0;

      for (int j = 1; j <= num; j++) {
        if (num % j == 0) s++;
      }

      if (s > 2) System.out.printf("%d nao eh primo\n", num);
      else System.out.printf("%d eh primo\n", num);
    }
    in.close();
  }
}
