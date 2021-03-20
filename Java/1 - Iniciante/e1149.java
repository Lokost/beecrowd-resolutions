import java.io.IOException;

public class e1149 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), soma = 0, inteiros = 0, n = 0;
        if (x > 0) {
            soma++;
            inteiros += 1;
            n++;
        }
        while (inteiros < 2) {
            if (y > 0) {
                soma += y;
                inteiros += 1;
                n += 1;
            } else {
                y = in.nextInt();
            }
        }
        soma += inteiros + n;
        System.out.println(soma);


    }
}