package org.example;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para generar números autoincrementados
    private int id;
    private String titulo;
    private int precio;
    @JsonBackReference
    @ManyToOne
    private Autor autor;

    public Libro(Autor autor, String titulo, int precio) {
     this.autor=autor;
     this.titulo=titulo;
     this.precio=precio;
    }
}
