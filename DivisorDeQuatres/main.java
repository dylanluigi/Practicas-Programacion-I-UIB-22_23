public class Main {
    public static void main(String[] args) throws Exception {
        int ProgState;
        int[] IntArray;

        //IU
        Subprogrames.Menu2opcInici("Calcular divisors de 4.", "Sortir.", "Calculadora de divisors de 4.");
        ProgState = Subprogrames.llegeixInt();


        //Inicialitzacio
        while (ProgState == 1){

            System.out.println("Introdueix una secuencia de numeros a evaluar separats per un espai:");
            IntArray = Subprogrames.llegirSeqIntv2();

            System.out.println();

            for (int i = 0; i < IntArray.length; i++) {

                Boolean hoes = Subprogrames.EsMultipleQuatre(IntArray[i]);

                if (IntArray[i]!=0){
                    if (hoes){
                        System.out.println(IntArray[i]+ " es multiple!");
                    }
                    else if (!hoes){
                        System.out.println(IntArray[i]+ " no es multiple!");
                    }
                } else if (IntArray[i]==0) {
                    System.out.println(IntArray[i]+ " no es multiple!");
                }


            }

            Subprogrames.Menu2OpReit("Calcular divisors de 4.", "Sortir.");
            ProgState = Subprogrames.llegeixInt();


        }


        System.out.println("**************************");
        System.out.println("         Adeu!");
        System.out.println("**************************");
    }
}
