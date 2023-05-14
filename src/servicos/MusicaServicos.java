/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MusicaDAO;
import java.sql.SQLException;
import java.util.List;
import modelo.MusicaVO;

public class MusicaServicos {
    
    public void cadastrarMusica(MusicaVO musica) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        mDAO.cadastrarMusica(musica);
    }
    
    public List<MusicaVO> buscarMusicas() throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        return mDAO.buscarMusicas();
    }
    
    public List<MusicaVO> filtrar(long id) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        return mDAO.filtrarMusicas(id);
    }
    
    public void deletarMusica(long id) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        mDAO.deletarMusica(id);
    }
    
    public void alterarMusica(MusicaVO musica) throws SQLException {
        MusicaDAO mDAO = DAOFactory.getMusicaDAO();
        mDAO.alterarMusica(musica);
    }
}
