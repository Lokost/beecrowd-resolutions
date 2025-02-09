// Funcional no beecrowd
import java.util.Scanner;
import java.util.ArrayList;

public class e1177 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt(), S = 0;
    ArrayList<Integer> V = new ArrayList<>();

    for (int i = 0; i < 1000; i++) {
      if (S >= T) {
        S = 0;
        V.add(S);
        S++;
      } else {
        V.add(S);
        S++;
      }

      System.out.format("N[%d] = %d\n", i, V.get(i));
    }
    in.close();
  }
}
