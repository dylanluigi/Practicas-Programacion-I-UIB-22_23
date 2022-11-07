import java.util.stream.*;

public class Main {


    static int index = 5;

    public static void main(String[] args){

        Character llegit = ' ';
        Character lletraContar = ' ';
        int amount_read = 0;
        LT lt = new LT();


        System.out.println("Quina lletra vols llegir? ");
        lletraContar = Subprogrames.llegeixChar();


        System.out.print("Introdueix una frase: ");
        char[] paraula = lt.llegirLiniaC();
        int[] contador = new int[paraula.length];




        for (int i = 0; i < paraula.length; i++) {
            contador[i]=0;
        }


        for (int i = 0; i < paraula.length; i++) {

            if (paraula[i]==lletraContar){
                contador[i]=contador[i]+1;
            }


        }

        for (int i = 0; i < paraula.length; i++) {
            System.out.print(paraula[i]);
        }

        System.out.print('\n');

        for (int i = 0; i < paraula.length; i++) {
            System.out.print(contador[i]);
        }

        System.out.print('\n');

        int suma = IntStream.of(contador).sum();
        System.out.println("El total de "+ lletraContar+ "'s es de "+suma);




        /*/
        for (int i = 0; i < paraula.length; i++) {

            llegit = Subprogrames.llegeixChar();
            paraula[i]=llegit;
            index++;

        }



        for (int i = 0; i < paraula.length; i++) {
            if (paraula[i] == 'a'){
                amount_read++;
            }
        }
        */




    }

}
