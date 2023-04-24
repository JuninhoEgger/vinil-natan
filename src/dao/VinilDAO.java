/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import modelo.VinilVO;
import persistencia.MockDatabase;

/**
 *
 * @author Natan Fraga
 * @since 15:02 - 09/07/2018
 * @version Vinil II
 */
public class VinilDAO {

    private final MockDatabase bancoSimulado = new MockDatabase();

    public void cadastrarVinil(VinilVO vVO) throws SQLException {
        vVO.setIdVinil(bancoSimulado.getVinis().size() + 1);
        bancoSimulado.getVinis().add(vVO);
    }

    public List<VinilVO> buscarVinis() throws SQLException {
        return bancoSimulado.getVinis();
    }

    public List<VinilVO> filtrarVinis(long id) throws SQLException {
        return bancoSimulado.getVinis()
                .stream()
                .filter(vinil -> vinil.getIdVinil() == id)
                .collect(Collectors.toList());
    }

    public void deletarVinil(long id) throws SQLException {
        bancoSimulado.getVinis().remove(buscarVinilPorId(id));
    }

    public void alterarVinil(VinilVO vVO) throws SQLException {
        VinilVO vinilEncontrado = buscarVinilPorId(vVO.getIdVinil());
        
        vinilEncontrado.setDescricao(vVO.getDescricao());
        vinilEncontrado.setGenero(vVO.getGenero());
        vinilEncontrado.setGravadora(vVO.getGravadora());
        vinilEncontrado.setNome(vVO.getNome());
        vinilEncontrado.setPreco(vVO.getPreco());
        
        bancoSimulado.getVinis().add(vinilEncontrado);
    }

    private VinilVO buscarVinilPorId(long id) {
        return bancoSimulado.getVinis().stream().filter(vinil -> vinil.getIdVinil() == id).findFirst().orElse(null);
    }
}
