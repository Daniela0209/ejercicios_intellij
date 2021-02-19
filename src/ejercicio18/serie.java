package ejercicio18;

public class serie implements entregable{

    private static final int numTemporadasDef = 3;
    public static final int mayor = 1;
    public static final int menor = -1;
    public static final int igual = 0;
    private String titulo;
    private int numeroTempo;
    private boolean entregado;
    private String genero;
    private String creador;


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnumeroTemporadas() {
        return this.numeroTempo;
    }

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTempo = numeroTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcreador() {
        return this.creador;
    }

    public void setcreador(String creador) {
        this.creador = creador;
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
        serie ref = (serie)a;
        if (this.numeroTempo > ref.getnumeroTemporadas()) {
            estado = 1;
        } else if (this.numeroTempo == ref.getnumeroTemporadas()) {
            estado = 0;
        }

        return estado;
    }
    public String toString() {
        return "Informacion de la Serie: \n\tTitulo: " + this.titulo + "\n\tNumero de temporadas: " + this.numeroTempo + "\n\tGenero: " + this.genero + "\n\tCreador: " + this.creador;
    }
    public boolean equals(serie a) {
        return this.titulo.equalsIgnoreCase(a.getTitulo()) && this.creador.equalsIgnoreCase(a.getcreador());
    }

    public serie() {
        this("", 3, "", "");
    }

    public serie(String titulo, String creador) {
        this(titulo, 3, "", creador);
    }

    public serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;

        this.numeroTempo = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }
}
