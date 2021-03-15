import java.io.IOException;

public class e1134 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int t = 0, al = 0, ga = 0, di = 0;
        while (t != 4) {
            t = in.nextInt();
            switch(t) {
                case 1 -> al++;
                case 2 -> ga++;
                case 3 -> di++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + al);
        System.out.println("Gasolina: " + ga);
        System.out.println("Diesel: " + di);

    }
}