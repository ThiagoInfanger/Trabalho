package view;

import control.CtrManterAuthor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Authors;

public class FormManterAuthor extends javax.swing.JFrame {
    
    CtrManterAuthor ctrManterAuthor = new CtrManterAuthor();
    Authors autho;
    public FormManterAuthor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jTxtNome = new javax.swing.JTextField();
        jTxtFname = new javax.swing.JTextField();
        jTxtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCbxAuthors = new javax.swing.JList();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnIncluirMouseClicked(evt);
            }
        });

        jTxtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFnameActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Nome:");

        jLabel3.setText("FName:");

        jCbxAuthors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbxAuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jCbxAuthors);

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnExcluirMouseClicked(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAlterarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnAlterar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAlterar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnIncluirMouseClicked
        autho = new Authors();
        autho.setAuthor_id(Integer.parseInt(jTxtId.getText()));
        autho.setName(jTxtNome.getText());
        autho.setFname(jTxtFname.getText());
        if (ctrManterAuthor.gravarAuthors(autho) == 1) {
            JOptionPane.showMessageDialog(null, "Objeto persistido");
        } else {
            JOptionPane.showMessageDialog(null, "Objeto não persistido");
        }
    }//GEN-LAST:event_jBtnIncluirMouseClicked

    private void jTxtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFnameActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultListModel listModel = new DefaultListModel();
        List listAuthors = new ArrayList();
        listAuthors = ctrManterAuthor.carregarAuthors();
        if (listAuthors != null) {
            Iterator i = listAuthors.iterator();
            while (i.hasNext()) {
                Authors deptList = (Authors) i.next();
                listModel.addElement(deptList);
            }
            jCbxAuthors.setModel(listModel);
            
        } 
    }//GEN-LAST:event_formWindowActivated

    private void jCbxAuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbxAuthorsMouseClicked
        autho = (Authors) jCbxAuthors.getSelectedValue();
        if (autho != null) {
            jTxtId.setText(autho.getAuthor_id().toString());
            jTxtNome.setText(autho.getName());
            jTxtFname.setText(autho.getFname());
            }      
        else {               
            JOptionPane.showMessageDialog(null, "Objeto não Encontrado!");
        } 
    }//GEN-LAST:event_jCbxAuthorsMouseClicked

    private void jBtnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExcluirMouseClicked
            autho = (Authors) jCbxAuthors.getSelectedValue();
            if (autho != null) {
                if (ctrManterAuthor.excluirAuthors(autho)) {
                    JOptionPane.showMessageDialog(null, "Objeto Excluído");
                }          
                else {
                    JOptionPane.showMessageDialog(null, "Objeto não excluído");
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Selecione o Objeto");
            }
    }//GEN-LAST:event_jBtnExcluirMouseClicked

    private void jBtnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAlterarMouseClicked
        autho = (Authors) jCbxAuthors.getSelectedValue();
        if (autho != null) {
            autho.setAuthor_id(Integer.parseInt(jTxtId.getText()));
            autho.setName(jTxtNome.getText());
            autho.setFname(jTxtFname.getText());
            if (ctrManterAuthor.alterarAuthors(autho)) {
                JOptionPane.showMessageDialog(null, "Objeto persistido");
            }   
            else {
                JOptionPane.showMessageDialog(null, "Objeto não persistido");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Objeto não localizado");
        }
    }//GEN-LAST:event_jBtnAlterarMouseClicked

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
            java.util.logging.Logger.getLogger(FormManterAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormManterAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormManterAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormManterAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormManterAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JList jCbxAuthors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtFname;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
