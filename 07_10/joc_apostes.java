import java.util.Random;


public class Main {


    public static void main(String[] args) {
        
      
      //Declaración de variables y classe LT
      
        LT lt = new LT();
        boolean si_numero = false;
        int quant_aposta = 0;
        int total = 2999;
        int rondes = 0;

      //Bucle con try{}catch para asegurarse de que las variables son validas
      
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

      //Bucle for para jugar las rondas.
      
        for (int contador = 0; contador <=rondes ; contador++) {
              
          //Llamada de la funcion randomNumero(min, max) para generar el resultado del numero ganador por ronda
            int randomaposta = randomNumero(0, 1 );

            if (randomaposta==0){
                total=total+(quant_aposta*2);
                System.out.println("Enhorabona has guanyat! El teu total es de "+total);
            }else if(randomaposta==1){
                total=total-quant_aposta;
                System.out.println("Oh no! Has perdut contra la CPU, el teu total es de "+total);
            }
        }

      
      /*/
      A este programa le faltaria una restructuracion para incluir la opcion de dejar de apostar en una ronda/apostar otra cantidad.
      Se puede hacer con un 'if' dentro del 'for' statement con un buleano, añadiendo la condicion for(inicio, contador<=rondes && booleano, contador++)
      /*/



    }

    static int randomNumero(int min, int max){

        Random rand = new Random();

        int numerorando = rand.nextInt((max - min) + 1) + min;

        return numerorando;
    }

}
