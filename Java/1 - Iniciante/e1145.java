import java.io.IOException;

public class e1145 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), i = 1;
        if (1 < x && x < 20 && x < y && y < 1000000) {
            while (i <= y) {
                if (i <= y) {
                    System.out.print(i);
                    i++;
                }
                for (int j = 1; j < x; j++) {
                    if (i <= y) {
                        System.out.print(" " + i);
                    }
                    i++;
                }
                System.out.print("\n");
            }
        }


    }
}