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
public class MusicaVO {
    private long idMusica;
    private String nome;
    private double duracao;
    private String compositor;
    private String instrumentos;
    private int popularidade;
    
    private VinilVO v;

    public MusicaVO() {
    }
    /**
     * 
     * @param idMusica recebe o id da música 
     * @param nome recebe o nome da música 
     * @param duracao recebe a duracao da musica 
     * @param compositor recebe o compositor da musica
     * @param instrumentos recebe os instrumentos da musica
     * @param popularidade recebe a popularidade da musica 
     */
    public MusicaVO(long idMusica, String nome, double duracao, String compositor, String instrumentos, int popularidade) {
        this.idMusica = idMusica;
        this.nome = nome;
        this.duracao = duracao;
        this.compositor = compositor;
        this.instrumentos = instrumentos;
        this.popularidade = popularidade;
    }

    public long getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(long idMusica) {
        this.idMusica = idMusica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String instrumentos) {
        this.instrumentos = instrumentos;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public VinilVO getV() {
        return v;
    }

    public void setV(VinilVO v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MusicaVO{" + "idMusica=" + idMusica + ", nome=" + nome + ", duracao=" + duracao + ", compositor=" + compositor + ", instrumentos=" + instrumentos + ", popularidade=" + popularidade + '}';
    }    
    
}//fecha classe MusicaVO
