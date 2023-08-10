package eje4;

import eje4.model.Ciudad;
import eje4.service.CiudadService;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CiudadService cs = new CiudadService(new ArrayList<Ciudad>());
        cs.add(new Ciudad("Cordoba", 5000));
        cs.add(new Ciudad("Villa Allende", 5007));
        System.out.println(cs.findByAttributeName("name", "Cordoba"));
        cs.sortByComparator(Ciudad.compararByName.reversed());
        cs.getAll().forEach(System.out::println);
    }
}