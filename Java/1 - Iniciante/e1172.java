// Funcional no Beecrowd

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class e1172{
  public static void e1172(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> v = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      v.add(input.nextInt());
      if (v.get(i) <= 0) {
        v.set(i, 1);
      }
      System.out.format("X[%d] = %d\n", i, v.get(i));
    }
    input.close();
  }
}