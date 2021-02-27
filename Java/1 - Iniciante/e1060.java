import java.io.IOException;

public class e1060 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int p = 0;
        double n;
        for (int i = 1; i <= 6; i++) {
            n = in.nextDouble();
            if (n >= 0) {
                p++;
            }
        }
        System.out.println(p + " valores positivos");

    }
}