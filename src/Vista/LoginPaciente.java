/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class LoginPaciente extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Jugadores
     */
    public LoginPaciente() {
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

        Boton_Ingresar = new javax.swing.JButton();
        Cuadro_Email = new javax.swing.JTextField();
        Cuadro_Pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Item_Volver = new javax.swing.JMenu();
        Boton_Volver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Ingresar.setBackground(new java.awt.Color(255, 255, 0));
        Boton_Ingresar.setFont(new java.awt.Font("Khmer UI", 1, 24)); // NOI18N
        Boton_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PACIENTE.png"))); // NOI18N
        Boton_Ingresar.setText("INGRESAR");
        getContentPane().add(Boton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        Cuadro_Email.setBackground(new java.awt.Color(204, 204, 255));
        Cuadro_Email.setFont(new java.awt.Font("Khmer UI", 1, 24)); // NOI18N
        Cuadro_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cuadro_EmailKeyTyped(evt);
            }
        });
        getContentPane().add(Cuadro_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 380, 40));

        Cuadro_Pass.setBackground(new java.awt.Color(204, 204, 255));
        Cuadro_Pass.setFont(new java.awt.Font("Khmer OS", 1, 24)); // NOI18N
        getContentPane().add(Cuadro_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 380, 40));

        jLabel7.setFont(new java.awt.Font("Khmer UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PASS:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 120, -1));

        jLabel6.setFont(new java.awt.Font("Khmer UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMAIL:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paciente.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paciente.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1000, 630));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        Item_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        Item_Volver.setText("VOLVER");

        Boton_Volver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        Boton_Volver.setText("VOLVER MENU");
        Boton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VolverActionPerformed(evt);
            }
        });
        Item_Volver.add(Boton_Volver);

        jMenuBar1.add(Item_Volver);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VolverActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Boton_VolverActionPerformed

    private void Cuadro_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cuadro_EmailKeyTyped
        // TODO add your handling code here:
             
      
    }//GEN-LAST:event_Cuadro_EmailKeyTyped

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
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_Ingresar;
    public javax.swing.JMenuItem Boton_Volver;
    public javax.swing.JTextField Cuadro_Email;
    public javax.swing.JPasswordField Cuadro_Pass;
    private javax.swing.JMenu Item_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}