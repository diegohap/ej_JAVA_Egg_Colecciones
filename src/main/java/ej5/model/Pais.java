package ej5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Comparator;


@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class Pais {
    private String nombre;

    public static Comparator<Pais> compararPorNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}
