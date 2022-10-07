import java.lang.Math;

import static java.lang.Double.NaN;

public class Main {
    public static void main(String[] args) {
        
        //Declaracio de variables i classes
        
        double a=0, b=0, c=0, x1=0, x2=0;
        boolean validat=false, num_validation=false;
        LT lt = new LT();

        System.out.println("Benvolgut a la calculadora d'equacions de segon grau!");
        System.out.println("Per poder utilitzar aquesta versió introdueix els termes a, b ,c de l'expressió ax^2+bx+c=0");
        
        /*/
        Seccio del programa que agafa els inputs dels termes i els
        valida (son numeros?), per poder tornar a demanar l'input
        un altre pic si es erroni.
        /*/

        do {
            try {

                do {
                    System.out.print("Introdueix el terme a: ");
                        a = lt.llegirReal();
                    System.out.println();
                    System.out.print("Introdueix el terme b: ");
                        b = lt.llegirReal();
                    System.out.println();
                    System.out.print("Introdueix el terme c: ");
                        c = lt.llegirReal();
                    num_validation=true;
                    System.out.println("Es aquesta l'expressió algebraica a resoldre? " + a + "x^2 + " + b + "x + " + c + " = 0");
                    System.out.println("[y/n]");
                    char validacio = lt.llegirCaracter();
                    if (validacio == 'y') {
                        validat = true;
                    } else if (validacio == 'n') {
                        validat = false;
                    }
                } while (!validat);

            } catch (Exception e) {
                System.out.println("No has introduit un numero! Torna ha introduir el numero.");
            }
        }while (num_validation!=true);

        /*/
        
        ****Programa de inputs sense catch****
        
        
        do {
        System.out.print("Introdueix el terme a: ");
        a = lt.llegirReal();
        System.out.println();
        System.out.print("Introdueix el terme b: ");
        b =lt.llegirReal();
        System.out.println();
        System.out.print("Introdueix el terme c: ");
        c = lt.llegirReal();

        System.out.println("Es aquesta l'expressió algebraica a resoldre? "+a+"x^2+"+b+"x+"+c+"=0");
        System.out.println("[y/n]");
            char validacio = lt.llegirCaracter();
            if (validacio=='y'){
               validat=true;
            } else if (validacio=='n') {
            validat=false;
          }
        }while (!validat);
        
        
/*/ 

        //Calcul de arrels

        x1=((-b)+Math.sqrt((b*b)-4*a*c))/(2*a);

        x2=((-b)-Math.sqrt((b*b)-4*a*c))/(2*a);

        /*/
        Validació dels termes per donar un output != a NaN emprant la funció Double.isNaN() que correspon a un valor
        Boolea
        /*/
        
        if(Double.isNaN(x1)){
            System.out.println("x1 no te solució.");
        }else{
            System.out.println("La solucio de x1 és: " +x1);
        }

        if(Double.isNaN(x2)){
            System.out.println("x2 no te solució.");
        }else{
            System.out.println("La solucio de x2 és: "+x2);
        }

    }
}
