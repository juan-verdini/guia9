/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9extra1.servicios;

import guia9extra1.entidades.Meses;
import java.util.Scanner;

/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String,
y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje,
y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.
/**
 *
 * @author PC
 */
public class MesesService {
    Scanner leer = new Scanner(System.in);
    public void adivinarMes(Meses m){
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String mes = leer.next();
        while(!mes.equalsIgnoreCase(m.getMesSecreto())){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mes = leer.next();
        }
        System.out.println("¡Ha acertado!");
    }
}
