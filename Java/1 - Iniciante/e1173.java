// Funcional no beecrowd
import java.util.Scanner;
import java.util.ArrayList;

public class e1173 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> v = new ArrayList<Integer>();
    int n = in.nextInt();
    for (int i = 0; i < 10; i++) {
      v.add(n);
      System.out.format("N[%d] = %d\n", i, v.get(i));
      n *= 2;
    }
    in.close();
  }
}