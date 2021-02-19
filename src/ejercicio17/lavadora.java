package ejercicio17;

public class lavadora extends electrodomestico {


    private static final int cargaDefinida = 5;
    private int carga;

    public int getCarga() {
        return this.carga;
    }

    public double valorFinal() {
        double extra = super.valorFinal();
        if (this.carga > 30) {
            extra += 50.0D;
        }

        return extra;
    }

    public lavadora() {
        this(100.0D, 5.0D, 'F', "Blanco", 5);
    }

    public lavadora(double precioBase, double peso) {
        this(precioBase, peso, 'F', "Blanco", 5);
    }

    public lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }
}
