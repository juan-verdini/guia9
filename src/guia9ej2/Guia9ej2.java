/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej2;

import guia9ej2.entidades.ParDeNumeros;
import guia9ej2.servicios.ParDeNumerosService;

/**
 *
 * @author USUARIO
 */
public class Guia9ej2 {
/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas.
La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números.
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ParDeNumeros pdn = new ParDeNumeros(); 
       ParDeNumerosService pdns = new ParDeNumerosService();
       pdns.mostrarValores(pdn);
       pdns.devolverMayor(pdn);
       pdns.calcularPotencia(pdn);
       pdns.calcularRaiz(pdn);
    }
    
}
