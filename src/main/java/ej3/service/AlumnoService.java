package ej3.service;

import ej3.model.Alumno;
import java.util.ArrayList;
import java.util.Optional;

public class AlumnoService {
    ArrayList<Alumno> alumnos;

    public AlumnoService() {
        alumnos = new ArrayList<>();
    }
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public Optional<Alumno> buscarAlumnoPorNombre(String nombre){
        //METODO CON STREAM
//      return alumnos.stream()
//                    .filter(a -> a.getNombre().equalsIgnoreCase(nombre))
//                    .findFirst();
        //METODO CON FOR-EACH
        for (Alumno a : alumnos) {
            if(a.getNombre().equalsIgnoreCase(nombre))
                return Optional.of(a);
        }
        return Optional.empty();
    }
    public Boolean agregarNotaPorNombre(Integer nota, String nombre){
        //METODO CON STREAM
//        Optional<Alumno> alumno = alumnos.stream()
//                                         .filter(a -> a.getNombre().equalsIgnoreCase(nombre))
//                                         .findFirst();
//        return alumno.map(a -> a.addNota(nota)).orElse(false);
        //METODO CON FOR-EACH
        for (Alumno a : alumnos) {
            if(a.getNombre().equalsIgnoreCase(nombre))
                return a.addNota(nota);
        }
        return false;
    }
    public Optional<Double> calcularNotaFinalPorNombre(String nombre) {
        //METODO CON STREAMS
//        return buscarAlumnoPorNombre(nombre)
//                .map(a -> a.getNotas().stream()
//                                      .mapToDouble(Integer::doubleValue)
//                                      .average()
//                                      .orElse(0.0));
        //METODO CON FOR-EACH
        Optional<Alumno> oAlumno = buscarAlumnoPorNombre(nombre);
        if (oAlumno.isPresent()) {
            Double suma = 0.0;
            for (Integer n : oAlumno.get().getNotas()) {
                suma += n;
            }
            return Optional.of(suma / Alumno.CANT_NOTAS_MAX);
        }
        return Optional.empty();
    }
}