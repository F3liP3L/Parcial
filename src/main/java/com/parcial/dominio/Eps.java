package com.parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Eps {
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private List<Paciente> pacientes;

    public Eps() { this.pacientes = new ArrayList<>();}

    public boolean afiliarPaciente (long cedula, String nombre){
        Paciente pacienteAAgregar = new Paciente(cedula, nombre);
        if (this.pacientes.size()+1<=CAPACIDAD) {
            Paciente pacienteActual = buscarPaciente(cedula);
            if (pacienteActual==null) {
                this.pacientes.add(pacienteAAgregar);
                return true;
            } else {
                System.out.println("El paciente ya se encuentra afiliado.");
            }
        }
        return false;
    }

    public void sacarPaciente (long cedula) {
        Paciente pacienteASacar = buscarPaciente(cedula);
        if (pacienteASacar!=null){
            this.pacientes.remove(pacienteASacar);
        } else {
            System.out.println("El paciente no se encuentra afiliado. ");
        }
    }

    public Paciente buscarPaciente (long cedula) {
        Paciente pacienteCed = this.pacientes.stream()
                .filter(pacientCed -> pacientCed.getCedula()==cedula).findFirst()
                .orElse(null);
        if (pacienteCed != null) {
            return pacienteCed;
        }
        return null;
    }

    public List<Paciente> buscarPacientePorEnfermedad (String enfermedad) {
        List<Paciente> pacienteEnfermoABuscar = this.pacientes.stream()
                .filter(paciente -> paciente.getEnfermedades().equals(enfermedad))
                .collect(Collectors.toList());
        return pacienteEnfermoABuscar;
    }

    public List<Paciente> buscarPacienteSinEnfermedad() {
        List<Paciente> pacientesSanosABuscar = this.pacientes.stream()
                .filter(paciente -> paciente.getEnfermedades()==null||paciente.getEnfermedades().size()==0)
                .collect(Collectors.toList());
        if ((pacientesSanosABuscar!=null)&&(pacientesSanosABuscar.size()>0)) {
            System.out.println("La lista de pacientes sanos son: ");
            pacientesSanosABuscar.forEach(paciente -> System.out.println(paciente.getNombre()));
            return pacientesSanosABuscar;
        } else {
            return null;
        }
    }

    public void ordenarPacientesPorNombre () {
        this.pacientes.sort(Comparator.comparing(Paciente::getNombre).thenComparing(Paciente::getCedula));
        this.pacientes.forEach(patient -> System.out.println(patient.getNombre() + " ---> "+ patient.getCedula()));
    }

}
