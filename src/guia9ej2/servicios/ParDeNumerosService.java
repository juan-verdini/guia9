/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej2.servicios;

import guia9ej2.entidades.ParDeNumeros;

/*
*Método mostrarValores que muestra cuáles son los dos números guardados.
*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
*Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
*Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

/**
 *
 * @author USUARIO
 */
public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros datos) {
        System.out.println("Los dos números guardados son:");
        System.out.println(datos.getNum1() + " y " + datos.getNum2());
    }

    public void devolverMayor(ParDeNumeros datos) {
        System.out.println("El mayor es " + Math.max(datos.getNum1(), datos.getNum2()));
    }

    public void calcularPotencia(ParDeNumeros datos) {
        if (datos.getNum1() > datos.getNum2()) {
            System.out.println("La potencia es " + Math.pow(Math.round(datos.getNum1()), Math.round(datos.getNum2())));
        } else {
            System.out.println("La potencia es " + Math.pow(Math.round(datos.getNum2()), Math.round(datos.getNum1())));
        }
    }
    
    public void calcularRaiz(ParDeNumeros datos){
        if(datos.getNum1()<datos.getNum2()){
            System.out.println("La raiz cuadrada del menor es " + Math.sqrt(Math.abs(datos.getNum1())));
        }else{
            System.out.println("La raiz cuadrada del menor es " + Math.sqrt(Math.abs(datos.getNum2())));
        }
    }
}
