package ej5;

import ej5.model.Pais;
import ej5.service.PaisService;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        PaisService ps = new PaisService();
        Integer op = 1;

        while (op !=5){
            menu();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del Pais");
                    ps.agregarPais(new Pais(teclado.next()));
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del Pais");
                    Optional<Pais> oPais = ps.buscarPaisPorNombre(teclado.next());
                    System.out.println(oPais.isPresent() ?
                                       "Pais encontrado -> " + oPais.get().getNombre() :
                                       "pais no encontrado");
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del Pais a eliminar");
                    System.out.println("eliminando pais... " + ps.eliminarPaisPorNombre(teclado.next()));
                }
                case 4 -> {
                    ps.getPaisesOrdenadosAZ().forEach(p -> System.out.println(p.getNombre()));
                }
                case 5 -> {
                    System.out.println("Presione una tecla para finalizar...");
                    teclado.next();
                }
                default -> System.out.println("opcion incorrecta");
            }
        }

    }
    public static void menu(){
        System.out.println("\n--- ELIJA UNA OPCION ---" +
                           "\n1 -> Ingresar nuevo Pais" +
                           "\n2 -> Buscar Pais por Nombre" +
                           "\n3 -> Eliminar Pais por nombre" +
                           "\n4 -> Mostra Paises guardados" +
                           "\n5 -> Salir");
    }
}
