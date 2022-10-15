public class Main {

    public static void main(String[] args) {
        //Programa principal.
        int numero;

        System.out.println("Benvingut al programa al conta A.");
        //Cridam al programa que volem emprar, en aquest cas contaA amb catch.
        numero = contaAcatch();

        System.out.println("Has introduit "+numero+" a's.");

    }

    static Integer contaA(){
        /*/
        Aquest programa llegeix tots el caracters introduits, siguin o no lletres, 
        i els llegeix, si son 'a' afageix un valor al int numero.
        /*/
      
        LT lt = new LT();

        int numero = 0;

        char lletraLlegida = ' ';

        
      
        //Do while el caracter introduit no sigui '.'
      
        do {
            System.out.println("Escriu una lletra: ");
            lletraLlegida = lt.llegirCaracter();

          //Si la letra leida es 'a' suma uno al valor de numero 
          
            if (lletraLlegida == 'a') {
                numero++;
            }

        //Se cancela el bucle si es '.'
        }while (lletraLlegida!='.');

        return numero;
    }


    static Integer contaAcatch(){
      
         /*/
        Aquest programa llegeix el caracter introduit, si no es un Character executa el Exception,
        demana un altre caracter continuant amb la suma. (No dona exception amb els numeros?)
        /*/
      
        LT lt = new LT();
        int numero=0;
        boolean numeroTrue = false;
        char lletraLlegida = ' ';

      do {
        //Para que siga el bucle aunque salga una Exception
          try {
              do {
                  
                  System.out.print("Escriu una lletra: ");
                  lletraLlegida = lt.llegirCaracter();
                  //Si la letra leida es 'a' suma uno al valor de numero
                  if (lletraLlegida == 'a') {
                      numero++;
                  }
              //Se cancela el bucle si es '.'
              }while (lletraLlegida!='.');
              
              numeroTrue = true;

          }catch (Exception e){
              System.out.println("No has introduit una lletra!");
          }
      }while (numeroTrue==false);
        return numero;
    }



}
