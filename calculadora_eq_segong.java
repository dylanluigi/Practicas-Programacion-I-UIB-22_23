import java.util.Random;


public class Main {


    public static void main(String[] args) {

        LT lt = new LT();
        boolean si_numero = false;
        int quant_aposta = 0;
        int total = 2999;
        int rondes = 0;

        do {

            try {
                System.out.println("Quantes rondes vols jugar? ");
                rondes = lt.llegirSencer();
                System.out.print("Quant de doblers vols apostar? ");
                quant_aposta = lt.llegirSencer();
                si_numero= true;

            } catch (Exception e) {
                System.out.println("No has introduit un numero!");

            }

        }while (!si_numero);

        for (int contador = 0; contador <=rondes ; contador++) {

            int randomaposta = randomNumero(0, 1 );

            if (randomaposta==0){
                total=total+(quant_aposta*2);
                System.out.println("Enhorabona has guanyat! El teu total es de "+total);
            }else if(randomaposta==1){
                total=total-quant_aposta;
                System.out.println("Oh no! Has perdut contra la CPU, el teu total es de "+total);
            }
        }
///
///     do {
///     }while ((total>2) && (quant_aposta<total) && (contador<=rondes));
///



    }

    static int randomNumero(int min, int max){

        Random rand = new Random();

        int numerorando = rand.nextInt((max - min) + 1) + min;

        return numerorando;
    }

}
