// Funcional no beecrowd
import java.util.Scanner;

public class e1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;

        while (i <= n){
            i++;
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
