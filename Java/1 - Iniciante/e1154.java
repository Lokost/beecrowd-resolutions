import java.io.IOException;

public class e1154 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int N = in.nextInt(), cont = 0;
        double media = 0;
        if (N > 0) {
            while (N > 0) {
                media += N;
                cont++;
                N = in.nextInt();
            }
            System.out.format("%.2f", media / cont);
        }

    }
}