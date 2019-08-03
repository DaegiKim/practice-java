package string;

import java.util.concurrent.TimeUnit;

public class StringApp {

    public static final int LOOP = 100_000;

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(1000);

        String s = "a";

        long start = System.currentTimeMillis();

        for (int i = 0; i < LOOP; i++) {
            s = s+"a";
        }

        System.out.println(System.currentTimeMillis()-start+"ms");

        StringBuilder sb = new StringBuilder("a");

        start = System.currentTimeMillis();

        for (int i = 0; i < LOOP; i++) {
            sb.append("a");
        }

        System.out.println(System.currentTimeMillis()-start+"ms");

        StringBuffer sbf = new StringBuffer("a");

        start = System.currentTimeMillis();

        for (int i = 0; i < LOOP; i++) {
            sbf.append("a");
        }

        System.out.println(System.currentTimeMillis()-start+"ms");
    }
}
