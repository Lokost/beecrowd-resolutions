import java.io.IOException;

public class e1146 {

    public static void main(String[] args) throws IOException {

        // Funcional no URi
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            for (int i = 1; i <= n; i++){
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
            System.out.print("\n");
            n = in.nextInt();
        }

    }
}