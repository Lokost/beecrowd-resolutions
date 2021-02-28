import java.io.IOException;

public class e1101 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int m = 1, n = 1;
        while (m > 0 && n > 0) {
            m = in.nextInt(); n = in.nextInt();
            int maior = 0, menor = 0, soma = 0;
            if (m > 0 && n > 0) {
                if (m > n) {
                    menor = n;
                    maior = m;
                } else if (m < n) {
                    menor = m;
                    maior = n;
                }
                while (menor <= maior) {
                    System.out.print(menor + " ");
                    soma += menor;
                    menor++;
                }
                System.out.print("Sum=" + soma + "\n");
            }
        }

    }
}