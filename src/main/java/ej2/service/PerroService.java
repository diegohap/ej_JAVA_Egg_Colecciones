package ej2.service;

import ej2.model.Perro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class PerroService {
    ArrayList<Perro> perros;

    public PerroService() {
        perros = new ArrayList<>();
    }
    public void agregarPerro(Perro nuevoPerro){
        perros.add(nuevoPerro);
    }
    public void eliminarPerroPorNombre(Perro perro){

          // METODO CON FOR-EACH
//        Perro perroAEliminar = null;
//        for (Perro p : perros) {
//            if(p.getNombre().equalsIgnoreCase(nombre)) {
//                perroAEliminar = p;
//                break;
//            }
//        }
//        if(perroAEliminar != null)
//            perros.remove(perroAEliminar);

        //METODO CON ITERADOR
        Iterator<Perro> it = perros.iterator();
        while(it.hasNext()){
            if(it.next().equals(perro)){
                it.remove();
                break;
            }
        }

        //METODO CON removeIf
//        perros.removeIf(p -> p.equals(perro));

        //METODO CON STREAMS
        perros = perros.stream()
                .filter(p -> !p.equals(perro))
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public ArrayList<Perro> getPerros() {
        return perros;
    }
}
