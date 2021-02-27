import java.io.IOException;

public class e1064 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        double n, soma = 0;
        int c = 0;
        for (int i = 1; i <= 6; i++) {
            n = in.nextDouble();
            if (n >= 0) {
                c++;
                soma += n;
            }
        }
        double media = soma/c;
        System.out.println(c + " valores positivos");
        System.out.format("%.1f%n", media);

    }
}