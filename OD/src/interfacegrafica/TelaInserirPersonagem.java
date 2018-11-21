/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import dao.Classe;
import dao.ClasseDAO;
import dao.Idioma;
import dao.IdiomaDAO;
import dao.IdiomaPersonagem;
import dao.IdiomaPersonagemDAO;
import dao.Jogador;
import dao.JogadorDAO;
import dao.Mestre;
import dao.MestreDAO;
import dao.Personagem;
import dao.PersonagemDAO;
import dao.Raca;
import dao.RacaDAO;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leoomoreira
 */
public class TelaInserirPersonagem extends javax.swing.JDialog {

    /**
     * Creates new form TelaInserirPessoa
     */
    public TelaInserirPersonagem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ChangeOptionsJogador();
        ChangeOptionsMestre();
        ChangeOptionsRaca();
        ChangeOptionsClasse();
        ChangeOptionsIdiomasAdicionais();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotuloNome = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        jComboBoxAlinhamento = new javax.swing.JComboBox<>();
        textoIdade = new javax.swing.JTextField();
        rotuloNomeDadoClasse6 = new javax.swing.JLabel();
        jComboBoxNivel = new javax.swing.JComboBox<>();
        rotuloNomeDadoClasse7 = new javax.swing.JLabel();
        rotuloNomeDadoClasse8 = new javax.swing.JLabel();
        rotuloNomeDadoClasse9 = new javax.swing.JLabel();
        textoForca = new javax.swing.JTextField();
        textoDestreza = new javax.swing.JTextField();
        rotuloNomeDadoClasse10 = new javax.swing.JLabel();
        textoConstituicao = new javax.swing.JTextField();
        rotuloNomeDadoClasse11 = new javax.swing.JLabel();
        textoSabedoria = new javax.swing.JTextField();
        rotuloNomeDadoClasse12 = new javax.swing.JLabel();
        rotuloNomeDadoClasse13 = new javax.swing.JLabel();
        textoCarisma = new javax.swing.JTextField();
        rotuloNomeDadoClasse14 = new javax.swing.JLabel();
        textoInteligencia = new javax.swing.JTextField();
        rotuloNomeDadoClasse15 = new javax.swing.JLabel();
        rotuloNomeDadoClasse16 = new javax.swing.JLabel();
        rotuloNomeDadoClasse17 = new javax.swing.JLabel();
        rotuloNomeDadoClasse18 = new javax.swing.JLabel();
        botaoRolarStatus = new javax.swing.JButton();
        jComboBoxJogador = new javax.swing.JComboBox<>();
        jComboBoxMestre = new javax.swing.JComboBox<>();
        jComboBoxRaca = new javax.swing.JComboBox<>();
        jComboBoxClasse = new javax.swing.JComboBox<>();
        rotuloNomeDadoClasse19 = new javax.swing.JLabel();
        textoTamanho = new javax.swing.JTextField();
        jComboBoxIdiomaAdicional1 = new javax.swing.JComboBox<>();
        rotuloNomeDadoClasse20 = new javax.swing.JLabel();
        rotuloNomeDadoClasse21 = new javax.swing.JLabel();
        jComboBoxIdiomaAdicional2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Personagem");
        setName("dialogInserirPessoa"); // NOI18N

        rotuloNome.setText("Nome:");

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        jComboBoxAlinhamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordeiro", "Neutro", "Caotico" }));

        textoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdadeActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse6.setText("Nivel");

        jComboBoxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        rotuloNomeDadoClasse7.setText("Alinhamento");

        rotuloNomeDadoClasse8.setText("Idade");

        rotuloNomeDadoClasse9.setText("Jogador");

