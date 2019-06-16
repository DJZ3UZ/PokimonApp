/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Pokimon;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class jfBatalla extends javax.swing.JFrame {
    public URL url;
    public URL pokimonp;
    public URL pokimonc;
    Pokimon miPokemon = new Pokimon(" Bulbasaur ");
    Pokimon Pokemonrival= new Pokimon(" Charmander "); 

    public jfBatalla() {
        initComponents();
        this.setLocationRelativeTo(this);
        AudioClip musica;
        musica = java.applet.Applet.newAudioClip(getClass().getResource("/musica/Batalla.wav"));
        musica.play();
        initComponents(); 
        if (jfBienvenido.Masculino.isSelected()){
            jfBienvenido.url = getClass().getResource("/imagenes/Red_(Pokémon).png");
            url = getClass().getResource("/imagenes/Misty.png");
            ImageIcon con = new ImageIcon(url);
            ImageIcon sex = new ImageIcon(jfBienvenido.url);
            jLabel7.setIcon(sex);
            jLabel6.setIcon(con);
        }
        else if (jfBienvenido.Femenino.isSelected()){
            jfBienvenido.url = getClass().getResource("/imagenes/Liza_NB_(Ilustración).png");
            url = getClass().getResource("/imagenes/Ash.png");
            ImageIcon con = new ImageIcon(url);
            ImageIcon sex = new ImageIcon(jfBienvenido.url);
            jLabel7.setIcon(sex);
            jLabel6.setIcon(con);
        }
        if (jfEleccion.Bulbasaur.isSelected()){
            pokimonp = getClass().getResource("/imagenes/Bulbasaur.gif");
            pokimonc = getClass().getResource("/imagenes/charmander.gif");
            ImageIcon prop = new ImageIcon(pokimonp);
            ImageIcon cont = new ImageIcon(pokimonc);
            jLabel2.setIcon(prop);
            jLabel3.setIcon(cont);            
        }
        else if (jfEleccion.Charmander.isSelected()){
            pokimonp = getClass().getResource("/imagenes/charmander.gif");
            pokimonc = getClass().getResource("/imagenes/Squirtle 1.gif");
            ImageIcon prop = new ImageIcon(pokimonp);
            ImageIcon cont = new ImageIcon(pokimonc);
            jLabel2.setIcon(prop);
            jLabel3.setIcon(cont);            
        }
        else if (jfEleccion.Squirtle.isSelected()){
            pokimonp = getClass().getResource("/imagenes/Squirtle 1.gif");
            pokimonc = getClass().getResource("/imagenes/Bulbasaur.gif");
            ImageIcon prop = new ImageIcon(pokimonp);
            ImageIcon cont = new ImageIcon(pokimonc);
            jLabel2.setIcon(prop);
            jLabel3.setIcon(cont);            
        }
        jLabel4.setText(miPokemon.MostrarEstado());
        jLabel5.setText(Pokemonrival.MostrarEstado());
        
    }
    public void AnalizarSituacion(){
        if(miPokemon.vida==0){
            jTextArea1.append(miPokemon.nombre + " ,ya no puede continuar,"
            + Pokemonrival.nombre + "gana la batalla.");
            
            jButton1.setEnabled(false);
        }
        if(Pokemonrival.vida==0){
            jTextArea1.append(Pokemonrival.nombre + " ,ya no puede continuar,"
            + miPokemon.nombre + "gana la batalla.");
            
            jButton1.setEnabled(false);
            JOptionPane.showMessageDialog(null," Ganaste la batalla.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(761, 567));
        setMinimumSize(new java.awt.Dimension(761, 567));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("¡Hora de pelear!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bulbasaur.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 270, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/charmander.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 520, 120));

        jButton2.setText("Retirarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        jButton1.setText("Atacar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jButton3.setText("Usar poción");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("estadodemipok");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("estadodepokrival");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red_(Pokémon).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Misty.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, 250));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Batalla.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 570));

        jButton5.setText("Usar poción");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jButton6.setText("Usar poción");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        setSize(new java.awt.Dimension(779, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, " Has huido de la batalla.");
        jfBienvenido marco = new jfBienvenido();
        marco.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double p1 = Math.random();
        double p2 = Math.random();
        if(p1>p2){
            String resultado= miPokemon.Atacar(Pokemonrival);
            jTextArea1.append(resultado + "\n ");
            String resultado2= Pokemonrival.Atacar(miPokemon);
            jTextArea1.append(resultado + " \n");
        }
        else{
            String resultado2= Pokemonrival.Atacar(miPokemon);
            jTextArea1.append(resultado2 + " \n");
            String resultado= miPokemon.Atacar(Pokemonrival);
            jTextArea1.append(resultado + " \n");
            
        }
        jLabel4.setText(miPokemon.MostrarEstado());
        jLabel5.setText(Pokemonrival.MostrarEstado());
        
        
        AnalizarSituacion();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String mostrar= miPokemon.usarPuntosdeVidaHP(miPokemon);
        jTextArea1.append(mostrar + "\n");
        jLabel4.setText(miPokemon.MostrarEstado());
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(jfBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfBatalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
