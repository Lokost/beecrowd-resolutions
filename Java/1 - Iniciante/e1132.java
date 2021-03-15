import java.io.IOException;

public class e1132 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), soma = 0, maior = 0, menor = 0;
        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);


    }
}