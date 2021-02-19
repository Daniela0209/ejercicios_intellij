package ejercicio16;

public class usuario {
    private static final char DEFAULT_SEX = 'H';
    private static final int sobrepeso = 1;
    private static final int infrapeso = -1;
    private static final int pesoIdeal = 0;
    private char sexo;
    private float peso;
    private float altura;
    private String nombre;
    private int edad;
    private int DNI;
    private char letraDNI;


    public usuario() {

        this.nombre = "";
        this.edad = 0;
        this.DNI = this.generaDNI();
        this.letraDNI = this.generaLetraDNI();
        this.sexo = 'H';
        this.peso = 0.0F;
        this.altura = 0.0F;
    }

    public usuario(String nombre, int edad, String sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.generaDNI();
        this.letraDNI = this.generaLetraDNI();
        this.sexo = this.comprobarSexo(sexo.charAt(0));
        this.peso = 0.0F;
        this.altura = 0.0F;
    }

    public usuario(String nombre, int edad, String sexo, float peso, float altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.generaDNI();
        this.letraDNI = this.generaLetraDNI();
        this.sexo = this.comprobarSexo(sexo.charAt(0));
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        float imc = this.peso / (float)((int)Math.pow((double)(this.altura / 100.0F), 2.0D));
        if (imc >= 25.0F) {
            return 1;
        } else {
            return (double)imc < 18.5D ? -1 : 0;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public String toString() {
        return "La información del usuario es :\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nDNI : " + this.DNI + "-" + this.letraDNI + "\nSexo: " + (this.sexo == 'H' ? "Hombre" : "Mujer") + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\n";
    }

    private char comprobarSexo(char sexo) {
        return (char)(sexo != 'M' && sexo != 'm' ? 'H' : 'M');
    }

    private int generaDNI() {
        return (int)(Math.random() * 1.0E8D);
    }

    private char generaLetraDNI() {
        String letras = "JHDSHKLSDJÑEOAJFLEJDFH";
        return letras.charAt(this.DNI % 23);
    }
}
