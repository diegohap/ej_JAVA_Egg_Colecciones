package ej4.service;

import ej4.model.Pelicula;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class PeliculaService {
    private ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        peliculas = new ArrayList<>();
    }
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public Optional<Pelicula> buscarPeliculaPorTitulo(String titulo){
        for (Pelicula p : peliculas) {
            if(p.getTitulo().equalsIgnoreCase(titulo))
                return Optional.of(p);
        }
        return Optional.empty();
    }
    public Boolean eliminarPeliculaPorTitulo(String titulo){
        return peliculas.removeIf(p -> p.getTitulo().equalsIgnoreCase(titulo));
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public ArrayList<Pelicula> peliculasPorDuracionMayorIgual(Integer mins){
        return ordenarPorDuracionMenAMay().stream()
                 .filter(p -> p.getDuracionMins() >= mins)
                 .collect(Collectors.toCollection(ArrayList::new));
    }
    public ArrayList<Pelicula> ordenarPorDuracionMenAMay(){
        peliculas.sort(Pelicula.comparadorPorDuracion);
        return getPeliculas();
    }
    public ArrayList<Pelicula> ordenarPorDuracionMayAMen(){
        peliculas.sort(Pelicula.comparadorPorDuracion.reversed());
        return getPeliculas();
    }
    public ArrayList<Pelicula> ordenarPorTitulo(){
        peliculas.sort(Pelicula.comparadorPorTitulo);
        return getPeliculas();
    }
    public ArrayList<Pelicula> ordenarPorDirector(){
        peliculas.sort(Pelicula.comparadorPorDirector);
        return getPeliculas();
    }
}
