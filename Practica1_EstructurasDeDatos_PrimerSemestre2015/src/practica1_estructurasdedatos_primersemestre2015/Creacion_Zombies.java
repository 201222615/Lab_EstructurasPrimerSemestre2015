/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_estructurasdedatos_primersemestre2015;

import java.applet.AudioClip;

/**
 *
 * @author juanpablo
 */
public class Creacion_Zombies extends javax.swing.JFrame {

    /**
     * Creates new form Creacion_Zombies
     */
    public Creacion_Zombies() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        btnRegresarMenu_AgregarZombie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(766, 441));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("SEGA LOGO FONT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Imagen");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 130, 19);

        jLabel3.setFont(new java.awt.Font("SEGA LOGO FONT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 10, 69, 15);

        jLabel4.setFont(new java.awt.Font("SEGA LOGO FONT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Puntos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 10, 61, 15);

        jLabel5.setFont(new java.awt.Font("SEGA LOGO FONT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Ataque");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 10, 80, 15);

        jLabel6.setFont(new java.awt.Font("SEGA LOGO FONT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Defensa");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 10, 110, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disparo", "Directo", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 40, 80, 20);

        btnRegresarMenu_AgregarZombie.setFont(new java.awt.Font("Gunslinger", 0, 14)); // NOI18N
        btnRegresarMenu_AgregarZombie.setText("Agregar Zombie y Regresar a Menu");
        btnRegresarMenu_AgregarZombie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu_AgregarZombieActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarMenu_AgregarZombie);
        btnRegresarMenu_AgregarZombie.setBounds(220, 380, 290, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cono.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenu_AgregarZombieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu_AgregarZombieActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
sonido = java.applet.Applet.newAudioClip(getClass().getResource("/practica1_estructurasdedatos_primersemestre2015/bingo.wav"));
sonido.play();
            Elegir_Bando mostrar = new Elegir_Bando ();
  mostrar.setVisible(true);
    Creacion_Zombies.this.dispose();
mostrar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarMenu_AgregarZombieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Creacion_Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creacion_Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creacion_Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creacion_Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creacion_Zombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarMenu_AgregarZombie;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
