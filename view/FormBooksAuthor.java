
package view;

import control.CtrManterBooksAuthor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.BooksAuthor;

public class FormBooksAuthor extends javax.swing.JFrame {

    CtrManterBooksAuthor ctrManterBooksAuthor = new CtrManterBooksAuthor();
    BooksAuthor booksAuthor;
    public FormBooksAuthor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jLstBooksAuthor = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jTxtIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtauthor_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtSeq_no = new javax.swing.JTextField();
        jBtnExcluir = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLstBooksAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstBooksAuthorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLstBooksAuthor);

        jTxtIsbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtIsbnMouseClicked(evt);
            }
        });

        jLabel2.setText("Author id: ");

        jLabel3.setText("N??mero Sequencial: ");

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnExcluirMouseClicked(evt);
            }
        });

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnIncluirMouseClicked(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAlterarMouseClicked(evt);
            }
        });

        jLabel4.setText("Isbn: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtSeq_no, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jTxtauthor_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtIsbn, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtauthor_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtSeq_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    DefaultListModel listModel = new DefaultListModel();
        List listBooksAuthor = new ArrayList();
        listBooksAuthor = ctrManterBooksAuthor.carregarBooksAuthor();
        if (listBooksAuthor != null) {
            Iterator i = listBooksAuthor.iterator();
            while (i.hasNext()) {
                BooksAuthor bookAuthorList = (BooksAuthor) i.next();
                listModel.addElement(bookAuthorList);
            }
            jLstBooksAuthor.setModel(listModel);
            
        } 
    }//GEN-LAST:event_formWindowActivated

    private void jLstBooksAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstBooksAuthorMouseClicked
    booksAuthor = (BooksAuthor) jLstBooksAuthor.getSelectedValue();
        if (booksAuthor != null) {
            jTxtIsbn.setText(booksAuthor.getIsbn());
            jTxtauthor_id.setText(booksAuthor.getAuthor_id().toString());
            jTxtSeq_no.setText(booksAuthor.getSeq_no().toString());
            }      
        else {               
            JOptionPane.showMessageDialog(null, "Objeto n??o Encontrado!");
        } 
    }//GEN-LAST:event_jLstBooksAuthorMouseClicked

    private void jTxtIsbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtIsbnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIsbnMouseClicked

    private void jBtnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExcluirMouseClicked
    booksAuthor = (BooksAuthor) jLstBooksAuthor.getSelectedValue();
            if (booksAuthor != null) {
                if (ctrManterBooksAuthor.excluirBooksAuthor(booksAuthor)) {
                    JOptionPane.showMessageDialog(null, "Objeto Exclu??do");
                }          
                else {
                    JOptionPane.showMessageDialog(null, "Objeto n??o exclu??do");
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Selecione o Objeto");
            }
    }//GEN-LAST:event_jBtnExcluirMouseClicked

    private void jBtnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnIncluirMouseClicked
        booksAuthor = new BooksAuthor();
        booksAuthor.setIsbn(jTxtIsbn.getText());
        booksAuthor.setAuthor_id(Integer.parseInt(jTxtauthor_id.getText()));
        booksAuthor.setSeq_no(Integer.parseInt(jTxtSeq_no.getText()));
        if (ctrManterBooksAuthor.gravarBooksAuthor(booksAuthor) == 1) {
            JOptionPane.showMessageDialog(null, "Objeto persistido");
        } else {
            JOptionPane.showMessageDialog(null, "Objeto n??o persistido");
        }
    }//GEN-LAST:event_jBtnIncluirMouseClicked

    private void jBtnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAlterarMouseClicked
    booksAuthor = (BooksAuthor) jLstBooksAuthor.getSelectedValue();
        if (booksAuthor != null) {
            booksAuthor.setIsbn(jTxtIsbn.getText());
            booksAuthor.setAuthor_id(Integer.parseInt(jTxtauthor_id.getText()));
            booksAuthor.setSeq_no(Integer.parseInt(jTxtSeq_no.getText()));
            if (ctrManterBooksAuthor.alterarBooksAuthor(booksAuthor)) {
                JOptionPane.showMessageDialog(null, "Objeto persistido");
            }   
            else {
                JOptionPane.showMessageDialog(null, "Objeto n??o persistido");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Objeto n??o localizado");
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
            java.util.logging.Logger.getLogger(FormBooksAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBooksAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBooksAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBooksAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBooksAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jLstBooksAuthor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtIsbn;
    private javax.swing.JTextField jTxtSeq_no;
    private javax.swing.JTextField jTxtauthor_id;
    // End of variables declaration//GEN-END:variables
}
