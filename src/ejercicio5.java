


public class ejercicio5 {

    public static void main(String[] args) {

        //Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

        int contador=0;

        while (contador<=99){
            if(contador%2==0)
                System.out.println("Par "+contador);
            contador++;

            if (contador%2 !=0 ){
                System.out.println("impar "+contador);
                contador++;
            }
        }
    }
}
