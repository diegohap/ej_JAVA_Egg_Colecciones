package eje4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ciudad {
    private String name;
    private Integer cp;

    public Comparator<Ciudad> compararByName = new Comparator<Ciudad>() {
        @Override
        public int compare(Ciudad o1, Ciudad o2) {
            return 0;
        }
    };
}
