package org.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Alumno {

    private int legajo;
    private String nombreA;
    private List<Materia> materiasAprobadas;

    public void aprobarMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }

}
