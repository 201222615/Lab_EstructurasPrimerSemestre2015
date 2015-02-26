/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_estructurasdedatos_primersemestre2015;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class bomba extends JLabel implements Runnable{
    
    Thread t = new Thread();
    
    public bomba(int x, int y){
        this.setText("O");
        this.setBounds(x, y, 30, 20);
        this.setVisible(true);
    }

    @Override
    public void run() {
        try {
            t.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(bomba.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }
}
