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
import modelo.VinilVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Natan Fraga 
 * @since 15:02 - 09/07/2018
 * @version Vinil II
 */
public class VinilDAO {
    
    public void cadastrarVinil(VinilVO vVO) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "insert into vinil(idvinil, nome, descricao, preco, genero, gravadora)"
                    +"values(null,'"+vVO.getNome()+"','"+vVO.getDescricao()+"',"+vVO.getPreco()+",'"+vVO.getGenero()+"','"+vVO.getGravadora()+"')";
            
            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir dados no Banco de Dados "+se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método cadastrarVinil
    
    public ArrayList<VinilVO> buscarVinis() throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from vinil";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<VinilVO> vinis = new ArrayList<>();
            
            while (rs.next()) {
                VinilVO vVO = new VinilVO();
                
                vVO.setIdVinil(rs.getLong("idvinil"));
                vVO.setNome(rs.getString("nome"));
                vVO.setDescricao(rs.getString("descricao"));
                vVO.setPreco(rs.getDouble("preco"));
                vVO.setGenero(rs.getString("genero"));
                vVO.setGravadora(rs.getString("gravadora"));
                vinis.add(vVO);
            }//fecha while
            
            return vinis;
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! "+se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método buscarVinis
    
    public ArrayList<VinilVO> filtrarVinis(String query) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            sql = "select * from vinil "+query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<VinilVO> vinil = new ArrayList<>();
            
            while (rs.next()){
                
                VinilVO v = new VinilVO();
                
                v.setIdVinil(rs.getLong("idvinil"));
                v.setNome(rs.getString("nome"));
                v.setDescricao(rs.getString("descricao"));
                v.setPreco(rs.getDouble("preco"));
                v.setGenero(rs.getString("genero"));
                v.setGravadora(rs.getString("gravadora"));
                
                vinil.add(v);
            }//fecha while
            
            return vinil;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Vinis! "+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally 
    }//fecha método filtrarVinis
    
    public void deletarVinil(long id) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql="delete from vinil where idvinil="+id;
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar! "+e.getMessage());
        } finally {
            
        }//fecha finally
        
    }//fecha deletarVinil
    
    public void alterarVinil(VinilVO vVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update vinil set "
                    + "nome='" + vVO.getNome() + "', descricao='" + vVO.getDescricao() + "', preco=" + vVO.getPreco() + ", genero='" + vVO.getGenero() + "', gravadora='" + vVO.getGravadora() + "'"
                    + "where idvinil=" + vVO.getIdVinil()+ "";

            stat.executeUpdate(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar "
                    + "vinil! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha alterarVinil
}//fecha classe VinilDAO
