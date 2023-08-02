package ej4bis;

import ej4bis.model.Pelicula;
import ej4bis.service.PeliculaService;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        final Integer d = 100;
        PeliculaService ps = new PeliculaService();
        ps.agregarPelicula(new Pelicula("El Rey Leon", "Rob Minkoff", 88));
        ps.agregarPelicula(new Pelicula("Matrix", "Hermanos Wachowski", 136));
        ps.agregarPelicula(new Pelicula("Interestelar", "Christopher Nolan", 169));

        System.out.println("---   PELICULAS   ---");
        ps.getPeliculas().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR DURACION d->D   ---");
        ps.ordenarPorDuracionMenAMay().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR DURACION D->d   ---");
        ps.ordenarPorDuracionMayAMen().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   Peliculas Por DURACION >= " + d + "min   ---");
        ps.peliculasPorDuracionMayorIgual(d).forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR TITULO   ---");
        ps.ordenarPorTitulo().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR DIRECTOR   ---");
        ps.ordenarPorDirector().forEach(p -> System.out.println(p.toString()));
        Optional<Pelicula> oPelicula = ps.buscarPeliculaPorTitulo("asda");
        if(oPelicula.isPresent()){
            System.out.println(oPelicula.get().toString());
        }
        else {
            System.out.println("pelicula no encontrada");
        }
    }
}
