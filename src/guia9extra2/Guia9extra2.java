/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9extra2;

import guia9extra2.entidades.Ahorcado;
import guia9extra2.servicios.AhorcadoService;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Guia9extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ahorcado a = new Ahorcado();
        AhorcadoService as = new AhorcadoService();
        as.juego(a);
        System.out.println(a.toString());
    }
    
}
