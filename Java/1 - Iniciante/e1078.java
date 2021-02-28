import java.io.IOException;

public class e1078 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), mult;
        for (int i = 1; i <= 10; i++) {
            mult = x * i;
            System.out.println(i + " x " + x + " = " + mult);
        }

    }
}