import java.io.IOException;

public class e1070 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), imp = 0;
        while (imp < 6) {
            if (x %2 == 1) {
                System.out.println(x);
                imp++;
            }
            x++;
        }

    }
}