/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MusicaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MusicaVO;

/**
 *
 * @author Natan Fraga 
 * @since 16:24 - 09/07/2018
 * @version Vinil II
 */
public class MusicaServicos {
    
    public void cadastrarMusica(MusicaVO mVO) throws SQLException{
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        mDAO.cadastrarMusica(mVO);
    }//fecha método cadastrarMusica
    
    public ArrayList<MusicaVO> buscarMusicas() throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        return mDAO.buscarMusicas();
    }//fecha método buscarMusicas
    
    public ArrayList<MusicaVO> filtrar(String query) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        return mDAO.filtrarMusicas(query);
    }//fecha método filtrar
    
    public void deletarMusica(long id) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        mDAO.deletarMusica(id);
    }//fecha método deletarMusica
    
    public void alterarMusica(MusicaVO mVO) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        mDAO.alterarMusica(mVO);
    }//fecha método alterarMusica
}//fecha classe MusicaServicos
