/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructurasdedatos_primersemestre2015;

/**
 *
 * @author juanpablo
 */
public class NodoJugadorGeneral {
   private JugadorGeneral j;
    NodoJugadorGeneral anteriorNodo;//apunta a otro nodo (autoreferenciadas)
    NodoJugadorGeneral siguienteNodo;

    /**
    *contruya con un jugador adentro
    *@param j que se almacena dentro del nodo
    */
    public NodoJugadorGeneral(JugadorGeneral j){
            this.j = j;
    }

    //quien es el siguiente nodo a este 
    public NodoJugadorGeneral getSiguienteNodo(){
            return this.siguienteNodo;	
    }

    //quien es el anterior nodo a este 
    public NodoJugadorGeneral getAnteriorNodo(){
            return this.anteriorNodo;	
    }	

    //enlaza el nodo actualn, por el enlace siguiente, con el nodo especificado
    //@param siguienteNodo el nodo con el que se va a enlazar	
    public void EnlazarSiguiente(NodoJugadorGeneral siguienteNodo){
            this.siguienteNodo = siguienteNodo;
    }

    //enlaza el nodo actual, por el enlace anterior, con el nodo especificado
    //@param anteriorNodo el nodo con el que se va a enlazar		
    public void EnlazarAnterior(NodoJugadorGeneral anteriorNodo){
            this.anteriorNodo = anteriorNodo;
    }

    /**
    *Establece a null el enlace siguiente del nodo
    */
    public void RomperEnlaceSiguiente(){
            this.siguienteNodo=null;
    }

    /**
    *Establece a null el enlace anterior del nodo
    */
    public void RomperEnlaceAnterior(){
            this.anteriorNodo=null;
    }

    //encapsular jugador() solo get	
    public JugadorGeneral getJ(){
            return j;
    }
}
