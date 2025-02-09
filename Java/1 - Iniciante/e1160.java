// Funcional no beecrowd
import java.util.Scanner;

class e1160 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num, pa, pb, a;
    double g1, g2;
    num = in.nextInt();
    for (int i = 0; i < num; i++) {
      pa = in.nextInt();
      pb = in.nextInt();
      g1 = in.nextDouble();
      g2 = in.nextDouble();
      a = 0;

      while (pa <= pb && a <= 100) {
        pa += (int)(pa * g1 / 100);
        pb = (int)(pb * g2 / 100);
        a++;
      }

      if (a > 100) System.out.println("Mais de 1 seculo.");
      else System.out.printf("%d anos.\n", a);
    }
    in.close();
  }
}