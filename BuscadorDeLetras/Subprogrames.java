import java.util.Random;
import java.util.stream.IntStream;

public class Subprogrames {

    static Character llegit = ' ';
    static Integer intLlegit = 0;

    static char[] paraula;

    static Character llegeixChar(){
        LT lt = new LT();
        do {
            try {
                llegit = lt.llegirCaracter();

            }catch (Exception e){
               // System.out.println("Introdueix un character.");
            }
            //System.out.print("Introdueix un character.");
        }while (llegit==null);

        return llegit;
    }


    static Integer llegeixInt(){
        LT lt = new LT();
        do {
            try {
                intLlegit = lt.llegirSencer();

            }catch (Exception e){
                System.out.println("Introdueix un sencer: ");
            }
            System.out.print("Introdueix un sencer: ");
        }while (intLlegit==null);

        return intLlegit;
    }


    static void Menu2opcInici(String Opcio1, String Opcio2, Integer doblers){

        System.out.println("*************************");
        System.out.println("      JOC APOSTES ");
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);

        System.out.println("Tens "+doblers+"€");

        System.out.print("Que vols elegir? ");


    }

    static void Menu2opciReit(String Opcio1, String Opcio2, Integer doblers){

        System.out.println("*************************");
        System.out.println("   Vols tornar a jugar? ");
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);

        System.out.println("Et queden "+doblers+"€");


    }


    static void Menu3opciReit(String Opcio1, String Opcio2, String Opcio3, Integer doblers){

        System.out.println("*************************");
        System.out.println("   Vols tornar a jugar? ");
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);
        System.out.println("3 - " + Opcio3);

        System.out.println("Et queden "+doblers+"€");


    }

    static void Menu4opciReit(String Opcio1, String Opcio2, String Opcio3, String Opcio4, Integer doblers){

        System.out.println("*************************");
        System.out.println("   Vols tornar a jugar? ");
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);
        System.out.println("3 - " + Opcio3);
        System.out.println("4 - " + Opcio4);
        System.out.println("Et queden "+doblers+"€");


    }


    static int RandomNum(int max, int min){

        Random rand = new Random();

        int RandomNumb = rand.nextInt((max - min) + 1) + min;

        return RandomNumb;

    }

    static void printIntArray(char[] frase){

        for (int i = 0; i < frase.length; i++) {
            System.out.println(frase[i]);
        }
    }

    static void printCharArray(int[] numero){

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

    static int contadorLletra(char[] paraula, char lletraContar){

        int[] contador = new int[paraula.length];
        int total = 0;

        for (int i = 0; i < paraula.length; i++) {

            if (paraula[i]==lletraContar){
                contador[i]=contador[i]+1;
            }


        }

        total = IntStream.of(contador).sum();

        return total;
    }

    static int contadorNumero(int[] numeros, int numContar){

        int[] contador = new int[numeros.length];
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i]==numContar){
                contador[i]=contador[i]+1;
            }


        }

        total = IntStream.of(contador).sum();

        return total;
    }

    static int[] setterZeros(int index){

        int[] IntArray = new int[index];

        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i]=0;
        }

        return IntArray;

    }


    static int[] CustomIntArray(int numeroBase, int index){

        int[] IntArray = new int[index];

        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i]= numeroBase;
        }

        return IntArray;
    }


    static char[] GetSentenceValid(){
        LT lt = new LT();
        //System.out.print("Introdueix una frase: ");
        do {
            try {
                System.out.print("Introdueix una frase: ");
                paraula = lt.llegirLiniaC();

            }catch (Exception e){
                System.out.println("Frase Incorrecta!");
            }
            //System.out.println("Introdueix una frase: ");
        }while (paraula==null);


        return paraula;

    }


}
