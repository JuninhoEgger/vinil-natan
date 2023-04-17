/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.MusicaVO;
import servicos.MusicaServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Natan Fraga
 * @since 19:33 - 10/07/2018
 */
public class GuiManutencaoMusica extends javax.swing.JInternalFrame {
    DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome", "Duração", "Compositor", "Instrumentos", "Popularidade"});
    /**
     * Creates new form GuiManutencaoMusica2
     */
    public GuiManutencaoMusica() {
        initComponents();
        buscarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jcomboFiltro = new javax.swing.JComboBox<>();
        jtPesquisa = new javax.swing.JTextField();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbBuscar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane14 = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlDuracao = new javax.swing.JLabel();
        jlCompositor = new javax.swing.JLabel();
        jbConfirmarAlteracao = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtDuracao = new javax.swing.JTextField();
        jtCompositor = new javax.swing.JTextField();
        jtInstrumentos = new javax.swing.JTextField();
        jtPopularidade = new javax.swing.JTextField();
        jlInstrumentos = new javax.swing.JLabel();
        jlPopularidade = new javax.swing.JLabel();
        jlpDados = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableMusicas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção da MÚSICA");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jcomboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Código", "Duração ", "Compositor", "Instrumentos", "Popularidade" }));
        jcomboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboFiltroItemStateChanged(evt);
            }
        });

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jcomboFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jcomboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpAcoes.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jbLimpar)
                    .addComponent(jbDeletar)
                    .addComponent(jbAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jlCodigo.setText("Código");
        jLayeredPane14.add(jlCodigo);
        jlCodigo.setBounds(20, 30, 70, 14);

        jlNome.setText("Nome");
        jLayeredPane14.add(jlNome);
        jlNome.setBounds(20, 70, 70, 14);

        jlDuracao.setText("Duração");
        jLayeredPane14.add(jlDuracao);
        jlDuracao.setBounds(20, 110, 70, 14);

        jlCompositor.setText("Compositor");
        jLayeredPane14.add(jlCompositor);
        jlCompositor.setBounds(20, 150, 70, 14);

        jbConfirmarAlteracao.setText("Confirmar alteração");
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jLayeredPane14.add(jbConfirmarAlteracao);
        jbConfirmarAlteracao.setBounds(390, 120, 160, 30);

        jtCodigo.setEnabled(false);
        jLayeredPane14.add(jtCodigo);
        jtCodigo.setBounds(110, 20, 210, 30);
        jLayeredPane14.add(jtNome);
        jtNome.setBounds(110, 60, 210, 30);
        jLayeredPane14.add(jtDuracao);
        jtDuracao.setBounds(110, 100, 210, 30);
        jLayeredPane14.add(jtCompositor);
        jtCompositor.setBounds(110, 140, 210, 30);
        jLayeredPane14.add(jtInstrumentos);
        jtInstrumentos.setBounds(110, 180, 210, 30);
        jLayeredPane14.add(jtPopularidade);
        jtPopularidade.setBounds(110, 220, 210, 30);

        jlInstrumentos.setText("Instrumentos");
        jLayeredPane14.add(jlInstrumentos);
        jlInstrumentos.setBounds(20, 190, 70, 14);

        jlPopularidade.setText("Popularidade");
        jLayeredPane14.add(jlPopularidade);
        jlPopularidade.setBounds(20, 230, 80, 14);

        jlpDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jtableMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Duração", "Compositor", "Instrumentos", "Popularidade"
            }
        ));
        jtableMusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMusicasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableMusicas);

        jlpDados.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlpAcoes)
                    .addComponent(jLayeredPane14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpDados))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void buscarTabela() {
        try {
            ArrayList<MusicaVO> musicas = new ArrayList<>();
            MusicaServicos ms = ServicosFactory.getMusicaServicos();
            musicas = ms.buscarMusicas();
            
            limparTabela();
            
            for (int i = 0; i < musicas.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(musicas.get(i).getIdMusica()),
                    String.valueOf(musicas.get(i).getNome()),
                    String.valueOf(musicas.get(i).getDuracao()),
                    String.valueOf(musicas.get(i).getCompositor()),
                    String.valueOf(musicas.get(i).getInstrumentos()),
                    String.valueOf(musicas.get(i).getPopularidade())});
            }
            jtableMusicas.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERRO NO SISTEMA! "+e.getMessage());
        }
    }//fecha buscarTabela
    
    private void limparTabela(){
        dtm.setNumRows(0);
    }//fecha limparTabela
    
    private void deletar(){
        try {
            int linha = jtableMusicas.getSelectedRow();
            
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Selecione uma linha! ");
            } else {
                String id = jtableMusicas.getValueAt(linha, 0).toString();
                MusicaServicos ms = ServicosFactory.getMusicaServicos();
                ms.deletarMusica(Long.parseLong(id));
                
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Produto excluído com sucesso! ");
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "ERRO NO SISTEMA "+e.getMessage());
        }//fecha catch
    }//fecha deletar
        
    private void filtrar(){
        try {
            if (jtPesquisa.getText().isEmpty()) {
                limparTabela();
                buscarTabela();
            } else {
                String query = "";
                String filtro = jcomboFiltro.getSelectedItem().toString();
                
                if (filtro.equalsIgnoreCase("Código")) {
                    query="where idmusica like '%"+jtPesquisa.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Nome")){
                    query="where nome like '%"+jtPesquisa.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Duração")){
                    query="where duracao like '%"+jtPesquisa.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Compositor")){
                    query="where compositor like '%"+jtPesquisa.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Instrumentos")){
                    query="where instrumentos like '%"+jtPesquisa.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Popularidade")){
                    query="where popularidade like '%"+jtPesquisa.getText()+"%'";
                }//fecha if
                
                MusicaServicos ms = ServicosFactory.getMusicaServicos();
                ArrayList<MusicaVO> musica = ms.filtrar(query);
                
                for (int i = 0; i <musica.size(); i++) {
                    dtm.addRow(new String[]{
                    String.valueOf(musica.get(i).getIdMusica()),
                    String.valueOf(musica.get(i).getNome()),
                    String.valueOf(musica.get(i).getDuracao()),
                    String.valueOf(musica.get(i).getCompositor()),
                    String.valueOf(musica.get(i).getInstrumentos()),
                    String.valueOf(musica.get(i).getPopularidade())});
                }//fecha for
                
                jtableMusicas.setModel(dtm);
            }//fecha if
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "ERRO NO SISTEMA"+e.getMessage());
        }//fecha catch
    }//fecha filtrar
    
    private void alterar(){
        int linha = jtableMusicas.getSelectedRow();
        if (linha != -1){
            jtCodigo.setText((String)jtableMusicas.getValueAt(linha, 0));
            jtNome.setText((String)jtableMusicas.getValueAt(linha, 1));
            jtDuracao.setText((String)jtableMusicas.getValueAt(linha, 2));
            jtCompositor.setText((String)jtableMusicas.getValueAt(linha, 3));
            jtInstrumentos.setText((String)jtableMusicas.getValueAt(linha, 4));
            jtPopularidade.setText((String)jtableMusicas.getValueAt(linha, 5));
        } else {
            JOptionPane.showMessageDialog(this, 
              "Você não selecionou nenhuma linha!");
        }//fecha else      
    }//fecha alterar 
    
    private void confirmarAlteracao(){
        try {
        MusicaVO mVO = new MusicaVO();
        
            mVO.setIdMusica(Long.parseLong(jtCodigo.getText()));
            mVO.setNome(jtNome.getText());
            mVO.setDuracao(Double.parseDouble(jtDuracao.getText()));
            mVO.setCompositor(jtCompositor.getText());
            mVO.setInstrumentos(jtInstrumentos.getText());
            mVO.setPopularidade(Integer.parseInt(jtPopularidade.getText()));

            MusicaServicos ms = ServicosFactory.getMusicaServicos();

            ms.alterarMusica(mVO);
            
            JOptionPane.showMessageDialog(this,
                    "Música ALTERADO com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERRO NO SISTEMA! "+e.getMessage());
        }//fecha catch            
    }//fecha confirmarAlteracao 
    
    private void limparCampos(){
        jtCodigo.setText("");
        jtNome.setText("");
        jtDuracao.setText("");
        jtCompositor.setText("");
        jtInstrumentos.setText("");
        jtPopularidade.setText("");
    }//fecha limparCampos
    
    private void jcomboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboFiltroItemStateChanged
        // TODO add your handling code here:
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jcomboFiltroItemStateChanged

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        // TODO add your handling code here:
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        limparTabela();
        buscarTabela();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        deletar();
        limparTabela();
        buscarTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        confirmarAlteracao();
        limparTabela();
        buscarTabela();
        limparCampos();
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jtableMusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMusicasMouseClicked
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jtableMusicasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcomboFiltro;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlCompositor;
    private javax.swing.JLabel jlDuracao;
    private javax.swing.JLabel jlInstrumentos;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPopularidade;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCompositor;
    private javax.swing.JTextField jtDuracao;
    private javax.swing.JTextField jtInstrumentos;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtPopularidade;
    private javax.swing.JTable jtableMusicas;
    // End of variables declaration//GEN-END:variables
}
