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
public class Classe {

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
     * @return the dado_de_vida
     */
    public String getDado_de_vida() {
        return dado_de_vida;
    }

    /**
     * @param dado_de_vida the dado_de_vida to set
     */
    public void setDado_de_vida(String dado_de_vida) {
        this.dado_de_vida = dado_de_vida;
    }
     private int id; 
     private String nome;
     private String dado_de_vida;
}
