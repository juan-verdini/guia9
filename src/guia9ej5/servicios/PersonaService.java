/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5.servicios;

import guia9ej5.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/*
*Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
*Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
*Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
*Método mostrarPersona que muestra la información de la persona deseada.

/**
 *
 * @author USUARIO
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese su día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Date fecha) {
        Date hoy = new Date();
        if (hoy.getMonth() < fecha.getMonth()) {
            return hoy.getYear() - fecha.getYear() - 1;
        } else if (hoy.getMonth() == fecha.getMonth() && hoy.getDate() < fecha.getDate()) {
            return hoy.getYear() - fecha.getYear() - 1;
        } else {
            return hoy.getYear() - fecha.getYear();
        }
    }

    public boolean menorQue(int edad, Persona persona) {
        return calcularEdad(persona.getFecha()) < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("NOMBRE: " + persona.getNombre());
        System.out.println("FECHA DE NACIMIENTO: " + persona.getFecha());
        System.out.println("EDAD: " + calcularEdad(persona.getFecha()));
    }

}
