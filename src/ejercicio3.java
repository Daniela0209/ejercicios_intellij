

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        //Haz una aplicación que calcule el área de un circulo(pi*R2). El radio se pedirá por teclado
        // (recuerda  pasar  de  String  a  double  conDouble.parseDouble).  Usa  la constante PI
        // y el método pow de Math.

        Scanner lector = new Scanner (System.in);

        Double radio;

        System.out.println("Ingrese el radio del circulo");
        radio = lector.nextDouble();

        double area=Math.PI*Math.pow(radio, 2);

        System.out.println("El area del circulo es "+area);


    }
}
