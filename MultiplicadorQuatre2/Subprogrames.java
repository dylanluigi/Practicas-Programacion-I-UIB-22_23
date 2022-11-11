import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.stream.IntStream;

public class Subprogrames {

    private static Character charLleg = null;
    private static int intLlegit= 0;
    private static boolean intVal = false;

    private static boolean charVal = false;

    private static LT lt = new LT();
    static char[] paraula;


    static char llegeixChar(){

        while (charLleg==null){
            try {
                charLleg = lt.llegirCaracter();
                charVal = true;
            }catch (Exception e){
                System.out.println("No es un caracter!");
            }
            if (charLleg==null){
                System.out.println("No has introduit res!");
                System.out.print("Torna a introduir un caracter: ");
            }

        }

        /*
        do {
            try {
                charLleg = lt.llegirCaracter();

            }catch (Exception e){
               System.out.println("No es un caracter! ");
            }
            //System.out.print("Introdueix un character.");
        }while (charLleg ==null);
        */

        return charLleg;
    }


    static int llegeixInt(){
        while (!intVal){
            try{
                intLlegit=lt.llegirSencer();
                intVal = true;
            }catch (Exception e){
                System.out.println("No es un sencer!");
            }

        }

        /*
        do {
            try {
                intLlegit = lt.llegirSencer();

            }catch (InputMismatchException e){
                e.printStackTrace();
                System.out.print("No es un sencer! ");
            }
        }while (intLlegit==null);

        */


        /*
        while (intLlegit==null){
            try {
                intLlegit= lt.llegirSencer();
            }catch (Exception e){
                System.out.println("No es sencer! ");
            }
        }
        */

        return intLlegit;
    }


    static void Menu2opcInici(String Opcio1, String Opcio2, String ProgName){

        System.out.println("*************************");
        System.out.println(">> " + ProgName);
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);


        System.out.print("Que vols elegir? ");


    }

    static void Menu3opcInici(String Opcio1, String Opcio2, String Opcio3 ,String ProgName){

        System.out.println("*************************");
        System.out.println(">> " + ProgName);
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);
        System.out.println("3 - " + Opcio3);


        System.out.print("Que vols elegir? ");


    }


    static void Menu2OpReit(String Opcio1, String Opcio2){

        System.out.println("*************************");
        System.out.println(">> Que vols fer?");
        System.out.println("*************************");
        System.out.println("1 - " + Opcio1);
        System.out.println("2 - " + Opcio2);


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

    static void printIntArray(int[] frase){

        for (int i = 0; i < frase.length; i++) {
            System.out.print(frase[i]);
            System.out.println();
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
        do {
            try {
                System.out.print("Introdueix una frase: ");
                paraula = lt.llegirLiniaC();

            }catch (Exception e){
                System.out.println("Frase Incorrecta!");
            }

        }while (paraula==null);


        return paraula;

    }


    static int[] llegirSeqIntv2() throws Exception{

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s = b.readLine();
        String[] numeroSt = s.split(" ");
        int[] numeros = new int[numeroSt.length];

        for (int i = 0; i < numeroSt.length; i++) {
            try {
                int a = Integer.parseInt(numeroSt[i]);
                numeros[i]=a;

            } catch (Exception e) {
                System.out.printf("%s no es un enter\r\n", numeroSt[i]);
            }
        }
        return numeros;
    }

    static boolean EsMultipleQuatre(int n)
    {
        if (( n % 4 )==0) {
            return true;
        }
        return false;
    }

    static int[] increaseSize(int[] numbarray) {
        int[] temp = new int[numbarray.length + 1];

        for (int i = 0; i < numbarray.length; i++){

            temp[i] = numbarray[i];

        }
        return temp;
    }


}
