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
public class ListaJugadorGeneral {
    
    private NodoJugadorGeneral primerNodo;
    private NodoJugadorGeneral ultimoNodo;
    
    private NodoJugadorGeneral registroActual;
    
    private int length;

    public ListaJugadorGeneral(){
        this.length=0;
    }

    /**
    *Adiciona el jAdicionar al final de la lista
    *@param jAdicionar el paciente que se quiere adicionar
    */
    public void Add(JugadorGeneral jAdicionar){	
        NodoJugadorGeneral nodoAdicionar = new NodoJugadorGeneral(jAdicionar);

        //verificar si es o no el primer nodo
        if (this.primerNodo==null){
            this.primerNodo=nodoAdicionar;
            this.ultimoNodo=this.primerNodo;
            this.registroActual=this.primerNodo;
        }else{
            this.ultimoNodo.EnlazarSiguiente(nodoAdicionar);
            nodoAdicionar.EnlazarAnterior(this.ultimoNodo);
            this.ultimoNodo=nodoAdicionar;					
        }
        this.length++;
    }
    
    /**
     * obtiene el siguiente j de la lista
     * @return 
     */
    public JugadorGeneral getNextJ(){
        if (registroActual==null){
            return null;
        }else{            
            if (this.registroActual!=null){
                JugadorGeneral Temporal;
                Temporal = this.registroActual.getJ();
                this.registroActual=this.registroActual.getSiguienteNodo();
                return Temporal;
            }else{
                return null;
            }
        }
        
        
    }
    
    /**
     * reubica el registro actual en el primer jugador
     */
    public void ResetNextPoZ(){
        this.registroActual=this.primerNodo;
    }
            
    /**
    * Retorna el numero de elementos de la lista
    *@return Canditad de elementos.
    */	
    public int Length(){
        return this.length;
    }

	/**
	*Remueve el ultimo jugador de la lista
	*/
    public void Remove(){

        if (this.primerNodo==null){
                return;
        }		

        if (this.length==1){
                this.primerNodo=null;
        }else{

        NodoJugadorGeneral nodoAnteriorActual;
        nodoAnteriorActual=this.ultimoNodo.getAnteriorNodo();
        

        nodoAnteriorActual.RomperEnlaceSiguiente();
        this.ultimoNodo.RomperEnlaceAnterior();
        this.ultimoNodo=nodoAnteriorActual;        
	
        }
        this.length--;
    }
    
    /**
     * Retorna el j de la posicion indicada
     * @param posicion
     * @return el j de la posicion indicada
     */        
    public JugadorGeneral getJAt(int posicion){
        if(this.primerNodo==null){
            return null;
        }else if(posicion >= length){
            return null;
        }else{
            NodoJugadorGeneral nodoRequerido;
            nodoRequerido = this.primerNodo;
            int contador=0;
            
            while(contador<posicion){
                nodoRequerido=nodoRequerido.getSiguienteNodo();   
                contador++;
            }
            
            return nodoRequerido.getJ();
        }    
        
    }
    
}
