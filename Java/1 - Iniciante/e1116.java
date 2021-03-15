import java.io.IOException;

public class e1116 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        double div, x, y;
        for (int i = 1; i <= n; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                div = x / y;
                System.out.format("%.1f%n" , div);
            }
        }

    }
}