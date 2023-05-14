package persistencia;

import java.util.ArrayList;
import java.util.List;
import modelo.MusicaVO;
import modelo.VinilVO;

public class MockDatabase {

    private final List<VinilVO> vinis;
    private final List<MusicaVO> musicas;

    public MockDatabase() {
        this.vinis = new ArrayList<>();
        this.musicas = new ArrayList<>();
    }

    public List<VinilVO> getVinis() {
        return vinis;
    }
    
    public List<MusicaVO> getMusicas() {
        return musicas;
    }
    
    public void cadastrarMusica(MusicaVO musica) {
        musicas.add(musica);
    }

    public void cadastrarVinil(VinilVO vinil) {
        vinis.add(vinil);
    }

    public List<VinilVO> buscarVinis() {
        return vinis;
    }
    
    public List<MusicaVO> buscarMusicas() {
        return musicas;
    }
    
    public MusicaVO buscaMusicaPorId(long id){
        return musicas
                .stream()
                .filter(musica -> musica.getIdMusica() == id)
                .findFirst()
                .orElse(null);
    }

    public VinilVO buscarPorId(long id) {
        return vinis.
                stream()
                .filter(vinil -> vinil.getIdVinil() == id)
                .findFirst()
                .orElse(null);
    }
    
    public void deletarMusica(long id) {
        musicas.remove(buscaMusicaPorId(id));
    }

    public void deletarVinil(long id) {
        vinis.remove(buscarPorId(id));
    }
    
    public void alterarMusica(MusicaVO musica){
      MusicaVO musicaEncontrada = buscaMusicaPorId(musica.getIdMusica());
      musicas.add(musicaEncontrada);
    }

    public void alterarVinil(VinilVO vinil) {
        VinilVO vinilEncontrado = buscarPorId(vinil.getIdVinil());

        vinis.add(vinilEncontrado);
    }

}
