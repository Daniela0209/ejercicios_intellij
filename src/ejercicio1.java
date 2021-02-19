

public class ejercicio1 {

    public static void main(String[] args) {

        //Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de  los  dos.
        // Si  son  iguales  indicarlo también.  Ve  cambiando  los  valores  para comprobar que funciona.

        int numero1 = 50;
        int numero2 = 100;

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
