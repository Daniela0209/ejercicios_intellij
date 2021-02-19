package ejercicio18;

public class main {

    public main() {
    }

    public static void main(String[] args) {
        serie[] listaSeries = new serie[5];
        videojuegos[] listaVideojuegos = new videojuegos[5];
        listaSeries[0] = new serie();
        listaSeries[1] = new serie("La casa de papel", 4, "Robo", "Álex pino");
        listaSeries[2] = new serie("Game of thrones", 8, "Televisión de fantasía", "David Benioff, D.B Weiss");
        listaSeries[3] = new serie("The walking dead", 10, "Apocalipsis zombie", "frank Darabont, Robert Kirkman");
        listaSeries[4] = new serie("Te Blacklist", 8, "Drama", "Jon Bokenkamp");
        listaVideojuegos[0] = new videojuegos();
        listaVideojuegos[1] = new videojuegos("Fornite", 10, "Battle royale", "Epic Games");
        listaVideojuegos[2] = new videojuegos("Los aventureros", "Daniela Grajales");
        listaVideojuegos[3] = new videojuegos("Minecraft", 8, "Videojuego sandbox", " Mojang AB");
        listaVideojuegos[4] = new videojuegos("Free fire", 13, "Battle royale", "Forrest Lin");
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();
        int entregados = 0;

        for(int i = 0; i < listaSeries.length; ++i) {
            if (listaSeries[i].isEntregado()) {
                ++entregados;
                listaSeries[i].devolver();
            }

            if (listaVideojuegos[i].isEntregado()) {
                ++entregados;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay " + entregados + " productos entregados");
        serie serieMayor = listaSeries[0];
        videojuegos videojuegoMayor = listaVideojuegos[0];

        for(int i = 1; i < listaSeries.length; ++i) {
            if (listaSeries[i].compareTo(serieMayor) == 1) {
                serieMayor = listaSeries[i];
            }

            if (listaVideojuegos[i].compareTo(videojuegoMayor) == 1) {
                videojuegoMayor = listaVideojuegos[i];
            }
        }

        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}
