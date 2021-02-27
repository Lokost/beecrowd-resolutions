import java.io.IOException;

public class e1065 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int c = 0;
        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            if (n % 2 == 0) {
                c++;
            }
        }
        System.out.println(c + " valores pares");

    }
}