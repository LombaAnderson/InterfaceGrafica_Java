
        
package interface_grafica;

import  java.io.PrintStream;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    PrintStream Show = System.out;
  
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_sexo = new javax.swing.ButtonGroup();
        t_nome = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        c_nome = new javax.swing.JTextField();
        chb_idade = new javax.swing.JCheckBox();
        rb_fem = new javax.swing.JRadioButton();
        rb_masc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        t_nome.setText(" Nome:");

        btn_enviar.setText("Enviar");
        btn_enviar.setActionCommand("");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        chb_idade.setText("Maior de Idade");
        chb_idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_idadeActionPerformed(evt);
            }
        });

        grupo_sexo.add(rb_fem);
        rb_fem.setText("Feminino");
        rb_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_femActionPerformed(evt);
            }
        });

        grupo_sexo.add(rb_masc);
        rb_masc.setText("Masculino");

        jLabel1.setText("Sexo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_idade)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rb_masc)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btn_enviar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rb_fem)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(chb_idade)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_masc)
                    .addComponent(rb_fem)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btn_enviar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        String Idade = "";
        if(chb_idade.isSelected())
            Idade = "você é maior de idade";
        else
            Idade = "você é menor de idade";
        
        String sexo = "";
        
        if(rb_masc.isSelected())
            sexo = "Masculino";
        else if(rb_fem.isSelected())
            sexo = "Feminino";
        else
            sexo = "não informado";
        
        JOptionPane.showMessageDialog(rootPane,"Seu nome é: "+c_nome.getText()+" . "+Idade+" e de sexo "+sexo,"Alerta",JOptionPane.INFORMATION_MESSAGE);
        Show.println(c_nome.getText());
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void chb_idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_idadeActionPerformed
          
    }//GEN-LAST:event_chb_idadeActionPerformed

    private void rb_femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_femActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_femActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

  
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JTextField c_nome;
    private javax.swing.JCheckBox chb_idade;
    private javax.swing.ButtonGroup grupo_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JLabel t_nome;
    // End of variables declaration//GEN-END:variables
}
