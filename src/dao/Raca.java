/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author aluno
 */
public class Raca {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tamanhoUsual
     */
    public int getTamanhoUsual() {
        return tamanhoUsual;
    }

    /**
     * @param tamanhoUsual the tamanhoUsual to set
     */
    public void setTamanhoUsual(int tamanhoUsual) {
        this.tamanhoUsual = tamanhoUsual;
    }

    /**
     * @return the idadeMaturidade
     */
    public int getIdadeMaturidade() {
        return idadeMaturidade;
    }

    /**
     * @param idadeMaturidade the idadeMaturidade to set
     */
    public void setIdadeMaturidade(int idadeMaturidade) {
        this.idadeMaturidade = idadeMaturidade;
    }

    /**
     * @return the expectativaDeVida
     */
    public String getExpectativaDeVida() {
        return expectativaDeVida;
    }

    /**
     * @param expectativaDeVida the expectativaDeVida to set
     */
    public void setExpectativaDeVida(String expectativaDeVida) {
        this.expectativaDeVida = expectativaDeVida;
    }

    /**
     * @return the movimentacaobase
     */
    public int getMovimentacaobase() {
        return movimentacaobase;
    }

    /**
     * @param movimentacaobase the movimentacaobase to set
     */
    public void setMovimentacaobase(int movimentacaobase) {
        this.movimentacaobase = movimentacaobase;
    }

    /**
     * @return the idIdioma
     */
    public int getIdIdioma() {
        return idIdioma;
    }

    /**
     * @param idIdioma the idIdioma to set
     */
    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }
    private int id;
    private String nome;
    private int tamanhoUsual;
    private int idadeMaturidade;
    private String expectativaDeVida;
    private int movimentacaobase;
    private int idIdioma;

}
