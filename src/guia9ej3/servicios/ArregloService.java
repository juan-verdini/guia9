/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej3.servicios;

import java.util.Arrays;

/*
*Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
*Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
*Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
*Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

/**
 *
 * @author USUARIO
 */
public class ArregloService {
   public void inicializarA(double[] arreglo){
       for(int i = 0; i<arreglo.length; i++){
           arreglo[i]=Math.random()*100;
       }
   }
   public void mostrar(double[] arreglo ){
       for(int i=0; i<arreglo.length; i++){
           System.out.println(arreglo[i]);
       }
       System.out.println("");
   }
   public void ordenar(double[] arreglo){
       double aux[] = new double[arreglo.length];
       Arrays.sort(arreglo);
       for(int i=0; i<arreglo.length; i++){
           aux[i]=arreglo[arreglo.length-1-i];
       }
       for(int i=0;i<arreglo.length;i++){
           arreglo[i]=aux[i];
       }
      // for(int i =0;i<50;i++){
      //     System.out.println(arreglo[i]);
      // }
      // System.out.println("");
   }
   public void inicializarB(double arreglo1[], double arreglo2[]){
       for(int i=0; i<10;i++){
       Arrays.fill(arreglo2, i, 10, arreglo1[i]);
   }
       for(int i=0; i<10;i++){
       Arrays.fill(arreglo2, 10, 20, 0.5);
   }
      // for(int i=0; i<20;i++){
      //     System.out.println(arreglo2[i]);
   }     
}
