package com.biblioteca.domain;

public class Revista extends Recurso implements Prestable{
    public Revista(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }
}
