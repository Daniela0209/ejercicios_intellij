package ejercicio18;


public class videojuegos implements entregable {


    private static final int horasEstimadasDef = 100;
    public static final int mayor = 1;
    public static final int menor = -1;
    public static final int igual = 0;
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompañia() {
        return this.compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public int compareTo(Object a) {
        int estado = -1;
        videojuegos ref = (videojuegos)a;
        if (this.horasEstimadas > ref.getHorasEstimadas()) {
            estado = 1;
        } else if (this.horasEstimadas == ref.getHorasEstimadas()) {
            estado = 0;
        }

        return estado;
    }

    public String toString() {
        return "Informacion del videojuego: \n\tTitulo: " + this.titulo + "\n\tHoras estimadas: " + this.horasEstimadas + "\n\tGenero: " + this.genero + "\n\tcompañia: " + this.compañia;
    }

    public boolean equals(videojuegos a) {
        return this.titulo.equalsIgnoreCase(a.getTitulo()) && this.compañia.equalsIgnoreCase(a.getcompañia());
    }

    public videojuegos() {
        this("Minecraft", 8, "Videojuego sandbox", "Mojang AB");
    }

    public videojuegos(String titulo, String compañia) {
        this(titulo, 100, "", compañia);
    }

    public videojuegos(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = false;
    }
}
