package ejercicio17;


public class realizacion {

    public realizacion() {

    }

    public static void main(String[] args) {
        electrodomestico[] listaElectrodomesticos = new electrodomestico[]
                {new electrodomestico(200.0D, 60.0D, 'C', "Verde"),
                        new lavadora(150.0D, 30.0D),
                        new television(500.0D, 80.0D, 'E', "negro", 42, false),
                        new electrodomestico(), new electrodomestico(600.0D, 20.0D, 'D', "gris"),
                        new lavadora(300.0D, 40.0D, 'Z', "blanco", 40),
                        new television(250.0D, 70.0D), new lavadora(400.0D, 100.0D, 'A', "verde", 15),
                        new television(200.0D, 60.0D, 'C', "naranja", 30, true),
                        new electrodomestico(50.0D, 10.0D)};
        double sumElectrodomesticos = 0.0D;
        double sumTelevisiones = 0.0D;
        double sumLavadoras = 0.0D;

        for (int i = 0; i < listaElectrodomesticos.length; ++i) {
            if (listaElectrodomesticos[i] instanceof electrodomestico) {
                sumElectrodomesticos += listaElectrodomesticos[i].valorFinal();
            }

            if (listaElectrodomesticos[i] instanceof lavadora) {
                sumLavadoras += listaElectrodomesticos[i].valorFinal();
            }

            if (listaElectrodomesticos[i] instanceof television) {
                sumTelevisiones += listaElectrodomesticos[i].valorFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de: [" + sumElectrodomesticos + "]");
        System.out.println("La suma del precio de las lavadoras es de: [" + sumLavadoras + "]");
        System.out.println("La suma del precio de las televisiones es de: [" + sumTelevisiones + "]");
        System.out.println("----------");
        System.out.println("Total");
        System.out.println("----------");
        System.out.println(sumTelevisiones + sumLavadoras + sumElectrodomesticos);
        System.out.println("-------------");
        System.out.println("Gracias por su compra ;)");
    }

}
