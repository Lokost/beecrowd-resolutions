import java.io.IOException;

public class e1149 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), soma = 0;
        while (y <= 0) {
            y = in.nextInt();
        }
        for (int i=1; i <= y; i++) {
            soma += x;
            x++;
        }
        System.out.println(soma);


    }
}