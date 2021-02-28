import java.io.IOException;

public class e1080 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int maior = 0, p = 0;
        for (int i = 1; i <= 100; i++) {
            int x = in.nextInt();
            if (x > maior) {
                maior = x;
                p = i;
            }
        }
        System.out.println(maior);
        System.out.println(p);

    }
}