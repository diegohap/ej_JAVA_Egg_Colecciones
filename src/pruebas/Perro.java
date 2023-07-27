package pruebas;

import java.util.Comparator;

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
