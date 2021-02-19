

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {


        //Realizar una aplicación de consola, que al ingresar una frase por teclado elimine
        // los espacios que esta contenga.

        String fraseEspacios;
        Scanner lector = new Scanner (System.in);

        System.out.println("Ingrese una frase con espacios");
        fraseEspacios = lector.nextLine();

        System.out.println(fraseEspacios.replace(" ",""));

    }
}
