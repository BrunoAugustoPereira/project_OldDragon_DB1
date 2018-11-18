/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import dao.Pessoa;
import dao.PessoaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author leoomoreira
 */
public class TelaAtualizarPessoa extends javax.swing.JDialog {

    /**
     * Creates new form TelaAtualizarPessoa
     */
    public TelaAtualizarPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        rotuloCodigo = new javax.swing.JLabel();
        rotuloNome = new javax.swing.JLabel();
        rotuloLogin = new javax.swing.JLabel();
        rotuloSenha = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        textoLogin = new javax.swing.JTextField();
        textoSenha = new javax.swing.JTextField();
        botaoAtualizar = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Pessoa");
        setName("dialogAtualizarPessoa"); // NOI18N

        rotuloCodigo.setText("Código:");

        rotuloNome.setText("Nome:");

        rotuloLogin.setText("Login:");

        rotuloSenha.setText("Senha:");

        textoNome.setEnabled(false);

        textoLogin.setEnabled(false);

        textoSenha.setEnabled(false);

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.setEnabled(false);
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
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
                        .addComponent(rotuloCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoConsultar))
                    .addComponent(botaoAtualizar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloLogin)
                            .addComponent(rotuloSenha)
                            .addComponent(rotuloNome))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(textoLogin, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCodigo)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNome)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLogin)
                    .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloSenha)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente atualizar esta pessoa?", "Atualizar Pessoa", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                Pessoa p = new Pessoa();
                p.setCodigo(Integer.parseInt(textoCodigo.getText()));
                p.setNome(textoNome.getText());
                p.setLogin(textoLogin.getText());
                p.setSenha(textoSenha.getText());
                PessoaDAO dao = new PessoaDAO();
                dao.atualizar(p);
                textoCodigo.setEnabled(true);
                botaoConsultar.setEnabled(true);
                textoNome.setEnabled(false);
                textoLogin.setEnabled(false);
                textoSenha.setEnabled(false);
                botaoAtualizar.setEnabled(false);
                textoCodigo.setText("");
                textoNome.setText("");
                textoLogin.setText("");
                textoSenha.setText("");
                JOptionPane.showMessageDialog(this, "Pessoa atualizada com sucesso", "Atualizar Pessoa", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Atualizar Pessoa", JOptionPane.ERROR_MESSAGE);
            }
        }
        botaoAtualizar.transferFocus();
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        try {
            PessoaDAO dao = new PessoaDAO();
            Pessoa p = dao.obter(Integer.parseInt(textoCodigo.getText()));
            textoNome.setText(p.getNome());
            textoLogin.setText(p.getLogin());
            textoSenha.setText(p.getSenha());
            textoCodigo.setEnabled(false);
            botaoConsultar.setEnabled(false);
            textoNome.setEnabled(true);
            textoLogin.setEnabled(true);
            textoSenha.setEnabled(true);
            botaoAtualizar.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Consultar Pessoa", JOptionPane.ERROR_MESSAGE);
        }
        botaoConsultar.transferFocus();
    }//GEN-LAST:event_botaoConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JLabel rotuloCodigo;
    private javax.swing.JLabel rotuloLogin;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JLabel rotuloSenha;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoLogin;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoSenha;
    // End of variables declaration//GEN-END:variables
}
