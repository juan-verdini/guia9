/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej3;

import guia9ej3.servicios.ArregloService;

/**
 *
 * @author USUARIO
 */
public class Guia9ej3 {
/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double arreglo1[] = new double [50];
        double arreglo2[] = new double [20];
        ArregloService as = new ArregloService();
        as.inicializarA(arreglo1);
        as.mostrar(arreglo1);
        System.out.println("");
        as.ordenar(arreglo1);
        as.inicializarB(arreglo1, arreglo2);
        as.mostrar(arreglo1);
        System.out.println("");
        as.mostrar(arreglo2);
    }
    
}
