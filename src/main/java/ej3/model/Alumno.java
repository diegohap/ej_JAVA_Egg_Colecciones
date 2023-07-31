package ej3.model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;
    private final Integer CANT_NOTAS_MAX = 3;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    public Boolean addNota(Integer nota) {
        if (notas.size() < CANT_NOTAS_MAX) {
            notas.add(nota);
            return true;
        }
        return false;
    }
    public Boolean updateNote(Integer index, Integer nota) {
        if(index < CANT_NOTAS_MAX) {
            notas.set(index, nota);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas.stream()
                                  .map(String::valueOf)
                                  .collect(Collectors.joining(",")) +
                '}';
    }
}
