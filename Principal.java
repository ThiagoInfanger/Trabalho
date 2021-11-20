
import DAO.TrabalhoAPSConfiguracao;
import javax.swing.JFrame;
import view.FormBooksAuthor;
import view.FormManterAuthor;
import view.FormManterBooks;
import view.FormManterPublisher;

public class Principal extends javax.swing.JFrame {

    JFrame tela;
    
    public Principal() {
        TrabalhoAPSConfiguracao configuracao = new TrabalhoAPSConfiguracao();
        configuracao.criaSessionFactory();
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnExibirAuthor = new javax.swing.JButton();
        jExibirPubli = new javax.swing.JButton();
        jButtonBooks = new javax.swing.JButton();
        jButtonBooksAuthor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnExibirAuthor.setText("Author");
        jBtnExibirAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExibirAuthorActionPerformed(evt);
            }
        });

        jExibirPubli.setText("Publishers");
        jExibirPubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExibirPubliActionPerformed(evt);
            }
        });

        jButtonBooks.setText("Books");
        jButtonBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBooksMouseClicked(evt);
            }
        });

        jButtonBooksAuthor.setText("BooksAuthor");
        jButtonBooksAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBooksAuthorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jExibirPubli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnExibirAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBooksAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnExibirAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jExibirPubli, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButtonBooksAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExibirAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExibirAuthorActionPerformed
        tela = new FormManterAuthor();
        carregarTela();      
    }//GEN-LAST:event_jBtnExibirAuthorActionPerformed

    private void jExibirPubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExibirPubliActionPerformed
        tela = new FormManterPublisher();
        carregarTela();        
    }//GEN-LAST:event_jExibirPubliActionPerformed

    private void jButtonBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBooksMouseClicked
        tela = new FormManterBooks();
        carregarTela();
    }//GEN-LAST:event_jButtonBooksMouseClicked

    private void jButtonBooksAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBooksAuthorMouseClicked
        tela = new FormBooksAuthor();
        carregarTela();
    }//GEN-LAST:event_jButtonBooksAuthorMouseClicked

    private void carregarTela(){
        tela.setVisible(true);
        tela.setLocationRelativeTo(this);
    }
    
    public static void main(String args[]) {   
        Principal telaPrincipal = new Principal();
        telaPrincipal.setVisible(true);
        telaPrincipal.setExtendedState(MAXIMIZED_BOTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExibirAuthor;
    private javax.swing.JButton jButtonBooks;
    private javax.swing.JButton jButtonBooksAuthor;
    private javax.swing.JButton jExibirPubli;
    // End of variables declaration//GEN-END:variables
}
