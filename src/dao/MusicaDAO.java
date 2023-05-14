package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import modelo.MusicaVO;
import persistencia.MockDatabase;

public class MusicaDAO {
    
    private final MockDatabase bancoSimulado = new MockDatabase();
    
    public void cadastrarMusica(MusicaVO musica) throws SQLException {
        musica.setIdMusica(bancoSimulado.getMusicas().size() + 1);
        bancoSimulado.getMusicas().add(musica);
    }

    public List<MusicaVO> buscarMusicas() throws SQLException {
        return bancoSimulado.getMusicas();
    }

    public List<MusicaVO> filtrarMusicas(long id) throws SQLException {
        return bancoSimulado.getMusicas()
                .stream()
                .filter(musica -> musica.getIdMusica()== id)
                .collect(Collectors.toList());
    }

    public void deletarMusica(long id) throws SQLException {
        bancoSimulado.getMusicas().remove(buscarMusicaPorId(id));
    }

    public void alterarMusica(MusicaVO musica) throws SQLException {
        MusicaVO musicaEncontrada = buscarMusicaPorId(musica.getIdMusica());
        
        musicaEncontrada.setNome(musica.getNome());
        musicaEncontrada.setDuracao(musica.getDuracao());
        musicaEncontrada.setCompositor(musica.getCompositor());
        musicaEncontrada.setInstrumentos(musica.getInstrumentos());
        musicaEncontrada.setPopularidade(musica.getPopularidade());
        musicaEncontrada.setV(musica.getV());
        
        bancoSimulado.getMusicas().add(musicaEncontrada);
    }

    private MusicaVO buscarMusicaPorId(long id) {
        return bancoSimulado.getMusicas().stream().filter(musica -> musica.getIdMusica()== id).findFirst().orElse(null);
    }

}
