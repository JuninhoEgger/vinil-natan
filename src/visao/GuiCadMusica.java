package visao;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.MusicaVO;
import modelo.VinilVO;
import servicos.MusicaServicos;
import servicos.ServicosFactory;
import servicos.VinilServicos;

public class GuiCadMusica extends javax.swing.JInternalFrame {

    public GuiCadMusica() {
        initComponents();
        
        preencherCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlDuracao = new javax.swing.JLabel();
        jlCompositor = new javax.swing.JLabel();
        jlIntrumentos = new javax.swing.JLabel();
        jlPopularidade = new javax.swing.JLabel();
        jlVinil = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtDuracao = new javax.swing.JTextField();
        jtCompositor = new javax.swing.JTextField();
        jtInstrumentos = new javax.swing.JTextField();
        jtPopularidade = new javax.swing.JTextField();
        jcomboVinil = new javax.swing.JComboBox();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de MÚSICA");

        jlpDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jlNome.setText("Nome");

        jlDuracao.setText("Duração");

        jlCompositor.setText("Compositor");

        jlIntrumentos.setText("Instrumentos");

        jlPopularidade.setText("Popularidade (0 a 100)");

        jlVinil.setText("VINIL");

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlDuracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCompositor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlIntrumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlPopularidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlVinil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtDuracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtCompositor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtInstrumentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtPopularidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcomboVinil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlDuracao)
                                    .addComponent(jlNome)
                                    .addComponent(jlCompositor)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlIntrumentos)))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCompositor, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jtInstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jtDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jtNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPopularidade)
                            .addComponent(jlVinil))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcomboVinil, 0, 296, Short.MAX_VALUE)
                            .addComponent(jtPopularidade))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDuracao)
                    .addComponent(jtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCompositor)
                    .addComponent(jtCompositor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIntrumentos)
                    .addComponent(jtInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPopularidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPopularidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboVinil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVinil))
                .addGap(38, 38, 38))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpAcoesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpAcoes)
                    .addComponent(jlpDados))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherCombo(){
        try {
            VinilServicos vs = ServicosFactory.getVinilServicos();
            List<VinilVO> v = vs.buscarVinis();

            for (int i = 0; i < v.size(); i++) {
                jcomboVinil.addItem(v.get(i));
            }//fecha for
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERRO NO SISTEMA"+e.getMessage());
        }//fecha catch
    }//fecha preencherCombo
    
    private void cadastrarMusica(){
        try {
            MusicaVO mVO = new MusicaVO();

            mVO.setNome(jtNome.getText());
            mVO.setDuracao(Double.parseDouble(jtDuracao.getText()));
            mVO.setCompositor(jtCompositor.getText());
            mVO.setInstrumentos(jtInstrumentos.getText());
            mVO.setPopularidade(Integer.parseInt(jtPopularidade.getText()));
            
            mVO.setV((VinilVO)jcomboVinil.getSelectedItem());

            MusicaServicos ms = ServicosFactory.getMusicaServicos();
            ms.cadastrarMusica(mVO);

            JOptionPane.showMessageDialog(this,
                    "Música cadastrada com sucesso!");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "ERRO NO SISTEMA"+e.getMessage());
        }//fecha catch
    }//fecha cadastrarMusica
    
    private void limpar(){
        jtNome.setText("");
        jtDuracao.setText("");
        jtCompositor.setText("");
        jtInstrumentos.setText("");
        jtPopularidade.setText("");
    }//fecha limpar
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarMusica();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox jcomboVinil;
    private javax.swing.JLabel jlCompositor;
    private javax.swing.JLabel jlDuracao;
    private javax.swing.JLabel jlIntrumentos;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPopularidade;
    private javax.swing.JLabel jlVinil;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTextField jtCompositor;
    private javax.swing.JTextField jtDuracao;
    private javax.swing.JTextField jtInstrumentos;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPopularidade;
    // End of variables declaration//GEN-END:variables
}
