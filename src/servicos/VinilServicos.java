/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.VinilDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.VinilVO;

/**
 *
 * @author Natan Fraga 
 * @since 16:15 - 09/07/2018
 * @version Vinil II
 */
public class VinilServicos {
    
    public void cadastrarVinil(VinilVO vVO) throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        vDAO.cadastrarVinil(vVO);
    }// fecha método cadastrarVinil
    
    public ArrayList<VinilVO> buscarVinis() throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        return vDAO.buscarVinis();
    }//fecha método buscarVinis
    
    public ArrayList<VinilVO> filtrar(String query) throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        return vDAO.filtrarVinis(query);
    }//fecha método filtrar
    
    public void deletarVinil(long id) throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        vDAO.deletarVinil(id);
    }//fecha método deletarVinil
    
    public void alterarVinil(VinilVO vVO) throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        vDAO.alterarVinil(vVO);
    }//fecha método alterarVinil
}//fecha classe VinilServicos
