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
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
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
        javax.swing.JButton botaoConsultarJogadores = new javax.swing.JButton();
        botaoInserirMestre = new javax.swing.JButton();
        botaoAtualizarMestre = new javax.swing.JButton();
        botaoRemoverJogadores = new javax.swing.JButton();
        botaoAtualizarJogadores = new javax.swing.JButton();
        botaoInserirJogadores = new javax.swing.JButton();
        javax.swing.JButton botaoConsultarMestres = new javax.swing.JButton();
        botaoRemoverMestre = new javax.swing.JButton();
        botaoInserirClasse = new javax.swing.JButton();
        botaoInserirIdioma = new javax.swing.JButton();
        botaoInserirArma = new javax.swing.JButton();
        botaoInserirPersonagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador Old Dragon");
        setName("formPrincipal"); // NOI18N
        setResizable(false);

        rotuloAcoes.setText("Ações da Aplicação");

        botaoConsultarJogadores.setText("Consultar Jogadores");
        botaoConsultarJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarJogadoresActionPerformed(evt);
            }
        });

        botaoInserirMestre.setText("Inserir Mestre");
        botaoInserirMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirMestreActionPerformed(evt);
            }
        });

        botaoAtualizarMestre.setText("Atualizar Mestre");
        botaoAtualizarMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarMestreActionPerformed(evt);
            }
        });

        botaoRemoverJogadores.setText("Remover Jogadores");
        botaoRemoverJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverJogadoresActionPerformed(evt);
            }
        });

        botaoAtualizarJogadores.setText("Atualizar Jogadores");
        botaoAtualizarJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarJogadoresActionPerformed(evt);
            }
        });

        botaoInserirJogadores.setText("Inserir Jogadores");
        botaoInserirJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirJogadoresActionPerformed(evt);
            }
        });

        botaoConsultarMestres.setText("Consultar Mestres");
        botaoConsultarMestres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarMestresActionPerformed(evt);
            }
        });

        botaoRemoverMestre.setText("Remover Mestre");
        botaoRemoverMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverMestreActionPerformed(evt);
            }
        });

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

        botaoInserirPersonagem.setText("Inserir Personagem");
        botaoInserirPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirPersonagemActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoInserirClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoConsultarJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botaoInserirJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(botaoConsultarMestres, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoInserirMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botaoInserirIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoInserirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(botaoInserirPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoAtualizarMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoRemoverMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoAtualizarJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoRemoverJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloAcoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultarJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAtualizarJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRemoverJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizarMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultarMestres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRemoverMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserirClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoInserirIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirMestreActionPerformed
        TelaInserirMestre dialog = new TelaInserirMestre(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoInserirMestreActionPerformed

    private void botaoAtualizarMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarMestreActionPerformed
        TelaAtualizarMestre dialog = new TelaAtualizarMestre(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoAtualizarMestreActionPerformed

    private void botaoRemoverJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverJogadoresActionPerformed
        TelaRemoverJogador dialog = new TelaRemoverJogador(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoRemoverJogadoresActionPerformed

    private void botaoConsultarJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarJogadoresActionPerformed
        TelaConsultarJogador dialog = new TelaConsultarJogador(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoConsultarJogadoresActionPerformed

    private void botaoAtualizarJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarJogadoresActionPerformed
        TelaAtualizarJogador dialog = new TelaAtualizarJogador(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoAtualizarJogadoresActionPerformed

    private void botaoInserirJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirJogadoresActionPerformed
        TelaInserirJogador dialog = new TelaInserirJogador(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
                                 
    }//GEN-LAST:event_botaoInserirJogadoresActionPerformed

    private void botaoConsultarMestresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarMestresActionPerformed
        TelaConsultarMestre dialog = new TelaConsultarMestre(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoConsultarMestresActionPerformed

    private void botaoRemoverMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverMestreActionPerformed
        TelaRemoverMestre dialog = new TelaRemoverMestre(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_botaoRemoverMestreActionPerformed

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

    private void botaoInserirPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirPersonagemActionPerformed
        TelaInserirPersonagem dialog = new TelaInserirPersonagem(this, true);
        dialog.setLocationRelativeTo(null);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setVisible(true);
    
    }//GEN-LAST:event_botaoInserirPersonagemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizarJogadores;
    private javax.swing.JButton botaoAtualizarMestre;
    private javax.swing.JButton botaoInserirArma;
    private javax.swing.JButton botaoInserirClasse;
    private javax.swing.JButton botaoInserirIdioma;
    private javax.swing.JButton botaoInserirJogadores;
    private javax.swing.JButton botaoInserirMestre;
    private javax.swing.JButton botaoInserirPersonagem;
    private javax.swing.JButton botaoRemoverJogadores;
    private javax.swing.JButton botaoRemoverMestre;
    private javax.swing.JLabel rotuloAcoes;
    // End of variables declaration//GEN-END:variables
}
