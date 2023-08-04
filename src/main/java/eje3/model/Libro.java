package eje3.model;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Libro {
    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer prestados;

    public Libro(String titulo, String autor, Integer ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        prestados = 0;
    }
    public Boolean prestarLibro(){
        if(ejemplares > prestados){
            prestados++;
            return true;
        }
        return false;
    }
    public Boolean devolverLibro(){
        if(prestados > 0 && prestados <= ejemplares){
            prestados--;
            return true;
        }
        return false;
    }
}
