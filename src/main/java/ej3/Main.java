package ej3;

import ej3.model.Alumno;
import ej3.service.AlumnoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        final String NOMBRE_A_BUSCAR = "lia";
        AlumnoService as = new AlumnoService();
        as.agregarAlumno(new Alumno("pablo",
                         new ArrayList<>(Arrays.asList(2,8,7))
                         ));
        as.agregarAlumno(new Alumno("analia",
                         new ArrayList<>(Arrays.asList(7,7,5))
                         ));
        as.agregarAlumno(new Alumno("lia",
                         new ArrayList<>(Arrays.asList(6,10,3))
                         ));
        Optional<Alumno> oa1 = as.buscarAlumnoPorNombre(NOMBRE_A_BUSCAR);
        if(oa1.isPresent()) {
            System.out.println(oa1.get().toString());
            System.out.printf("prom= %.2f%n", as.calcularNotaFinalPorNombre(NOMBRE_A_BUSCAR).get());
        }
    }
}
