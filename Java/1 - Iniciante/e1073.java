import java.io.IOException;

public class e1073 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), quad;
        for (int i = 1; i <= n; i++) {
            if (i %2 == 0) {
                quad = i*i;
                System.out.println(i + "^2 = " + quad);
            }
        }

    }
}