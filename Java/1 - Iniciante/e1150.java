import java.io.IOException;

public class e1150 {

    public static void main(String[] args) throws IOException {

        // Funcional no URi
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), z = in.nextInt(), soma = x, q = 1;

        while (x >= z) {
            z = in.nextInt();
        }

        while (soma <= z) {
            x++;
            soma += x;
            q++;
        }

        System.out.println(q);
    }
}