import java.io.IOException;

public class e1075 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}