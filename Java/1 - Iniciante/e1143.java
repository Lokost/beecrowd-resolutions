import java.io.IOException;

public class e1143 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), qua, cubo, x = 1;
        while (x<=n) {
            qua = x * x;
            cubo = x * x * x;
            System.out.printf("%d %d %d%n" , x, qua, cubo);
            x++;
        }

    }
}