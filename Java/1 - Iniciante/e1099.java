import java.io.IOException;

public class e1099 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), x, y, menor = 0, maior = 0, soma;
        for (int i = 1; i <= n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            soma = 0;
            if (x > y) {
                menor = y;
                maior = x;
            } else if (x < y) {
                menor = x;
                maior = y;
            }

            while (menor < maior - 1) {
                menor++;
                if (menor %2 != 0) {
                    soma += menor;
                }
            }
            System.out.println(soma);

        }

    }
}