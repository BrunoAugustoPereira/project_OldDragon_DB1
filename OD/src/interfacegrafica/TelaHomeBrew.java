/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

/**
 *
 * @author leoomoreira
 */
public class TelaHomeBrew extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaHomeBrew(java.awt.Frame parent, boolean modal) {
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

        rotuloAcoes = new javax.swing.JLabel();
        botaoInserirClasse = new javax.swing.JButton();
        botaoInserirIdioma = new javax.swing.JButton();
        botaoInserirArma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciador Old Dragon");
        setName("formPrincipal"); // NOI18N
        setResizable(false);

        rotuloAcoes.setText("Homebrew");

        botaoInserirClasse.setText("Inserir Classe");
        botaoInserirClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirClasseActionPerformed(evt);
            }
        });

        botaoInserirIdioma.setText("Inserir Idioma");
        botaoInserirIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirIdiomaActionPerformed(evt);
            }
        });

        botaoInserirArma.setText("Inserir Arma");
        botaoInserirArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirArmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloAcoes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoInserirClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoInserirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoInserirIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloAcoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserirClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirClasseActionPerformed
        TelaInserirClasse dialog = new TelaInserirClasse(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoInserirClasseActionPerformed

    private void botaoInserirIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirIdiomaActionPerformed
        TelaInserirIdioma dialog = new TelaInserirIdioma(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoInserirIdiomaActionPerformed

    private void botaoInserirArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirArmaActionPerformed
        TelaInserirArma dialog = new TelaInserirArma(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoInserirArmaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInserirArma;
    private javax.swing.JButton botaoInserirClasse;
    private javax.swing.JButton botaoInserirIdioma;
    private javax.swing.JLabel rotuloAcoes;
    // End of variables declaration//GEN-END:variables
}
