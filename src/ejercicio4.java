

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        // Lee  un  número  por  teclado  que  pida  el  precio  de  un  producto
        // (puede  tener decimales) y calcule el precio final con IVA.
        // El IVA sera una constante que sera del 21%.
        Scanner lector = new Scanner (System.in);

        Double precio;
        Double precioFinal;

        System.out.println("Ingresa el precio del producto");
        precio = lector.nextDouble();

        precioFinal = (precio * 0.21);

        System.out.println("El precio final con el IVA es de: "+precioFinal);

    }
}
