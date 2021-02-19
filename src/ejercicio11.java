import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {


        //Realizar  la  construcción  de  un  algoritmo  que  permita  de  acuerdo  a  una  frase pasada
        // por  consola,  indicar  cual  es  la  longitud  de  esta  frase,  adicionalmente cuantas vocales
        // tiene de “a,e,i,o,u”.

        Scanner lector = new Scanner(System.in);

        int contador=0;
        String frase;

        System.out.println("Ingrese una frase");
        frase= lector.nextLine();

        System.out.println("La frase ingresada "+frase);
        System.out.println("El tamaño de la frase es de "+frase.length() + " caracteres" );



        for(int d=0;d<frase.length();d++) {
            if ((frase.charAt(d)=='a') || (frase.charAt(d)=='A')
                    || (frase.charAt(d)=='e') || (frase.charAt(d)=='E')
                    || (frase.charAt(d)=='i')|| (frase.charAt(d)=='I') ||
                    (frase.charAt(d)=='o')|| (frase.charAt(d)=='O')
                    || (frase.charAt(d)=='u') || (frase.charAt(d)=='U'))
            {
                contador++;

                System.out.println("La frase: "+frase +", contiene "+contador +" vocales");
            }
        }
    }


}
