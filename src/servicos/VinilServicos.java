package servicos;

import dao.DAOFactory;
import dao.VinilDAO;
import java.sql.SQLException;
import java.util.List;
import modelo.VinilVO;

public class VinilServicos {
    
    public void cadastrarVinil(VinilVO vVO) throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        vDAO.cadastrarVinil(vVO);
    }// fecha método cadastrarVinil
    
    public List<VinilVO> buscarVinis() throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        return vDAO.buscarVinis();
    }//fecha método buscarVinis
    
    public List<VinilVO> filtrar(long id) throws SQLException {
        VinilDAO vDAO = DAOFactory.getVinilDAO();
        return vDAO.filtrarVinis(id);
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
