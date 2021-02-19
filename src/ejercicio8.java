import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {


        //Crea una aplicación por consola que nos pida un día de la semana y que nos diga
        // si es un día laboral o no. Usa un switch para ello.
        Scanner lector = new Scanner (System.in);

        String diaSemana;

        System.out.println( "Días de la semana\n " + "1.LUNES\n " + "2.MARTES\n " + "3.MIÉRCOLES\n " + "4.JUEVES\n " +
                "5.VIERNES\n " + "6.SÁBADO\n " + "7.DOMINGO\n");

        System.out.println("Digite un día de la semana para verificar");
        diaSemana = lector.nextLine();


        switch (diaSemana){

            case "1":
                System.out.println("El día lunes es laboral");
                break;
            case "2":
                System.out.println("El día martes es laboral");
                break;
            case "3":
                System.out.println("El día miércoles es laboral");
                break;
            case "4":
                System.out.println("El día jueves es laboral");
                break;
            case "5":
                System.out.println("El día viernes es laboral");
                break;
            case "6":
                System.out.println("El día sabádo NO es laboral");
                break;
            case "7":
                System.out.println("El día domingo NO es laboral");
                break;

            default:
                System.out.println("Opción incorrecta");

        }
    }
}
