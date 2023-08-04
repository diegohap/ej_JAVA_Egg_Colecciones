package eje3;


import eje3.model.Libro;
import eje3.service.LibroService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Integer op = 1;
        LibroService ls = new LibroService();

        while (op != 9) {
            menu();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el titulo del Libro, Autor y cantidad de ejemplares");
                    ls.agregarLibro(new Libro(teclado.next(), teclado.next(), teclado.nextInt()));
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del Libro a eliminar");
                    System.out.println("eliminando conjunto... " + ls.eliminarLibroPorTitulo(teclado.next()));
                }
                case 3 -> {
                    ls.getLibros().forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Ingrese el titulo del Libro a buscar");
                    Optional<Libro> oLibro = ls.buscarLibroPorTitulo(teclado.next());
                    System.out.println(oLibro.isPresent() ?
                            oLibro.get().toString() :
                            "libro no encontrado...");
                }
                case 5 -> {
                    System.out.println("Ingrese el nombre del autor para buscar libros");
                    HashSet<Libro> libros = ls.buscarLibrosPorAutor(teclado.next());
                    System.out.println(libros.isEmpty() ?
                            "libro no encontrado..." :
                            "LIBROS  DE " + libros.stream().map(Libro::getAutor) + "\n"+
                                    libros.stream()
                                    .map(Libro::toString)
                                    .collect(Collectors.joining("\n"))
                    );
                }
                case 6-> {
                    System.out.println("Ingrese el titulo del libro a prestar");
                    String titulo = teclado.next();
                    System.out.println("Estado del prestamo :" + ls.prestarLibroPorTitulo(titulo));
                    System.out.println("Ejemplares TOTALES disponibles " + ls.ejemplaresPorLibro(titulo));
                    System.out.println("Prestamos realizados" + ls.prestadosPorTitulo(titulo));
                }
                case 7-> {
                    System.out.println("Ingrese el titulo del libro a devolver");
                    String titulo = teclado.next();
                    System.out.println("Estado de la devolucion :" + ls.prestarLibroPorTitulo(titulo));
                    System.out.println("Ejemplares TOTALES disponibles " + ls.ejemplaresPorLibro(titulo));
                    System.out.println("Prestamos realizados" + ls.prestadosPorTitulo(titulo));
                }
                case 8 -> {
                    System.out.println("Ingrese el titulo del libro");
                    String titulo = teclado.next();
                    System.out.println("Ejemplares TOTALES disponibles " + ls.ejemplaresPorLibro(titulo));
                    System.out.println("Prestamos realizados" + ls.prestadosPorTitulo(titulo));
                }
                case 9 -> {
                    System.out.println("Presione una tecla para finalizar...");
                    teclado.next();
                }
                default -> System.out.println("opcion incorrecta");
            }
        }

    }

    public static void menu() {
        System.out.println("\n--- ELIJA UNA OPCION ---" +
                "\n1 -> Ingresar nuevo Libro" +
                "\n2 -> Eliminar Libro por nombre" +
                "\n3 -> Mostra Libros" +
                "\n4 -> Buscar Libros por Titulo" +
                "\n5 -> Buscar Libros por Autor" +
                "\n6 -> Prestar Libro por Titulo" +
                "\n7 -> Devolver Libro por Titulo" +
                "\n8 -> Ver estado de ejemplar" +
                "\n9 -> Salir");
    }
}