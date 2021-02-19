

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        //Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza  todas las a del
        // String  anterior  por  una e,  adicionalmente  concatenar  a  esta  frase  una adicional
        // que ustedes quieran incluir por consola y las muestre luego unidas.

        Scanner lector = new Scanner (System.in);

        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String adicional;


        System.out.println("La sonrisa sera la mejor arma contra la tristeza");

        frase= frase.replace('a','e');

        System.out.println(frase);
        System.out.println(" agrega una frase adicional ");
        adicional = lector.nextLine();

        System.out.println( frase + " "+ adicional );
    }
}
