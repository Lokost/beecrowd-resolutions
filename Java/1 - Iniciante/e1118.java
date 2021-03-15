import java.io.IOException;

public class e1118 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int op = 1;
        double n, soma, media;

        while (op != 2) {
            soma = 0.0;
            if (op == 1) {
                for (int i = 1; i <= 2;) {
                    n = in.nextDouble();
                    if (n >= 0 && n <= 10) {
                        soma += n;
                        i++;
                    } else {
                        System.out.println("nota invalida");
                    }
                }
                media = soma / 2;
                System.out.printf("media = %.2f%n" , media);
            }
            System.out.println("novo calculo (1-sim 2-nao)");
            op = in.nextInt();
        }

    }
}