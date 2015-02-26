/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_estructurasdedatos_primersemestre2015;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;


/**
 *
 * @author BLADIMIR
 */
public class avion extends JLabel implements KeyListener{
    
    PlantasVsZombies p;
    int disparos = 0;
    JLabel punteo;
    
    public avion(PlantasVsZombies p1,JLabel punteo1){
        this.setText("S>");
        this.setBounds(10, 20, 30, 20);
        this.setVisible(true);
        p = p1;
        punteo = punteo1;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
         if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.setLocation(this.getX(), this.getY()-2);
        }else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.setLocation(this.getX(), this.getY()+2);
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.setLocation(this.getX()+2, this.getY());
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.setLocation(this.getX()-2, this.getY());
        }else if (e.getKeyCode() == KeyEvent.VK_G) {
            disparo d = new disparo(this.getX()+14,this.getY(),(int)(Math.random()*100));
            Thread t = new Thread(d);
            p.add(d);
            disparos++;
            punteo.setText(String.valueOf(disparos));
            t.start();
        }else if (e.getKeyCode() == KeyEvent.VK_T) {
            bomba b = new bomba(this.getX()+14,this.getY());
            Thread t = new Thread(b);
            p.add(b);
            t.start();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
    
}
