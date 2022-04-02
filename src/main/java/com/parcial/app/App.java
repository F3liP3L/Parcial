package com.parcial.app;

import com.parcial.dominio.Enfermedad;
import com.parcial.dominio.Eps;
import com.parcial.dominio.Paciente;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Eps nuevaEps = new Eps();

        nuevaEps.afiliarPaciente(1245846, "Pancracio");
        nuevaEps.afiliarPaciente(47899523, "Pedro de Jesus");
        nuevaEps.afiliarPaciente(123456, "Alberto");
        nuevaEps.afiliarPaciente(1234356, "Roberto");
        nuevaEps.afiliarPaciente(234598, "Alvaro");



        nuevaEps.buscarPaciente(47899523);

        nuevaEps.sacarPaciente(48451215);
        System.out.println("---- PACIENTES POR NOMBRE ----\n");
        nuevaEps.ordenarPacientesPorNombre();
        System.out.println("---- BUSCANDO PACIENTES SANOS ----\n");
        nuevaEps.buscarPacienteSinEnfermedad();
        System.out.println("---------------------");

        nuevaEps.afiliarPaciente(1245846, "Fernan el crack");

        Paciente pancracio = nuevaEps.buscarPaciente(1245846);
        Paciente pedroDeJesus = nuevaEps.buscarPaciente(47899523);
        pancracio.setEnfermedades(Arrays.asList(new Enfermedad("Cancer"),
                new Enfermedad("Epatitis B"), new Enfermedad("SIDA")));
        pedroDeJesus.setEnfermedades(Arrays.asList(new Enfermedad("Covid"), new Enfermedad("SIDA"),
                new Enfermedad("Cancer")));


        nuevaEps.enfermedadesPacientes("Cancer");
        nuevaEps.ordenarPacientesPorNombre();
        System.out.println("------------ PACIENTE CON ENFERMEDADES ---------");
        nuevaEps.mostrarEnfermedadesPacientes(1245846);


    }
}
