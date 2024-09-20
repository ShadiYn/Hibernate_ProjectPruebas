package org.example;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//Para generar números autoincrementados
    private int id;

    //Anotación opcional, permite easpecificar el nombre d ela tabla en la base de datos, los caracteres que tendrá y si acepta valores nulos
    //@Column (name = "nombrecillo", length = 100, nullable = true)
    private String nombre;


    @OneToMany(mappedBy = "autor", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    // Cuando queremos consultar entidades con entidades relacionadas a través de peticiones http, esta anotación suele ser necesaria para que las entidades no se embuclen
    @JsonManagedReference
    private List<Libro> libros;


    // Los getters y setters

}