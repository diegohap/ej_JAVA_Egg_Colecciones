package eje3.service;

import eje3.model.Libro;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibroService {
    HashSet<Libro> libros;

    public LibroService() {
        libros = new HashSet<>();
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public HashSet<Libro> getLibros(){
        return libros;
    }
    public Boolean eliminarLibroPorTitulo(String titulo){
        return libros.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
    }
    public Optional<Libro> buscarLibroPorTitulo(String titulo){
        return libros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .findAny();
    }
    public HashSet<Libro> buscarLibrosPorAutor(String autor){
        return libros.stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toCollection(HashSet::new));
    }
    public Integer ejemplaresPorLibro(String titulo){
        return libros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .mapToInt(Libro::getEjemplares)
                .sum();
    }
    public Integer prestadosPorTitulo(String titulo){
        return libros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .mapToInt(Libro::getPrestados)
                .sum();
    }
    public Boolean prestarLibroPorTitulo(String titulo){
        return buscarLibroPorTitulo(titulo)
                .map(Libro::prestarLibro)
                .orElse(false); // el orElse es para buscarLibro...(...)
    }
    public Boolean devolverLibroPorTitulo(String titulo){
        return buscarLibroPorTitulo(titulo)
                .map(Libro::devolverLibro)
                .orElse(false);
    }
}
