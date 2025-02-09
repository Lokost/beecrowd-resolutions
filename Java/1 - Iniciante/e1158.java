// Funcional no beecrowd
import java.util.Scanner;

public class e1158 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int b = in.nextInt(), c = in.nextInt();
            int d = b, e = 0, sum = 0;

            while (true) {
                if (e == c) {
                    break;
                }

                if (d % 2 != 0) {
                    sum += d;
                    e++;
                }
                d++;

            }
            System.out.println(sum);    
        }
        in.close();
    }
}
