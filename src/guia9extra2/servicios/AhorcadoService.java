/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9extra2.servicios;

import guia9extra2.entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario,
//pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector,
//letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas
//máximas y el valor que ingresó el usuario.

    public void crearJuego(Ahorcado a) {
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        int lg = palabra.length();
        String[] aux = new String[lg];
        for (int i = 0; i < lg; i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        a.setPalabra(aux);
        //System.out.println(Arrays.toString(a.getPalabra()));
        System.out.println("Ingrese la cantidad de jugadas máximas");
        a.setJugadasMax(leer.nextInt());
    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.   
    public void longitud(Ahorcado a) {
        System.out.println("La palabra tiene " + a.getPalabra().length + " letras");
    }

//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.
    public void buscar(String letra, Ahorcado a) {
        String[] aux = new String[a.getPalabra().length];
        aux = a.getPalabra();
        //a.setLetrasEncontradas(0);
        int lg = a.getPalabra().length;
        int cont = 0;
        for (int i = 0; i < lg; i++) {
            if (aux[i].equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
            a.setJugadasMax(a.getJugadasMax()-1);
        }
    }

//Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan.
//Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que,
//cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    public void encontradas(String letra, Ahorcado a) {
        String[] aux = new String[a.getPalabra().length];
        aux = a.getPalabra();
        int lg = a.getPalabra().length;
        for (int i = 0; i < lg; i++) {
            if (aux[i].equalsIgnoreCase(letra)) {
                a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);
            }
        }
        int restantes = a.getPalabra().length - a.getLetrasEncontradas();
        System.out.println("Numero de letras(encontradas, faltantes):(" + a.getLetrasEncontradas() + "," + restantes + ")");
    }
    
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos(Ahorcado a){
        System.out.println("Numero de oportunidades restantes: " + a.getJugadasMax());
    }
    
//Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará
//cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
    public void juego(Ahorcado a){       
        crearJuego(a);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        longitud(a);
        while(a.getJugadasMax()>0){
        System.out.println("Ingrese una letra a buscar en la palabra");
        String letra = leer.next();
        buscar(letra,a);
        encontradas(letra,a);
        intentos(a);
        if((a.getPalabra().length - a.getLetrasEncontradas())==0){
            System.out.println("Felicidades! Ha encontrado la palabra");
            break;
        }
        }
        if(a.getJugadasMax()==0){
            System.out.println("Lo sentimos, se ha quedado sin intentos");
        }
    }
    
}


