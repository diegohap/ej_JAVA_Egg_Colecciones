package ej6.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProductService {
    // consigna mal planteada
    // los productos se representan con entidades
    private HashMap<String, Double> productos;

    public ProductService() {
        productos = new HashMap<String, Double>();
    }
    public void addNewProduct(String name, Double price){
        productos.put(name, price);
    }
    public HashMap<String, Double> getProductos() {
        return productos;
    }
    // ENTRY es el conjunto <K,V>, representa cada elemento de un MAP
    public Optional<Map.Entry<String, Double>> findProductByName(String name){
        // USANDO FOR-EACH
//        for(Map.Entry<String, Double> producto : productos.entrySet()) {
//            if(producto.getKey().equalsIgnoreCase(name))
//                return Optional.of(producto);
//        }
//        return Optional.empty();
        //USANDO STREAMS
        return productos.entrySet().stream()
                .filter(e -> e.getKey().equalsIgnoreCase(name))
                .findFirst();
    }
    public Boolean removeProductByName(String name){
        productos.remove(name);
        return findProductByName(name).isEmpty();
    }
    public Optional<Map.Entry<String, Double>> updatePriceByProductName(String name, Double price){
        //USANDO FOR-EACH
//        for (Map.Entry<String, Double> producto : productos.entrySet()) {
//            if(producto.getKey().equalsIgnoreCase(name)) {
//                producto.setValue(price);
//                return Optional.of(producto);
//            }
//        }
//        return Optional.empty();
        //USANDO STREAMS
        // peek -> actualiza el valor de cada elemento del stream original
        // map -> crea un nuevo stream a devolver dejando sin modificar el original
        // entrySet() transforma el HashMap a una vista de tipo Set
        return productos.entrySet().stream()
                .filter(e -> e.getKey().equalsIgnoreCase(name))
                .peek(e -> e.setValue(price))
                .findFirst();
    }
}