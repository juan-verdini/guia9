/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4.servicios;

import java.util.Date;
import java.util.Scanner;

/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
*Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date.
Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
*Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
/**
 *
 * @author USUARIO
 */
public class FechaServicios {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingrese su día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date fecha, Date fechaActual) {

        if (fechaActual.getMonth() < fecha.getMonth()) {
            return fechaActual.getYear() - fecha.getYear() - 1;
        } else if (fechaActual.getMonth() == fecha.getMonth() && fechaActual.getDate() < fecha.getDate()) {
            return fechaActual.getYear() - fecha.getYear() - 1;
        } else {
            return fechaActual.getYear() - fecha.getYear();
        }
    }
}
