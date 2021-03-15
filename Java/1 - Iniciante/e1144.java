import java.io.IOException;

public class e1144 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), j, k;
        for (int i = 1; i <= n; i++) {
            j = i * i;
            k = i * i * i;
            System.out.printf("%d %d %d%n", i, j, k);
            j++;
            k++;
            System.out.printf("%d %d %d%n", i, j, k);
        }

    }
}