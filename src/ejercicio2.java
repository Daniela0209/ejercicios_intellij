
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        //Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
        // menores o iguales

        Scanner lector = new Scanner (System.in);

        int numero1;
        int numero2;


        System.out.println("Ingrese un número para la variable 1");
        numero1 = lector.nextInt();

        System.out.println("Ingrese un número para la variable 2");
        numero2 = lector.nextInt();

        if (numero1>=numero2){
            if(numero1==numero2){
                System.out.println("Los numeros "+numero1+" y "+numero2+" son iguales");
            }else{
                System.out.println("El número "+numero1+" es mayor que el número "+numero2);
            }
        }else{
            System.out.println("El número "+numero2+" es mayor que el número "+numero1);
        }
    }

}
