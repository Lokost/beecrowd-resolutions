// Funcional no beecrowd!
public class e1103 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        while (true) {
            int h1 = in.nextInt();
            int m1 = in.nextInt();
            int h2 = in.nextInt();
            int m2 = in.nextInt();

            if (h1 + h2 + m1 + m2 == 0) {
                break;
            } else if (h1 < 24 && m1 < 60 && h2 < 24 && m2 < 60) {
                mediaTime(h1, h2, m1, m2);
            }
        }
    }

    public static void mediaTime(int h1, int h2, int m1, int m2) {
        int th, tm, tt;

        if (h2 > h1) {
            th = h2 - h1;
        } else if (h2 < h1) {
            th = 24 - (h1 - h2);
        } else {
            th = 0;
        }

        if (m2 > m1) {
            tm = m2 - m1;

        } else if (m2 < m1) {
            if (th == 0) {
                th = 23;
            } else {
                th--;
            }

            tm = 60 - (m1 - m2);

        } else {
            if (th == 0) {
                th = 24;
            }
            tm = 0;
        }

        tt = tm + th * 60;
        System.out.println(tt);
    }
}
