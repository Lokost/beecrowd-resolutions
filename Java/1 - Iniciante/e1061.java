import java.io.IOException;

public class e1061 {

    public static void main(String[] args) throws IOException {

        //
        java.util.Scanner in = new java.util.Scanner(System.in);
        String d1, d2, p1, p2, p3, p4;
        int di, df, h1, h2, m1, m2, s1, s2, dt = 0, ht = 0, mt = 0, st = 0, i, f, t;
        d1 = in.next();
        di = in.nextInt();
        h1 = in.nextInt();
        p1 = in.next();
        m1 = in.nextInt();
        p2 = in.next();
        s1 = in.nextInt();
        d2 = in.next();
        df = in.nextInt();
        h2 = in.nextInt();
        p3 = in.next();
        m2 = in.nextInt();
        p4 = in.next();
        s2 = in.nextInt();

        i = s1 + m1 * 60 + h1 * 3600 + di * 86400;
        f = s2 + m2 * 60 + h2 * 3600 + df * 86400;

        if (i < f) {
            t = f - i;
            dt = t/86400;
            t = t % 86400;
            ht = t/3600;
            t = t % 3600;
            mt = t/60;
            t = t % 60;
            st = t;
        }

        System.out.println(dt + " dia(s)");
        System.out.println(ht + " hora(s)");
        System.out.println(mt + " minuto(s)");
        System.out.println(st + " segundo(s)");

    }
}