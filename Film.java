public class Pelicula {
    private String name;
    private String director;
    private int year;

    public Pelicula(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Título = " + name + ", Director = " + director + ", Año = " + year + '}';
    }    
    
}
