/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5;

import guia9ej5.entidades.Persona;
import guia9ej5.servicios.PersonaService;
import java.util.Scanner;

/*Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
/**
 *
 * @author USUARIO
 */
public class Guia9ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona();
        //System.out.println(p);
        System.out.println(ps.calcularEdad(p.getFecha()));
        //System.out.println(p.toString());
        System.out.println("Ingrese la edad a comparar");
        int edad = leer.nextInt();
        if (ps.menorQue(edad, p)) {
            System.out.println("La persona es menor que la edad consultada");
        } else {
            System.out.println("La persona no es menor que la edad consultada");
        }
        System.out.println("-----------------------");
        ps.mostrarPersona(p);
    }

}
