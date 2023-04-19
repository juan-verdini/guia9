/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9extra1;

import guia9extra1.entidades.Meses;
import guia9extra1.servicios.MesesService;

/**
 *
 * @author PC
 */
public class Guia9extra1 {
/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String,
y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje,
y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meses m = new Meses();
        MesesService ms = new MesesService();
        ms.adivinarMes(m);
    }
    
}
