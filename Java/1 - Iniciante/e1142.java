import java.io.IOException;

public class e1142 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), pum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(pum + " ");
                pum++;
            }
            System.out.print("PUM\n");
            pum++;
        }

    }
}