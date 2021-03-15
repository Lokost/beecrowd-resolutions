import java.io.IOException;

public class e1133 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), menor, maior;

        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        for (int i = menor + 1; i < maior; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

    }
}