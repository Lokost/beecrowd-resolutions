import java.io.IOException;

public class e1096 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        int i = 1, j;
        while (i <= 9) {
            j = 7;
            for (int a = 1; a <= 3; a++) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            i += 2;
        }

    }
}