package org.example;

import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AlumnoAsignatura {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "libro")
    private Libro libro;

    private int horasLectivas;
}