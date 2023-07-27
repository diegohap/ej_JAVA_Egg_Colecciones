package pruebas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap<>();
        alumnos.put(2, "augusto");alumnos.put(3, "zito");
        alumnos.put(1, "pancho");

        mostrar(alumnos);

        TreeMap<Integer, String> alumnosTree = new TreeMap<>(alumnos);
        mostrar(alumnosTree);

        ArrayList<Perro> perros = new ArrayList<>(Arrays.asList(
                new Perro(2, "Batman"),
                new Perro(1, "Firulaiz")
        ));
        // utilizando la decladacion del metodo anonimo en la variable compararEdad
        perros.sort(Perro.compararNombre.reversed());
        perros.stream().forEach(System.out::println);
        TreeSet<Perro> perrosTreeSet = new TreeSet<>(perros);
        perros.stream().forEach(System.out::println);

    }

    private static void mostrar(Map<Integer, String> alumnos) {
        for (Map.Entry<Integer, String> alumno : alumnos.entrySet()) {
            System.out.println(alumno.getKey() + " " + alumno.getValue());
        }
    }

}
