/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_estructurasdedatos_primersemestre2015;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import static practica1_estructurasdedatos_primersemestre2015.Metodo_Imprimir_Pintar.*;

/**
 *
 * @author juanpablo
 */
public class Practica1_EstructurasDeDatos_PrimerSemestre2015 {
 public static Lista_Plantas_Zombies listaPoZ;
    public static ListaJugadorGeneral listaJ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
       Bienvenido nomostrar = new Bienvenido (); 
           listaPoZ = new Lista_Plantas_Zombies();
        listaJ = new ListaJugadorGeneral();
    
       nomostrar.setVisible(true);     
nomostrar.setLocationRelativeTo(null);
   PlantasVsZombies p = new  PlantasVsZombies();
        p.setVisible(true);
 
   
    }
    
}

