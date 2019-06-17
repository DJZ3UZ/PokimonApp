
package interfaz;

import entidades.Pokimon;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class jfBatalla extends javax.swing.JFrame {
    public URL url;
    public URL pokimonp;
    public URL pokimonc;
    Pokimon miPokemon = new Pokimon(jfEleccion.nombre);
    Pokimon Pokemonrival= new Pokimon(jfEleccion.rival); 

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
            pokimonp = getClass().getResource("/imagenes/Bulbasaur_1.gif");
            pokimonc = getClass().getResource("/imagenes/charmander.gif");
            ImageIcon prop = new ImageIcon(pokimonp);
            ImageIcon cont = new ImageIcon(pokimonc);
            jLabel2.setIcon(prop);
            jLabel3.setIcon(cont);            
        }
        else if (jfEleccion.Charmander.isSelected()){
            pokimonp = getClass().getResource("/imagenes/charmander.gif");
            pokimonc = getClass().getResource("/imagenes/Squirtle 1_2.gif");
            ImageIcon prop = new ImageIcon(pokimonp);
            ImageIcon cont = new ImageIcon(pokimonc);
            jLabel2.setIcon(prop);
            jLabel3.setIcon(cont);            
        }
        else if (jfEleccion.Squirtle.isSelected()){
            pokimonp = getClass().getResource("/imagenes/Squirtle 1_2.gif");
            pokimonc = getClass().getResource("/imagenes/Bulbasaur_1.gif");
            ImageIcon prop = new ImageIcon(pokimonp);
            ImageIcon cont = new ImageIcon(pokimonc);
            jLabel2.setIcon(prop);
            jLabel3.setIcon(cont);            
        }
        jLabel4.setText(miPokemon.MostrarEstado());
        jLabel5.setText(Pokemonrival.MostrarEstado());
        
    }
    public void AnalizarSituacion(){
        miPokemon.nombre=jfEleccion.nombre;
        Pokemonrival.nombre=jfEleccion.rival;
        if(miPokemon.vida==0){
            jTextArea1.append(miPokemon.nombre + " ,ya no puede continuar. "
            + Pokemonrival.nombre + " gana la batalla.");
            
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Perdiste la batalla entrenador.");
            
        }
        if(Pokemonrival.vida==0 && miPokemon.vida>0){
            jTextArea1.append(Pokemonrival.nombre + " ,ya no puede continuar. "
            + miPokemon.nombre + " gana la batalla.");
            
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            JOptionPane.showMessageDialog(null," Ganaste la batalla.");
            
        if(Pokemonrival.vida==0 && miPokemon.vida==0){
            jButton1.setEnabled(false);
            JOptionPane.showMessageDialog(null," Ambos pokemones quedaron derrotados. Es un empate.");
        }
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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 530));
        setMinimumSize(new java.awt.Dimension(760, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("¡Hora de pelear!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bulbasaur_1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/charmander.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 530, 120));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Retirarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Atacar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 100, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Usar poción ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("estadodemipok");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("estadodepokrival");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red_(Pokémon).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Misty.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, 250));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Usar poción 2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Usar poción 3");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Regresar al Inicio");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Batalla.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        setSize(new java.awt.Dimension(779, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, " Has decidido retirarte de la batalla.");
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String resultado = miPokemon.Atacar(Pokemonrival);
        miPokemon.nombre =jfEleccion.nombre;
        Pokemonrival.nombre=jfEleccion.rival;
        jTextArea1.append(resultado + "\n");
        int cont = 0;    
        int pos = (int)(Math.random()*100);
            if(cont < 3){
                if(pos < 25 && Pokemonrival.vida <= 40){
                String resultado2 = Pokemonrival.usarPuntosdeVidaHP(Pokemonrival);
                jTextArea1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            else{
                 String resultado2 = Pokemonrival.Atacar(miPokemon);
                 jTextArea1.append(resultado2 + "\n");
            }
            
        }
        else{
            String resultado2 = Pokemonrival.Atacar(miPokemon);
            jTextArea1.append(resultado2 + "\n");               
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
        String mostrar= miPokemon.usarPuntosdeVidaHP(miPokemon);
        jTextArea1.append(mostrar + "\n");
        jLabel4.setText(miPokemon.MostrarEstado());
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String mostrar= miPokemon.usarPuntosdeVidaHP(miPokemon);
        jTextArea1.append(mostrar + "\n");
        jLabel4.setText(miPokemon.MostrarEstado());
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jfBienvenido marco = new jfBienvenido();
        marco.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
