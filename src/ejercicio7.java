
import java.util.Scanner;

public class ejercicio7 {



    public static void main(String[] args) {


        //Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        // si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

        Scanner lector = new Scanner (System.in);



        int numero;
        boolean k = true;
        do {
            System.out.println("Digite un número mayor o igual que cero");
            numero = lector.nextInt();
            if (numero>=0){
                k = false;
            }


        } while(k);






    }
}




