package com.parcial.dominio;

public class Enfermedad {
    private String nombre;
    private int gravedad;

    public Enfermedad(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.gravedad = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }


}



