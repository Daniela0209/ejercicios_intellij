import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        boolean opcionSalida=true;
        int opcionMenu;

        while (opcionSalida){

            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n");

            System.out.println("Digite uno de los número que se muestra en el menú");
            opcionMenu=lector.nextInt();

            switch (opcionMenu){
                case 1:
                    System.out.println("nuevo actor");
                    break;
                case 2:
                    System.out.println("Buscar");
                    break;
                case 3:
                    System.out.println("eliminar");
                    break;
                case 4:
                    System.out.println("modificar");
                    break;
                case 5:
                    System.out.println("ver actores");
                    break;
                case 6:
                    System.out.println("peliculas de los actores");
                    break;
                case 7:
                    System.out.println("categorias de los actores");
                    break;
                case 8:
                    opcionSalida=false;

                default:
                    System.out.println("Opción incorrecta");

            }
        }
    }

}
