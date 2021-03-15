import java.io.IOException;

public class e1113 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else if (y > x) {
                System.out.println("Crescente");
            }
            x = in.nextInt();
            y = in.nextInt();
        }
    }
}