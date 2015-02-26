/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_estructurasdedatos_primersemestre2015;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author BLADIMIR
 */
public class disparo extends JLabel implements Runnable{
    
    Thread t = new Thread();
    int aceleracion = 0;
    
    public disparo(int x, int y, int paceleracion){
        this.setText("---0000");
        this.setBounds(x, y, 30, 20);
        this.setVisible(true);
        aceleracion = paceleracion;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            this.setLocation(this.getX()+1, this.getY());
            try {
                t.sleep(aceleracion);
            } catch (InterruptedException ex) {
                Logger.getLogger(disparo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        this.setText("&&");
        try {
            t.sleep(90);
        } catch (InterruptedException ex) {
            Logger.getLogger(disparo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        
    }
    
    
}
