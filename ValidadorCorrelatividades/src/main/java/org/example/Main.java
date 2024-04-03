package org.example;

import org.example.Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Creo materias sin correlativas
        Materia fisica1 = new Materia("Fisica 1", null);
        Materia am1 = new Materia("Analisis Matematico 1", null);

        // creo las correlativas de Diseño
        List<Materia> correlativasDiseno = new ArrayList<>();
        correlativasDiseno.add(fisica1);
        correlativasDiseno.add(am1);
        Materia diseno = new Materia("Diseño", correlativasDiseno);

        // Creo alumnos con listas de materias aprobadas
        Alumno alumno1 = new Alumno(123, "Tobias", new ArrayList<>());

        Alumno alumno2 = new Alumno(123, "Pablo", new ArrayList<>());

        Alumno alumno3 = new Alumno(456, "Juan", new ArrayList<>());

        // Agrego materias aprobadas a Kevin
        alumno2.aprobarMateria(fisica1);
        alumno2.aprobarMateria(am1);

        // Creo instancias de Inscripcion
        Inscripcion inscTobias = new Inscripcion(alumno1, List.of(fisica1, am1, diseno)); // Edinson se quiere anotar a todas las materias sin tener aprobadas las correlativas de una de ellas
        Inscripcion inscPablo = new Inscripcion(alumno2, List.of(diseno)); // Kevin tiene las correlativas aprobadas para Diseño
        Inscripcion inscJuan = new Inscripcion(alumno3, List.of(diseno)); // Sergio no tiene las correlativas aprobadas para Diseño

        // Realizo las inscripciones (antes de realizarlas, chequeo si tiene las correlativas aprobadas)
        System.out.println("Inscripción de " + alumno1.getNombreAlumno() + "de " + inscTobias.aprobada());
        System.out.println("Inscripción de " + alumno2.getNombreAlumno() + "de " + inscPablo.aprobada());
        System.out.println("Inscripción de " + alumno3.getNombreAlumno() + "de " + inscJuan.aprobada());

    }


}
