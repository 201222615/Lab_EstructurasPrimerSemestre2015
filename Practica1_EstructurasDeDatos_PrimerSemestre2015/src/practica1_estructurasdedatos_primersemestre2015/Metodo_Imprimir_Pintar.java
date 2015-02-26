/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_estructurasdedatos_primersemestre2015;

import static practica1_estructurasdedatos_primersemestre2015.Practica1_EstructurasDeDatos_PrimerSemestre2015.listaJ;
import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author juanpablo
 */
public class Metodo_Imprimir_Pintar {
    
    public Metodo_Imprimir_Pintar(String nomArchivo, String imprimir){

        try{

            FileWriter fw=new FileWriter("C:\\Users\\juanpablo\\Escritorio\\Archivo Temporal.txt");

            fw.write(imprimir);            

            fw.close(); 
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
        try {
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = "I:\\Archivo de Escritura para Graphiz.txt";
            String fileOutputPath = "I:\\"+nomArchivo+".jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec( cmd );                                
        } catch (Exception ex) {
                ex.printStackTrace();
        } finally {

        }

  }
    
}

    
    
    

