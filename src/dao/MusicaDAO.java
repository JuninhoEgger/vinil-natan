/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.MusicaVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Natan Fraga 
 * @since 15:02 - 09/07/2018
 * @version Vinil II
 */
public class MusicaDAO {
        public void cadastrarMusica(MusicaVO mVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql; 
            
            sql = "insert into musica(idmusica, nome, duracao, compositor, instrumentos, popularidade)"
                    +"values(null,'"+mVO.getNome()+"',"+mVO.getDuracao()+",'"+mVO.getCompositor()+"','"+mVO.getInstrumentos()+"',"+mVO.getPopularidade()+")";
            
            stat.execute(sql);
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar a música! "+se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método cadastrarMusica
        
    public ArrayList<MusicaVO> buscarMusicas() throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from musica";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<MusicaVO> musicas = new ArrayList<>();
            
            while (rs.next()) {
                MusicaVO mVO = new MusicaVO();
                
                mVO.setIdMusica(rs.getLong("idmusica"));
                mVO.setNome(rs.getString("nome"));
                mVO.setDuracao(rs.getDouble("duracao"));
                mVO.setCompositor(rs.getString("compositor"));
                mVO.setInstrumentos(rs.getString("instrumentos"));
                mVO.setPopularidade(rs.getInt("popularidade"));
                musicas.add(mVO);
            }//fecha while
            
            return musicas;
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! "+se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método buscarMusicas  
    
    public ArrayList<MusicaVO> filtrarMusicas(String query) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from musica "+query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<MusicaVO> musica = new ArrayList<>();
            
            while (rs.next()){
                
                MusicaVO m = new MusicaVO();
                
                m.setIdMusica(rs.getLong("idmusica"));
                m.setNome(rs.getString("nome"));
                m.setDuracao(rs.getDouble("duracao"));
                m.setCompositor(rs.getString("compositor"));
                m.setInstrumentos(rs.getString("instrumentos"));
                m.setPopularidade(rs.getInt("popularidade"));
                
                musica.add(m);
            }//fecha while
            
            return musica;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Vinis! "+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally 
    }//fecha método filtrarMusicas
    
    public void deletarMusica(long id) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql="delete from musica where idmusica="+id;
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar! "+e.getMessage());
        } finally {
            
        }//fecha finally
    }//fecha deletarMusica
    
    public void alterarMusica(MusicaVO mVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update musica set "
                    + "nome='" + mVO.getNome() + "', duracao=" + mVO.getDuracao()+ ", compositor='" + mVO.getCompositor() + "', instrumentos='" + mVO.getInstrumentos() + "', popularidade='" + mVO.getPopularidade() + "'"
                    + "where idmusica=" + mVO.getIdMusica() + "";

            stat.executeUpdate(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar "
                    + "musica! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha alterarMusica
}//fecha classe MusicaDAO
