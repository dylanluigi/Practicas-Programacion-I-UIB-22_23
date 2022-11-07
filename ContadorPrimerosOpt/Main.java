import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    static void SieveOfAtkin(int limit)
    {
        // 2 y 3 son siempre primos
        if (limit > 2)
            System.out.print(2 + " ");

        if (limit > 3)
            System.out.print(3 + " ");

        // Iniciar criva con array de valores falsos

        boolean criva[] = new boolean[limit+1];



        for (int i = 0; i <= limit; i++)
            criva[i] = false;


        for (int x = 1; x * x <= limit; x++) {
            for (int y = 1; y * y <= limit; y++) {

                int n = (4 * x * x) + (y * y);
                if (n <= limit
                        && (n % 12 == 1 || n % 12 == 5))

                    criva[n] ^= true;

                n = (3 * x * x) + (y * y);
                if (n <= limit && n % 12 == 7)
                    criva[n] ^= true;

                n = (3 * x * x) - (y * y);
                if (x > y && n <= limit
                        && n % 12 == 11)
                    criva[n] ^= true;
            }
        }

        //Marco todos los multiples de cuadrados como no primos

        for (int r = 5; r * r <= limit; r++) {
            if (criva[r]) {
                for (int i = r * r; i <= limit;
                     i += r * r)
                    criva[i] = false;
            }
        }

        int total = 0;

        // Cuento cuantos hay
        for (int a = 5; a <= limit; a++) {
            if (criva[a]) {
                //System.out.print(a + " ");
                total = total + 1;
            }
        }
        System.out.println();
        System.out.println(total);

    }


    public static void main(String[] args)
    {

        int limit;
        limit = 1000000;
        long start = System.currentTimeMillis();
        SieveOfAtkin(limit);
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }


}
