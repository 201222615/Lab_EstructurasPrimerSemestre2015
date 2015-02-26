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
public class Nodo_Plantas_Zombies {
    private Plantas_Vs_Zombies poz;
    Nodo_Plantas_Zombies anteriorNodo;//apunta a otro nodo (autoreferenciadas)
    Nodo_Plantas_Zombies siguienteNodo;

    /**
    *contruya con un poz adentro
    *@param poz que se almacena dentro del nodo
    */
    public Nodo_Plantas_Zombies(Plantas_Vs_Zombies poz){
            this.poz = poz;
    }

    //quien es el siguiente nodo a este 
    public Nodo_Plantas_Zombies getSiguienteNodo(){
            return this.siguienteNodo;	
    }

    //quien es el anterior nodo a este 
    public Nodo_Plantas_Zombies getAnteriorNodo(){
            return this.anteriorNodo;	
    }	

    //enlaza el nodo actualn, por el enlace siguiente, con el nodo especificado
    //@param siguienteNodo el nodo con el que se va a enlazar	
    public void EnlazarSiguiente(Nodo_Plantas_Zombies siguienteNodo){
            this.siguienteNodo = siguienteNodo;
    }


    //enlaza el nodo actual, por el enlace anterior, con el nodo especificado
    //@param anteriorNodo el nodo con el que se va a enlazar		
    public void EnlazarAnterior(Nodo_Plantas_Zombies anteriorNodo){
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

    //encapsular Plantas_Vs_Zombies() solo get	
    public Plantas_Vs_Zombies getPoZ(){
            return poz;
    }
}
