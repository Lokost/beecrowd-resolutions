import java.io.IOException;

public class e1012 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a, b, c, tri, cir, tra, qua, ret;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        tri = (a * c) / 2;
        cir = 3.14159 * (c * c);
        tra = (c * (a + b)) / 2;
        qua = b * b;
        ret = a * b;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", tri, cir, tra, qua, ret);

    }
}