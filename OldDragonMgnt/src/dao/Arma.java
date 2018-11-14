/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

public class Arma {

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
     * @return the tipoDeDano
     */
    public String getTipoDeDano() {
        return tipoDeDano;
    }

    /**
     * @param tipoDeDano the tipoDeDano to set
     */
    public void setTipoDeDano(String tipoDeDano) {
        this.tipoDeDano = tipoDeDano;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the alcance
     */
    public String getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * @return the dano
     */
    public String getDano() {
        return dano;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(String dano) {
        this.dano = dano;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the chanceDeCritico
     */
    public int getChanceDeCritico() {
        return chanceDeCritico;
    }

    /**
     * @param chanceDeCritico the chanceDeCritico to set
     */
    public void setChanceDeCritico(int chanceDeCritico) {
        this.chanceDeCritico = chanceDeCritico;
    }
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
    private int id;
    private String nome;
    private String tipoDeDano;
    private String tamanho;
    private String alcance;
    private int preco;
    private String dano;
    private int peso;
    private int chanceDeCritico;

    
    
}
