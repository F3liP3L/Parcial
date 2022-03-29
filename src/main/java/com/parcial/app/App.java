package com.parcial.app;

import com.parcial.dominio.Enfermedad;
import com.parcial.dominio.Eps;
import com.parcial.dominio.Paciente;

public class App {
    public static void main(String[] args) {

        Eps nuevaEps = new Eps();
        Enfermedad dengue = new Enfermedad("Dengue", 2);

        nuevaEps.afiliarPaciente(1245846, "Pancracio");
        nuevaEps.afiliarPaciente(47899523, "Pedro de Jesus");


        nuevaEps.buscarPaciente(47899523);

        nuevaEps.sacarPaciente(48451215);
        System.out.println("---- PACIENTES POR NOMBRE ----\n");
        nuevaEps.ordenarPacientesPorNombre();
        System.out.println("---- BUSCANDO PACIENTES SANOS ----\n");
        nuevaEps.buscarPacienteSinEnfermedad();
        System.out.println("---------------------");

        nuevaEps.afiliarPaciente(1245846, "Fernan el crack");
    }
}
