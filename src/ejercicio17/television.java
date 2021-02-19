package ejercicio17;

public class television extends electrodomestico {


    private static final int resolucionDefinido = 20;
    private int resolucion;
    private boolean sintonizadorTDT;

    public double valorFinal() {
        double extra = super.valorFinal();
        if (this.resolucion > 40) {
            extra += this.precioBase * 0.3D;
        }

        if (this.sintonizadorTDT) {
            extra += 50.0D;
        }

        return extra;
    }
    public television() {
        this(100.0D, 5.0D, 'F', "Blanco", 20, false);
    }

    public television(double precioBase, double peso) {
        this(precioBase, peso, 'F', "Blanco", 20, false);
    }

    public television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
