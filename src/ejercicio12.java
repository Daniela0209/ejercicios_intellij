import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {


        //Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

        Scanner lector = new Scanner(System.in);

        String palabra1;
        String palabra2;


        System.out.println("Ingrese la primera palabra");
        palabra1= lector.nextLine();

        System.out.println("Ingrese las segunda palabra");
        palabra2 = lector.nextLine();

        if (palabra1.equals(palabra2)){
            System.out.println("Son iguales la palabra "+palabra1+" y "+palabra2 );

        }else{
            System.out.println("Son diferentes la palabra "+palabra1+" y "+palabra2);
        }


    }
}

