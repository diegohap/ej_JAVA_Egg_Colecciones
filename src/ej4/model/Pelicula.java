package ej4.model;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracionMins;

    public Pelicula(String titulo, String director, Integer duracionMins) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMins = duracionMins;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Integer getDuracionMins() {
        return duracionMins;
    }
    public void setDuracionMins(Integer duracionMins) {
        this.duracionMins = duracionMins;
    }
    public static Comparator<Pelicula> comparadorPorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracionMins().compareTo(o2.getDuracionMins());
        }
    };
    public static Comparator<Pelicula> comparadorPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    public static Comparator<Pelicula> comparadorPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracionMins=" + duracionMins +
                '}';
    }
}
