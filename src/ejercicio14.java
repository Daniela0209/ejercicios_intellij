import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {


        //Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde
        // el numero introducido hasta 1000 con saldos de 2 en 2.


        Scanner lector = new Scanner(System.in);

        int numero;



        System.out.println("Digite un número entero");
        numero= lector.nextInt();


        if (numero>=0){
            for (numero=numero;numero<=1000; numero++){
                System.out.println(numero);
                numero= (numero+1);
            }
        }






    }
}
