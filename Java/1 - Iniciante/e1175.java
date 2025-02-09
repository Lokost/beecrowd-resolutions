import java.util.ArrayList;
import java.util.Scanner;

public class e1175 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> X = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      X.add(in.nextInt());
    }

in.close();

  int aux = X.toArray().length;

    for (int i = X.toArray().length -1; i >= 0; i--) {
      System.out.format("N[%d] = %d\n", aux - i, X.get(i));
    }
  }
}
