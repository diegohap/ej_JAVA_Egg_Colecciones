package eje2;

import eje2.model.Cantante;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Integer op = 1;
        ArrayList<Cantante> cantantes = new ArrayList<>(Arrays.asList(
                new Cantante("Metalica", "Metalica"),
                new Cantante("AC/DC", "Highway to Hell"),
                new Cantante("Queen", "Bohemian Rhapsody")
        ));

        while (op != 4) {
            menu();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del Conjunto y Cancion mas famosa");
                    cantantes.add(new Cantante(teclado.next(), teclado.next()));
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del Conjunto a eliminar");
                    System.out.println("eliminando conjunto... " + cantantes.removeIf(c -> c.getNombre().equalsIgnoreCase(teclado.next())));
                }
                case 3 -> {
                    cantantes.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Presione una tecla para finalizar...");
                    teclado.next();
                }
                default -> System.out.println("opcion incorrecta");
            }
        }

    }

    public static void menu() {
        System.out.println("\n--- ELIJA UNA OPCION ---" +
                "\n1 -> Ingresar nuevo Conjunto y Cancion más famosa" +
                "\n2 -> Eliminar Conjunto por nombre" +
                "\n3 -> Mostra Conjuntos guardados" +
                "\n4 -> Salir");
    }
}