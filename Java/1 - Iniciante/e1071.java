import java.io.IOException;

public class e1071 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), soma = 0, c = 0, d = 0;
        if (a > b) {
            c = a;
            d = b + 1;
        } else {
            c = b;
            d = a + 1;
        }

        while (d < c) {
            if (d %2 != 0) {
                soma += d;
            }
            d++;
        }
        System.out.println(soma);

    }
}