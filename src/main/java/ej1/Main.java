package ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String resp = "y";
        ArrayList<String> razas = new ArrayList<>();

        while (resp.equals("y")){
            System.out.println("ingrese una raza de perros");
            razas.add(teclado.next());
            System.out.println("desea agregar otra raza [y/n]");
        }
        System.out.println("\n ___RAZAS___");
        for (String raza : razas) {
            System.out.println(raza);
        }
    }
}
