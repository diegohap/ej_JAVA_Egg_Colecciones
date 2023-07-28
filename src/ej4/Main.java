package ej4;

import ej4.model.Pelicula;
import ej4.service.PeliculaService;

public class Main {
    public static void main(String[] args) {
        final Integer d = 100;
        PeliculaService ps = new PeliculaService();
        ps.agregarPelicula(new Pelicula("El Rey Leon", "Rob Minkoff", 88));
        ps.agregarPelicula(new Pelicula("Matrix", "Hermanos Wachowski", 136));
        ps.agregarPelicula(new Pelicula("Interestelar", "Christopher Nolan", 169));

        System.out.println("---   PELICULAS   ---");
        ps.getPeliculas().forEach(System.out::println);
        System.out.println("\n---   PELICULAS POR DURACION d->D  ---");
        ps.ordenarPorDuracionMenAMay();
        ps.getPeliculas().forEach(System.out::println);
        System.out.println("\n---   PELICULAS POR DURACION D->d  ---");
        ps.ordenarPorDuracionMayAMen();
        ps.getPeliculas().forEach(System.out::println);
        System.out.println("\n---   PELICULAS POR DURACION >= " + d + "min  ---");
        ps.peliculasPorDuracionMayorIgual(d).forEach(System.out::println);
        System.out.println("\n---   PELICULAS POR TITULO  ---");
        ps.ordenarPorTitulo();
        ps.getPeliculas().forEach(System.out::println);
        System.out.println("\n---   PELICULAS POR DIRECTOR  ---");
        ps.ordenarPorDirector();
        ps.getPeliculas().forEach(System.out::println);
    }
}
