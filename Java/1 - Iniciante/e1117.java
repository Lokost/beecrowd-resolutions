import java.io.IOException;

public class e1117 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        double n, soma = 0, media;
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
        System.out.printf("media = %.2f%n", media);

    }
}