package eje4.model;

import lombok.*;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ciudad {
    private String name;
    private Integer cp;

    public static Comparator<Ciudad> compararByName = new Comparator<Ciudad>() {
        @Override
        public int compare(Ciudad o1, Ciudad o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
