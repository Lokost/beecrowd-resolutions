import java.util.Scanner;
import java.util.ArrayList;

public class e1176 {
  public static void main(String[] args) {
    ArrayList<Long> F = new ArrayList<Long>();
    F.add(0L); F.add(1L);
    Scanner in = new Scanner(System.in);
    for (int P = 1; P <= 61; P++){
      F.add((F.get(P) + F.get(P-1)));
    }

    int T = in.nextInt();

    for (int i = 1; i <= T; i++) {
      int N = in.nextInt();
      System.out.format("Fib(%d) = %d\n", N, F.get(N));
    } 

    in.close();
  }
  
}
