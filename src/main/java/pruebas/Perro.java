package pruebas;

import java.util.Comparator;
import java.util.Objects;

public class Perro implements Comparable<Perro>{
    private Integer edad;
    private String nombre;

    public Perro(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Comparator<Perro> compararEdad = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getEdad().compareTo(o2.getEdad());
        }
    };
    public static Comparator<Perro> compararNombre = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(edad, perro.edad) && Objects.equals(nombre, perro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre);
    }

    @Override
    public int compareTo(Perro o) {
        return edad.compareTo(o.getEdad());
    }

    @Override
    public String toString() {
        return "Perro{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
