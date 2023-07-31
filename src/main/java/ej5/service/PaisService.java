package ej5.service;

import ej5.model.Pais;

import java.util.*;

public class PaisService {
    private HashSet<Pais> paises;

    public PaisService() {
        paises = new HashSet<Pais>();
    }
    public void agregarPais(Pais pais){
        paises.add(pais);
    }
    public Optional<Pais> buscarPaisPorNombre(String nombre){
        return paises.stream()
                     .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                     .findAny();
    }
    public ArrayList<Pais> getPaisesOrdenadosAZ(){
        ArrayList<Pais> paisesList = new ArrayList<>(paises);
        paisesList.sort(Pais.compararPorNombre);
        return paisesList;
    }
    public Boolean eliminarPaisPorNombre(String nombre){
        // esto mucho más sensillo y seguro que usar Iterator
        return paises.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }
}
