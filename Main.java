import java.util.ArrayList;

public class Peliculas {

    LT entr = new LT();
    ArrayList<Pelicula> peliculas = new ArrayList();

    private void inicio() {
        System.out.println("\tBASE DE DATOS DE PELÍCULAS\n");
        menu();
    }

    private void printmenu() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\tMenú");
        System.out.println("1. Añadir película");
        System.out.println("2. Buscar película");
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Opción: ");
    }

    private void menu() {
        printmenu();
        int catcher = 7;
        while (catcher != 0) {
            catcher = entr.llegirSencer();
            switch (catcher) {
                case 0:
                    System.exit(0);
                case 1:
                    add();
                    printmenu();
                    break;
                case 2:
                    search();
                    printmenu();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    printmenu();
                    break;
            }
        }
    }

    private void add() {
        System.out.print("Nombre de la película: ");
        String name = entr.llegirLinia();
        System.out.print("Nombre de su director: ");
        String director = entr.llegirLinia();
        System.out.print("Año de estreno de la película: ");
        int year = entr.llegirSencer();
        Pelicula p = new Pelicula(name, director, year);
        peliculas.add(p);
        System.out.println();
    }

    private void search() {
        System.out.print("Escribe porqué parámetro quieres buscar (Titulo / Director / Estreno): ");
        String parameter = entr.llegirLinia();
        parameter = parameter.toLowerCase();
        switch (parameter) {
            case "estreno":
                searchperyear();
                break;
            case "titulo":
                searchpername();
                break;
            case "director":
                searchperdirector();
                break;
        }
    }

    private void searchperyear() {
        System.out.print("Escribe un año para la búsqueda:");
        int year = entr.llegirSencer();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getYear() == year) {
                System.out.println(peliculas.get(i));
            }
        }
    }

    private void searchpername() {
        System.out.print("Escribe el título de la pelicula:");
        String name = entr.llegirLinia();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(peliculas.get(i));
            }
        }
    }

    private void searchperdirector() {
        System.out.print("Escribe un director:");
        String director = entr.llegirLinia();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getDirector().equalsIgnoreCase(director)) {
                System.out.println(peliculas.get(i));
            }
        }
    }

    public static void main(String[] args) {
        new Peliculas().inicio();
    }

}
