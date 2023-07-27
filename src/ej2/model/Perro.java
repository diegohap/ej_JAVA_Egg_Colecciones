package ej2.model;

import java.util.Objects;

public class Perro {
    private String nombre;
    private Integer edad;
    private String raza;

    public Perro(String nombre, Integer edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre) && Objects.equals(edad, perro.edad) && Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, raza);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
