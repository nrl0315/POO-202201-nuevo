package com.biblioteca.domain;

public class Libro extends Recurso implements Copiable,Prestable{
    public Libro(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {

    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }
}
