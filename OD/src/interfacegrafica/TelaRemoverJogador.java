/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import dao.Jogador;
import dao.JogadorDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leoomoreira
 */
public class TelaRemoverJogador extends javax.swing.JDialog {

    /**
     * Creates new form TelaRemoverPessoa
     */
    public TelaRemoverJogador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ChangeOptions();
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
        textoCodigo = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        botaoRemover = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        idJogadores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Jogador");
        setName("dialogRemoverPessoa"); // NOI18N

        rotuloCodigo.setText("Código:");

        rotuloNome.setText("Nome:");

        textoNome.setEditable(false);

        botaoRemover.setText("Remover");
        botaoRemover.setEnabled(false);
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        idJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJogadoresActionPerformed(evt);
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
                        .addComponent(botaoConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoRemover)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotuloNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCodigo)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar)
                    .addComponent(idJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNome)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoRemover)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente remover este Jogador?", "Remover Jogador", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                Jogador p = new Jogador();
                p.setId(Integer.parseInt(textoCodigo.getText()));
                p.setNome(textoNome.getText());
                JogadorDAO dao = new JogadorDAO();
                dao.remover(p);
                textoCodigo.setEnabled(true);
                idJogadores.setEnabled(true);
                botaoConsultar.setEnabled(true);
                botaoRemover.setEnabled(false);
                textoCodigo.setText("");
                textoNome.setText("");
                ChangeOptions();
                JOptionPane.showMessageDialog(this, "Jogador removida com sucesso", "Remover Jogador", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Remover Jogador", JOptionPane.ERROR_MESSAGE);
            }
        }
        botaoRemover.transferFocus();
    }//GEN-LAST:event_botaoRemoverActionPerformed
    private void ChangeOptions(){
        try {
            idJogadores.removeAllItems();
            JogadorDAO jDAO = new JogadorDAO();
            List<Jogador> Jogadores = jDAO.obterTodos();
            for(int i = 0;Jogadores.size()>i;i++){
                idJogadores.addItem(Jogadores.get(i).getNome());
            }

            
        } catch (Exception ex) {
            Logger.getLogger(TelaAtualizarJogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        try {
            JogadorDAO dao = new JogadorDAO();
            Jogador p = dao.obterPorNome(idJogadores.getSelectedItem().toString()).get(0);
            textoNome.setText(p.getNome());
            textoCodigo.setText(Integer.toString(p.getId()));
            idJogadores.setEnabled(false);
            textoCodigo.setEnabled(false);
            botaoConsultar.setEnabled(false);
            botaoRemover.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Consultar Jogador", JOptionPane.ERROR_MESSAGE);
        }
        botaoConsultar.transferFocus();
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void idJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJogadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idJogadoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoRemover;
    public javax.swing.JComboBox<String> idJogadores;
    private javax.swing.JLabel rotuloCodigo;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoNome;
    // End of variables declaration//GEN-END:variables
}
