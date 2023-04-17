package persistencia;

import java.util.ArrayList;
import java.util.List;
import modelo.VinilVO;

public class MockDatabase {

    private final List<VinilVO> vinis;

    public MockDatabase() {
        this.vinis = new ArrayList<>();
    }

    public List<VinilVO> getVinis() {
        return vinis;
    }

    //Métodos que simulam interação com banco de dados
    public void cadastrarVinil(VinilVO vinil) {
        vinis.add(vinil);
    }

    public List<VinilVO> buscarVinis() {
        return vinis;
    }

    public VinilVO buscarPorId(long id) {
        return vinis.
                stream()
                .filter(vinil -> vinil.getIdVinil() == id)
                .findFirst()
                .orElse(null);
    }

    public void deletarVinil(long id) {
        vinis.remove(buscarPorId(id));
    }

    public void alterarVinil(VinilVO vinil) {
        VinilVO vinilEncontrado = buscarPorId(vinil.getIdVinil());

        vinis.add(vinilEncontrado);
    }

}
