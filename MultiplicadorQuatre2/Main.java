public class Main {

    private static int ProgState;
    private static int Subprograma;

    public static void main(String[] args) {

        int[] NumbArray = new int[20];
        int max=1;
        int[] numbarray = new int[max];
        LT lt = new LT();


        Subprogrames.Menu2opcInici("Calcular divisors de 4.", "Sortir.", "Calculadora de divisors de 4.");
        ProgState = lt.llegirSencer();
        System.out.println();
        if(ProgState == 1){
            Subprogrames.Menu3opcInici("Calcular 20 numeros.", "Calcular n numeros", "Sortir", "Quina opcio vols fer?");
            Subprograma = lt.llegirSencer();
            System.out.println();
        }

        while (ProgState == 1){

                while (Subprograma == 1) {
                    System.out.println();
                    System.out.println("**************************");
                    System.out.println("    Calculadora 20 num");
                    System.out.println("**************************");
                    System.out.println();
                    System.out.println("Introdueix els numeros a calcular.");

                    for (int i = 0; i < 20; i++) {
                        System.out.print("Numero: ");
                        NumbArray[i] = lt.llegirSencer();
                    }

                    for (int i = 0; i < NumbArray.length; i++) {

                        if (Subprogrames.EsMultipleQuatre(NumbArray[i])) {
                            System.out.println(NumbArray[i] + " es multiple");
                        } else if (!Subprogrames.EsMultipleQuatre(NumbArray[i])) {
                            System.out.println(NumbArray[i] + " no es multiple");
                        }


                    }

                    System.out.println();
                    Subprogrames.Menu3opcInici("Calcular 20 numeros.", "Calcular n numeros", "Sortir", "Quina opcio vols fer?");
                    Subprograma = lt.llegirSencer();


                }

                while (Subprograma == 2) {

                    System.out.println("**************************");
                    System.out.println("   Calculadora n num's");
                    System.out.println("**************************");
                    System.out.println('"'+"Per finalitzar el calcul introdueix un zero"+'"');
                    System.out.println();


                    for (int i = 0; i < numbarray.length; i++) {
                        System.out.print("Numero: ");
                        numbarray[i]= lt.llegirSencer();
                        if(numbarray[i]==0){
                            break;
                        }
                        numbarray=Subprogrames.increaseSize(numbarray);
                    }

                    for (int i = 0; i < numbarray.length -1; i++) {
                        if (Subprogrames.EsMultipleQuatre(numbarray[i])){
                            System.out.println(numbarray[i]+" es multiplé de 4.");
                        } else if (!(Subprogrames.EsMultipleQuatre(numbarray[i]))) {
                            System.out.println(numbarray[i]+" no es multiplé de 4.");
                        }
                    }



                    System.out.println();
                    Subprogrames.Menu3opcInici("Calcular 20 numeros.", "Calcular n numeros", "Sortir", "Quina opcio vols fer?");
                    Subprograma = lt.llegirSencer();


                }

                if (Subprograma==3){
                    ProgState = 0;
                }



        }

        System.out.println();

        System.out.println("**************************");
        System.out.println("         Adeu!");
        System.out.println("**************************");






    }
}