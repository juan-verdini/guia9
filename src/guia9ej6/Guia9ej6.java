/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej6;

import guia9ej6.entidades.Curso;

/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco),
donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:

/**
 *
 * @author USUARIO
 */
public class Guia9ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c = new Curso();
        c.crearCurso();
        c.calcularGananciaSemanal();
    }
    
}
