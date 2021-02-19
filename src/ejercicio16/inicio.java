package ejercicio16;

import java.util.Scanner;

public class inicio {

    private Scanner inicio;

    public inicio() {
        this.inicio = new Scanner(System.in);
    }

    public int adquirirEntero(String msg) {
        boolean LOOP = true;
        int valor = 0;

        do {
            try {
                System.out.println(msg);
                String teclado = this.inicio.nextLine();
                valor = Integer.parseInt(teclado);

                LOOP = false;
            } catch (Exception var6) {
                System.out.println("Digite un número entero ");
            }
        } while(LOOP);

        return valor;
    }
    public float adquirirFloat(String msg) {
        boolean LOOP = true;
        float valor = 0.0F;

        do {
            try {
                System.out.println(msg);
                String teclado = this.inicio.nextLine();
                valor = Float.parseFloat(teclado);

                LOOP = false;
            } catch (Exception var6) {
                System.out.println("Digite un número decimal");
            }
        } while(LOOP);

        return valor;
    }
    public String adquirirString(String msg) {
        System.out.println(msg);
        return this.inicio.nextLine();
    }

    public char adquirirChar(String msg) {
        System.out.println(msg);
        return this.inicio.nextLine().charAt(0);
    }
}
