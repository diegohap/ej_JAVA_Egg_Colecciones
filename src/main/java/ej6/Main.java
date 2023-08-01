package ej6;



import ej6.service.ProductService;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        ProductService ps = new ProductService();
        Integer op = 1;

        while (op !=6){
            menu();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del Producto y el Precio");
                    ps.addNewProduct(teclado.next(), teclado.nextDouble());
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del Producto");
                    Optional<Map.Entry<String, Double>> oProducto = ps.findProductByName(teclado.next());
                    System.out.println(oProducto.isPresent() ?
                            "Product encontrado -> " + oProducto.get().getKey() + " $" +oProducto.get().getValue() :
                            "Product no encontrado");
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del Producto a eliminar");
                    System.out.println("eliminando producto... " + ps.removeProductByName(teclado.next()));
                }
                case 4 -> {
                    ps.getProductos().entrySet().forEach(p -> System.out.println(p.getKey() + " $" + p.getValue()));
                }
                case 5 -> {
                    System.out.println("Ingrese el nombre del Producto y el Precio");
                    Optional<Map.Entry<String, Double>> oProducto = ps.updatePriceByProductName(teclado.next(), teclado.nextDouble());
                    System.out.println(oProducto.isPresent() ?
                            "Precio modificado: " + oProducto.get().getKey() + " $" + oProducto.get().getValue() :
                            "Product no encontrado");
                }
                case 6 -> {
                    System.out.println("Presione una tecla para finalizar...");
                    teclado.next();
                }
                default -> System.out.println("opcion incorrecta");
            }
        }

    }
    public static void menu(){
        System.out.println("\n--- ELIJA UNA OPCION ---" +
                "\n1 -> Ingresar nuevo Producto" +
                "\n2 -> Buscar Producto por Nombre" +
                "\n3 -> Eliminar Producto por nombre" +
                "\n4 -> Mostra Productos guardados" +
                "\n5 -> Modificar el precio de un Producto por nombre " +
                "\n6 -> Salir");
    }
}