        textoForca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoForcaActionPerformed(evt);
            }
        });

        textoDestreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoDestrezaActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse10.setText("destreza");

        textoConstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoConstituicaoActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse11.setText("Constituição");

        textoSabedoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSabedoriaActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse12.setText("Sabedoria");

        rotuloNomeDadoClasse13.setText("Carisma");

        textoCarisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCarismaActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse14.setText("Inteligencia");

        textoInteligencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoInteligenciaActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse15.setText("Força");

        rotuloNomeDadoClasse16.setText("Mestre");

        rotuloNomeDadoClasse17.setText("Raça");

        rotuloNomeDadoClasse18.setText("Classe");

        botaoRolarStatus.setText("Rolar Dados Status");
        botaoRolarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRolarStatusActionPerformed(evt);
            }
        });

        jComboBoxJogador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordeiro", "Neutro", "Caotico" }));

        jComboBoxMestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordeiro", "Neutro", "Caotico" }));

        jComboBoxRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordeiro", "Neutro", "Caotico" }));

        jComboBoxClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordeiro", "Neutro", "Caotico" }));

        rotuloNomeDadoClasse19.setText("Tamanho");

        textoTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTamanhoActionPerformed(evt);
            }
        });

        rotuloNomeDadoClasse20.setText("Idioma Adicional 1: ");

        rotuloNomeDadoClasse21.setText("Idioma Adicional 2: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotuloNomeDadoClasse20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxIdiomaAdicional1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotuloNomeDadoClasse16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(rotuloNomeDadoClasse21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxIdiomaAdicional2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoInserir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotuloNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rotuloNomeDadoClasse6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rotuloNomeDadoClasse7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAlinhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotuloNomeDadoClasse8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rotuloNomeDadoClasse19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rotuloNomeDadoClasse9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotuloNomeDadoClasse10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotuloNomeDadoClasse15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoForca, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloNomeDadoClasse11)
                                    .addComponent(rotuloNomeDadoClasse12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoSabedoria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rotuloNomeDadoClasse14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoConstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rotuloNomeDadoClasse13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoRolarStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rotuloNomeDadoClasse18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rotuloNomeDadoClasse17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotuloNomeDadoClasse19)
                        .addComponent(textoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotuloNome)
                        .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotuloNomeDadoClasse6)
                        .addComponent(jComboBoxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotuloNomeDadoClasse7)
                        .addComponent(jComboBoxAlinhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotuloNomeDadoClasse8)
                        .addComponent(textoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloNomeDadoClasse11)
                            .addComponent(textoConstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloNomeDadoClasse13)
                            .addComponent(textoCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloNomeDadoClasse15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloNomeDadoClasse10)
                            .addComponent(textoDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloNomeDadoClasse12)
                            .addComponent(textoSabedoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloNomeDadoClasse14)
                            .addComponent(textoInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloNomeDadoClasse9)
                            .addComponent(rotuloNomeDadoClasse17)
                            .addComponent(jComboBoxJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloNomeDadoClasse16)
                            .addComponent(rotuloNomeDadoClasse18)
                            .addComponent(jComboBoxMestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(botaoRolarStatus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxIdiomaAdicional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloNomeDadoClasse20)
                    .addComponent(rotuloNomeDadoClasse21)
                    .addComponent(jComboBoxIdiomaAdicional2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(botaoInserir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente inserir este Personagem?", "Inserir Personagem", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            try {
                Personagem p = new Personagem();
                p.setNome(textoNome.getText());
                p.setNive(Integer.parseInt(jComboBoxNivel.getSelectedItem().toString()));
                p.setAlinhamento(jComboBoxAlinhamento.getSelectedItem().toString());
                p.setIdade(Integer.parseInt(textoIdade.getText()));
                p.setTamanho(Integer.parseInt(textoTamanho.getText()));
                p.setForca(Integer.parseInt(textoForca.getText()));
                p.setDestreza(Integer.parseInt(textoDestreza.getText()));
                p.setConstituicao(Integer.parseInt(textoConstituicao.getText()));
                p.setSabedoria(Integer.parseInt(textoSabedoria.getText()));
                p.setCarisma(Integer.parseInt(textoCarisma.getText()));
                p.setInteligencia(Integer.parseInt(textoInteligencia.getText()));

                RacaDAO rDAO = new RacaDAO();
                Raca r = rDAO.obterPorNome(jComboBoxRaca.getSelectedItem().toString()).get(0);
                p.setRaca(r.getId());

                ClasseDAO cDAO = new ClasseDAO();
                Classe c = cDAO.obterPorNome(jComboBoxClasse.getSelectedItem().toString()).get(0);
                p.setClasse(c.getId());

                MestreDAO mDAO = new MestreDAO();
                Mestre m = mDAO.obterPorNome(jComboBoxMestre.getSelectedItem().toString()).get(0);
                p.setMestre(m.getId());

                JogadorDAO jDAO = new JogadorDAO();
                Jogador j = jDAO.obterPorNome(jComboBoxJogador.getSelectedItem().toString()).get(0);
                p.setJogador(j.getId());
                PersonagemDAO dao = new PersonagemDAO();
                dao.inserir(p);
                int id_pers=dao.obterPorNome(p.getNome()).get(0).getId();
                IdiomaDAO d=new IdiomaDAO();
                int id_id1 = d.obterPorNome(jComboBoxIdiomaAdicional1.getSelectedItem().toString()).get(0).getId();
                int id_id2 = d.obterPorNome(jComboBoxIdiomaAdicional2.getSelectedItem().toString()).get(0).getId();
                IdiomaPersonagem ip1 = new IdiomaPersonagem();
                ip1.setIdIdioma(id_id1);
                ip1.setIdPersonagem(id_pers);
                IdiomaPersonagem ip2 = new IdiomaPersonagem();
                ip2.setIdIdioma(id_id2);
                ip2.setIdPersonagem(id_pers);
                IdiomaPersonagemDAO ipDAO = new IdiomaPersonagemDAO();
                ipDAO.inserir(ip1);
                ipDAO.inserir(ip2);
                textoNome.setText("");
                textoIdade.setText("");
                textoTamanho.setText("");
                textoForca.setText("");
                textoDestreza.setText("");
                textoConstituicao.setText("");
                textoSabedoria.setText("");
                textoCarisma.setText("");
                textoInteligencia.setText("");
                JOptionPane.showMessageDialog(this, "Personagem inserido com sucesso", "Inserir Personagem", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Inserir Personagem", JOptionPane.ERROR_MESSAGE);
            }
        }
        botaoInserir.transferFocus();
    }//GEN-LAST:event_botaoInserirActionPerformed
    private void ChangeOptionsJogador(){
        try {
            jComboBoxJogador.removeAllItems();
            JogadorDAO jDAO = new JogadorDAO();
            List<Jogador> Jogadores = jDAO.obterTodos();
            for(int i = 0;Jogadores.size()>i;i++){
                jComboBoxJogador.addItem(Jogadores.get(i).getNome());
            }

            
        } catch (Exception ex) {
            Logger.getLogger(TelaAtualizarJogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ChangeOptionsMestre(){
        try {
            jComboBoxMestre.removeAllItems();
            MestreDAO jDAO = new MestreDAO();
            List<Mestre> Mestres = jDAO.obterTodos();
            for(int i = 0;Mestres.size()>i;i++){
                jComboBoxMestre.addItem(Mestres.get(i).getNome());
            }

            
        } catch (Exception ex) {
            Logger.getLogger(TelaAtualizarJogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ChangeOptionsRaca(){
        try {
            jComboBoxRaca.removeAllItems();
            RacaDAO jDAO = new RacaDAO();
            List<Raca> Racas = jDAO.obterTodos();
            for(int i = 0;Racas.size()>i;i++){
                jComboBoxRaca.addItem(Racas.get(i).getNome());
            }

            
        } catch (Exception ex) {
            Logger.getLogger(TelaAtualizarJogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ChangeOptionsClasse(){
        try {
            jComboBoxClasse.removeAllItems();
            ClasseDAO jDAO = new ClasseDAO();
            List<Classe> Classes = jDAO.obterTodos();
            
            for(int i = 0;Classes.size()>i;i++){
                jComboBoxClasse.addItem(Classes.get(i).getNome());
            }

            
        } catch (Exception ex) {
            Logger.getLogger(TelaAtualizarJogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ChangeOptionsIdiomasAdicionais(){
        try {
            jComboBoxIdiomaAdicional1.removeAllItems();
            jComboBoxIdiomaAdicional2.removeAllItems();
            IdiomaDAO jDAO = new IdiomaDAO();
            List<Idioma> Idiomas = jDAO.obterTodos();
            
            for(int i = 0;Idiomas.size()>i;i++){
                jComboBoxIdiomaAdicional1.addItem(Idiomas.get(i).getNome());
                jComboBoxIdiomaAdicional2.addItem(Idiomas.get(i).getNome());
            }

            
        } catch (Exception ex) {
            Logger.getLogger(TelaAtualizarJogador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void textoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIdadeActionPerformed

    private void textoForcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoForcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoForcaActionPerformed

    private void textoDestrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoDestrezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoDestrezaActionPerformed

    private void textoConstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoConstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoConstituicaoActionPerformed

    private void textoSabedoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSabedoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSabedoriaActionPerformed

    private void textoCarismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCarismaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCarismaActionPerformed

    private void textoInteligenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoInteligenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoInteligenciaActionPerformed

    private void botaoRolarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRolarStatusActionPerformed
     Random random = new Random();
     int x = random.nextInt(15)+3;
     textoForca.setText(Integer.toString(x));
     x = random.nextInt(15)+3;
     textoDestreza.setText(Integer.toString(x));
     x = random.nextInt(15)+3;
     textoConstituicao.setText(Integer.toString(x));
     x = random.nextInt(15)+3;
     textoSabedoria.setText(Integer.toString(x));
     x = random.nextInt(15)+3;
     textoCarisma.setText(Integer.toString(x));
     x = random.nextInt(15)+3;
     textoInteligencia.setText(Integer.toString(x));
    }//GEN-LAST:event_botaoRolarStatusActionPerformed

    private void textoTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTamanhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoRolarStatus;
    private javax.swing.JComboBox<String> jComboBoxAlinhamento;
    public javax.swing.JComboBox<String> jComboBoxClasse;
    public javax.swing.JComboBox<String> jComboBoxIdiomaAdicional1;
    public javax.swing.JComboBox<String> jComboBoxIdiomaAdicional2;
    public javax.swing.JComboBox<String> jComboBoxJogador;
    public javax.swing.JComboBox<String> jComboBoxMestre;
    private javax.swing.JComboBox<String> jComboBoxNivel;
    public javax.swing.JComboBox<String> jComboBoxRaca;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JLabel rotuloNomeDadoClasse10;
    private javax.swing.JLabel rotuloNomeDadoClasse11;
    private javax.swing.JLabel rotuloNomeDadoClasse12;
    private javax.swing.JLabel rotuloNomeDadoClasse13;
    private javax.swing.JLabel rotuloNomeDadoClasse14;
    private javax.swing.JLabel rotuloNomeDadoClasse15;
    private javax.swing.JLabel rotuloNomeDadoClasse16;
    private javax.swing.JLabel rotuloNomeDadoClasse17;
    private javax.swing.JLabel rotuloNomeDadoClasse18;
    private javax.swing.JLabel rotuloNomeDadoClasse19;
    private javax.swing.JLabel rotuloNomeDadoClasse20;
    private javax.swing.JLabel rotuloNomeDadoClasse21;
    private javax.swing.JLabel rotuloNomeDadoClasse6;
    private javax.swing.JLabel rotuloNomeDadoClasse7;
    private javax.swing.JLabel rotuloNomeDadoClasse8;
    private javax.swing.JLabel rotuloNomeDadoClasse9;
    private javax.swing.JTextField textoCarisma;
    private javax.swing.JTextField textoConstituicao;
    private javax.swing.JTextField textoDestreza;
    private javax.swing.JTextField textoForca;
    private javax.swing.JTextField textoIdade;
    private javax.swing.JTextField textoInteligencia;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoSabedoria;
    private javax.swing.JTextField textoTamanho;
    // End of variables declaration//GEN-END:variables
}
