// Funcional no beecrowd
import java.util.Scanner;
import java.util.ArrayList;

public class e1179 {
  public static void main(String[] args) {
    ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
    Scanner in =  new Scanner(System.in);
    
    for (int i = 0; i < 15; i++) {
      int x = in.nextInt();
      if (x %2 == 0) even.add(x);
      else odd.add(x);
      
      if (even.toArray().length == 5) {
        for (int j = 0; j < even.toArray().length; j++) {
          System.out.format("par[%d] = %d\n", j, even.get(j));
        }
        even.clear();
      }
      
      else if (odd.toArray().length == 5) {
        for (int j = 0; j < odd.toArray().length; j++) {
          System.out.format("impar[%d] = %d\n", j, odd.get(j));
        }  
        odd.clear();
      }
    }
    in.close();

    for (int k = 0; k < odd.toArray().length; k++) System.out.format("impar[%d] = %d\n", k, odd.get(k));
    for (int k = 0; k < even.toArray().length; k++) System.out.format("par[%d] = %d\n", k, even.get(k));
  }
}
