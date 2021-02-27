import java.io.IOException;

public class e1066 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n, par = 0, imp = 0, pos = 0, neg = 0;
        for (int i = 0; i < 5; i++) {
            n = in.nextInt();
            if (n > 0) {
                pos++;
            } else if (n < 0){
                neg++;
            }

            if (n % 2 == 0) {
                par++;
            } else {
                imp++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }
}