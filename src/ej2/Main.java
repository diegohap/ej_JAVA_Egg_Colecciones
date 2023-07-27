package ej2;

import ej2.model.Perro;
import ej2.service.PerroService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String resp = "y";
        ArrayList<String> razas = new ArrayList<>();
        PerroService ps = new PerroService();
        ps.agregarPerro(new Perro("Firulais", 3, "Dogo"));
        ps.agregarPerro(new Perro("Pluto", 6, "Labrador"));
        ps.agregarPerro(new Perro("Snoopy", 1, "Beagle"));

//        while (resp.equals("y")){
//            System.out.println("ingrese una raza de perros");
//            razas.add(teclado.next());
//            System.out.println("desea agregar otra raza [y/n]");
//        }
//        System.out.println("\n ___RAZAS___");
//        for (String raza : razas) {
//            System.out.println(raza);
//        }
//
        System.out.println("ingrese el nombre, la edad y la raza del perro a eliminar");
        Perro perroAEliminar = new Perro(teclado.next(), teclado.nextInt(), teclado.next());
        ps.eliminarPerroPorNombre(perroAEliminar);
        ps.getPerros().forEach(System.out::println);
    }
}
