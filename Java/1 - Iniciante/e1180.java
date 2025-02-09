// Funcional no beecrowd
import java.util.Scanner;
import java.util.ArrayList;

public class e1180 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int less = 0, position = 0;
    ArrayList<Integer> v = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      v.add(in.nextInt());
    }
    in.close();

    less = v.get(0);
    for (int i = 0; i < v.size(); i++) {
      if (v.get(i) < less) {less = v.get(i);
      position = i;}
    }

    System.out.printf("Menor valor: %d\nPosicao: %d\n", less, position);
  }
}
