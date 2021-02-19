package ejercicio17;

public class electrodomestico {
    protected static final String colorDefinido = "Blanco";
    protected static final char consumoEnergeticoDef = 'F';
    protected static final double precioBaseDef = 100.0D;
    protected static final double pesoDef = 5.0D;
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    private void verificarColor(String color) {
        String[] colores = new String[]{"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean verificado = false;

        for (int i = 0; i < colores.length && !verificado; ++i) {
            if (colores[i].equals(color)) {
                verificado = true;
            }
        }
        if (verificado) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }

    }

    public void verificarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }

    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public String getColor() {
        return this.color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public double getPeso() {
        return this.peso;
    }

    public double valorFinal() {
        double extra = 0.0D;
        switch (this.consumoEnergetico) {
            case 'A':
                extra += 100.0D;
                break;
            case 'B':
                extra += 80.0D;
                break;
            case 'C':
                extra += 60.0D;
                break;
            case 'D':
                extra += 50.0D;
                break;
            case 'E':
                extra += 30.0D;
                break;
            case 'F':
                extra += 10.0D;
        }
        if (this.peso >= 0.0D && this.peso < 19.0D) {
            extra += 10.0D;
        } else if (this.peso >= 20.0D && this.peso < 49.0D) {
            extra += 50.0D;
        } else if (this.peso >= 50.0D && this.peso <= 79.0D) {
            extra += 80.0D;
        } else if (this.peso >= 80.0D) {
            extra += 100.0D;
        }
        return this.precioBase + extra;
    }

    public electrodomestico() {
        this(100.0D, 5.0D, 'F', "Blanco");
    }

    public electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, 'F', "Blanco");
    }

    public electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.verificarConsumoEnergetico(consumoEnergetico);
        this.verificarColor(color);
    }
}
