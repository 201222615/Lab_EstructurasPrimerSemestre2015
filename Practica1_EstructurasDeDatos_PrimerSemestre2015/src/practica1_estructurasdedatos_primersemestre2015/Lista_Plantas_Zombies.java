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
public class Lista_Plantas_Zombies {
    
    private Nodo_Plantas_Zombies primerNodo;
    private Nodo_Plantas_Zombies ultimoNodo;
    
    private Nodo_Plantas_Zombies registroActual;
    
    private int length;

    public Lista_Plantas_Zombies(){
        this.length=0;
    }

    /**
    *Adiciona el pozAdicionar al final de la lista
    *@param pozAdicionar el paciente que se quiere adicionar
    */
    public void Add(Plantas_Vs_Zombies pozAdicionar){	
        Nodo_Plantas_Zombies nodoAdicionar = new Nodo_Plantas_Zombies(pozAdicionar);

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
     * obtiene el siguiente poz de la lista
     * @return 
     */
    public Plantas_Vs_Zombies getNextPoZ(){
        if (registroActual==null){
            return null;
        }else{            
            if (this.registroActual!=null){
                Plantas_Vs_Zombies Temporal;
                Temporal = this.registroActual.getPoZ();
                this.registroActual=this.registroActual.getSiguienteNodo();
                return Temporal;
            }else{
                return null;
            }
        }
        
        
    }
    
    /**
     * reubica el registro actual en el primer paciente
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
	*Remueve el ultimo poz de la lista
	*/
    public void Remove(){

        if (this.primerNodo==null){
                return;
        }		

        if (this.length==1){
                this.primerNodo=null;
        }else{

        Nodo_Plantas_Zombies nodoAnteriorActual;
        nodoAnteriorActual=this.ultimoNodo.getAnteriorNodo();
        

        nodoAnteriorActual.RomperEnlaceSiguiente();
        this.ultimoNodo.RomperEnlaceAnterior();
        this.ultimoNodo=nodoAnteriorActual;        

        }
        this.length--;
    }
    
    
    
    
    /**
     * Retorna el poz de la posicion indicada
     * @param posicion
     * @return el poz de la posicion indicada
     */        
    public Plantas_Vs_Zombies getPoZAt(int posicion){
        if(this.primerNodo==null){
            return null;
        }else if(posicion >= length){
            return null;
        }else{
            Nodo_Plantas_Zombies nodoRequerido;
            nodoRequerido = this.primerNodo;
            int contador=0;
            
            while(contador<posicion){
                nodoRequerido=nodoRequerido.getSiguienteNodo();   
                contador++;
            }
            
            return nodoRequerido.getPoZ();
        }    
        
    }

    public void Modificar(int pozModificar, Plantas_Vs_Zombies mod){
        Plantas_Vs_Zombies obt = getPoZAt(pozModificar);
        
       
        obt.setImagen(mod.getImagen());
        obt.setNombre(mod.getNombre());
        obt.setPuntosA(mod.getPuntosA());
        obt.setPuntosD(mod.getPuntosD());
        obt.setTipo(mod.getTipo());
    }
    
    
    
    
}
