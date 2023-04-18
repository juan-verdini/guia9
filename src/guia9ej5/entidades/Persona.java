/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5.entidades;

import java.util.Date;

/*Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
/**
 *
 * @author USUARIO
 */
public class Persona {

    private String nombre;
    private Date fecha;

    public Persona() {
    }

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
