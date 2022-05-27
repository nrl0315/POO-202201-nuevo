package com.oftalmologo.domain;

import java.util.ArrayList;
import java.util.List;

public class Oftalmologo {

    private String nombre;
    private List<Paciente> pacientes = new ArrayList<>();

    public Paciente revisarPaciente(String nombre, int edad){
        this.pacientes.forEach(p -> {
            if (p.getNombre() != null) {
                char[] charArr = p.getNombre().toCharArray();
                return charArr;
            }
        else if(char[]charArr[0] == "a" && char[]charArr == "A" && p.getEdad() <= 40){
                System.out.println("El paciente cumple con la condicion de operable");
        }
        });
    }

    public void operarPaciente(){

    }

    public void getPacientesOperar(){

    }

}
