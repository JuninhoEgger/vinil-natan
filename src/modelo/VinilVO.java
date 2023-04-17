/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Natan Fraga
 * @since 22:18 - 08/07/2018
 * @version Vinil II
 */
public class VinilVO {
    private long idVinil;
    private String nome;
    private String descricao;
    private double preco;
    private String genero;
    private String gravadora;

    public VinilVO() {
    }
    /**
     * 
     * @param idVinil recebe o id do Vinil
     * @param nome recebe o nome do Vinil
     * @param descricao recebe a descrição do Vinil
     * @param preco recebe o preço do Vinil
     * @param genero recebe o gênero do Vinil
     * @param gravadora recebe a gravadora do Vinil
     */
    public VinilVO(long idVinil, String nome, String descricao, double preco, String genero, String gravadora) {
        this.idVinil = idVinil;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.genero = genero;
        this.gravadora = gravadora;
    }

    public long getIdVinil() {
        return idVinil;
    }

    public void setIdVinil(long idVinil) {
        this.idVinil = idVinil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return idVinil + " - " + nome + " /Gênero: "+ genero ;
    }
    
}//fecha classe VinilVO
