import java.io.IOException;

public class e1115 {

    public static void main(String[] args) throws IOException {

        // Funcional no URi
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            x = in.nextInt();
            y = in.nextInt();
        }

    }
}