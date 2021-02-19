package ejercicio16;

public class main {
    public main(){}

    public static void main(String[]args){

        boolean sobrepeso = true;
        boolean infrapeso = true;
        boolean pesoIdeal = false;

        inicio inicio = new inicio();

        System.out.println("Obtencion de datos");

        System.out.println("//////////////////////////");

        String nombre = inicio.adquirirString("Digita el nombre del usuario: ");
        int edad = inicio.adquirirEntero("Digita la edad del usuario " + nombre);

        String sexo = inicio.adquirirString("Digita el sexo del usuario " + nombre);
        float peso = inicio.adquirirFloat("Digita el peso del usuario " + nombre);

        float altura = inicio.adquirirFloat("Digita la altural del usuario " + nombre);

        System.out.println("\nCreacion del usuario");
        System.out.println("//////////////////////////");

        usuario p1 = new usuario();
        System.out.println("Usuario 1 creado");

        usuario p2 = new usuario(nombre, edad, sexo);
        System.out.println("Usuario 2 creado");

        usuario p3 = new usuario(nombre, edad, sexo, peso, altura);
        System.out.println("Usuario 3 creado");

        System.out.println("\nRelacion de pesos");
        System.out.println("//////////////////////////");

        System.out.print("El peso del usuario 1 es: ");

        switch(p1.calcularIMC()) {
            case -1:
                System.out.println("infrapeso");
                break;
            case 0:
                System.out.println("peso ideal");
                break;
            case 1:
                System.out.println("sobrepeso");
        }

        System.out.print("El peso del usuario 2 es: ");
        switch(p2.calcularIMC()) {
            case -1:
                System.out.println("infrapeso");
                break;
            case 0:
                System.out.println("peso ideal");
                break;
            case 1:
                System.out.println("sobrepeso");
        }

        System.out.print("El peso del usuario 3 es: ");
        switch(p3.calcularIMC()) {
            case -1:
                System.out.println("infrapeso");
                break;
            case 0:
                System.out.println("peso ideal");
                break;
            case 1:
                System.out.println("sobrepeso");
        }

        System.out.println("\nMuestra de mayor edad");
        System.out.println("//////////////////////////");
        System.out.println("El usuario 1 es: " + (p1.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
        System.out.println("El usuario 2 es: " + (p2.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
        System.out.println("El usuario 3 es: " + (p3.esMayorDeEdad() ? "Mayor de edad" : "Menor de edad"));
        System.out.println("\nVisualización de todos los datos");
        System.out.println("//////////////////////////");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
