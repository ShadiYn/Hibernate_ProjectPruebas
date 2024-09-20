package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Autor autor = new Autor();
        Libro libro = new Libro(autor, " ", 9);

        autor.setNombre("Cristina Ruiz");
        libro.setAutor(autor);
        libro.setTitulo("Mi pasote de libro");
        libro.setPrecio(20);
        session.save(autor);
        session.save(libro);
        transaction.commit();

    }
}