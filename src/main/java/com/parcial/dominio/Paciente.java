package com.parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private long cedula;
    private String nombre;
    private List<Enfermedad> enfermedades;

    public Paciente () {this.enfermedades = new ArrayList<>();}

    public Paciente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }
}
