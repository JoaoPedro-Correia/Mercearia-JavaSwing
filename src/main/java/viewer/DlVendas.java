/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package viewer;

import control.GUIManager;
import control.ProdutoVendaAbstractTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import model.Caixa;
import model.Cliente;
import model.Pagamento;
import model.Produto;
import model.ProdutoVenda;
import model.Venda;

/**
 *
 * @author correia
 */
public class DlVendas extends javax.swing.JDialog {
    private Venda venda=null;
    private Caixa caixa=DlCaixa.getCaixa();
    private ProdutoVendaAbstractTableModel produtoVATM;
    private ProdutoVenda produtoVenda=null;
    
    /** Creates new form DlVendas */
    public DlVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setSize(519, 547);
        this.setResizable(true);
        initComponents();
        
        produtoVATM = new ProdutoVendaAbstractTableModel();
        tabelaVenda.setModel(produtoVATM);
        txtValorTotal.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagamento = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        excluir = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jcbProduto = new javax.swing.JComboBox<>();
        jsQuantidade = new javax.swing.JSpinner();
        retornarMenuInicial = new javax.swing.JLabel();
        jbFinalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jrbDebito = new javax.swing.JRadioButton();
        jrbCredito = new javax.swing.JRadioButton();
        jrbDinheiro = new javax.swing.JRadioButton();
        jrbPix = new javax.swing.JRadioButton();
        jbAdicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        txtValorTotal = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(excluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Produto");

        jLabel2.setText("Quantidade");

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaVenda.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabelaVenda);

        jLabel3.setText("Valor Total");

        jsQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        retornarMenuInicial.setIcon(new javax.swing.ImageIcon("/home/correia/NetBeansProjects/Mercearia/src/main/resources/imagens/icons8-home-25.png")); // NOI18N
        retornarMenuInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        retornarMenuInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retornarMenuInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retornarMenuInicialMouseClicked(evt);
            }
        });

        jbFinalizar.setBackground(new java.awt.Color(255, 255, 204));
        jbFinalizar.setText("Finalizar Compra");
        jbFinalizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });

        jLabel4.setText("Pagamento");

        pagamento.add(jrbDebito);
        jrbDebito.setMnemonic('2');
        jrbDebito.setText("Débito");

        pagamento.add(jrbCredito);
        jrbCredito.setMnemonic('3');
        jrbCredito.setText("Crédito");

        pagamento.add(jrbDinheiro);
        jrbDinheiro.setMnemonic('1');
        jrbDinheiro.setText("Dinheiro");

        pagamento.add(jrbPix);
        jrbPix.setMnemonic('0');
        jrbPix.setText("PIX");

        jbAdicionar.setBackground(new java.awt.Color(153, 255, 153));
        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente");

        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Cadastro" }));

        txtValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValorTotal.setText("0");
        txtValorTotal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jsQuantidade)
                                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbAdicionar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbDinheiro)
                                            .addComponent(jrbPix))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbDebito)
                                            .addComponent(jrbCredito)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(46, 46, 46)))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(retornarMenuInicial)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(retornarMenuInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbDebito)
                            .addComponent(jrbPix))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbDinheiro)
                            .addComponent(jrbCredito)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAdicionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbFinalizar)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retornarMenuInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retornarMenuInicialMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowStartMenu();
        this.setVisible(false);
    }//GEN-LAST:event_retornarMenuInicialMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        carregaDados();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        Produto produto = (Produto) jcbProduto.getSelectedItem();
        Integer quantidade = (Integer) jsQuantidade.getValue();
        
        if(this.produtoVenda==null){
            ProdutoVenda produtoV = GUIManager.getInstance().getDomainManager().inserirProdutoVenda(quantidade, produto, this.venda);
            if(removerDoEstoque(produtoV.getProdutovenda().getProduto(), quantidade)){
                adicionarValorTotal(produtoV);
                produtoVATM.adicionar(produtoV);
                GUIManager.getInstance().getDomainManager().alterarProduto(produtoV.getProdutovenda().getProduto());
            }else{
                JOptionPane.showMessageDialog(this, "Você não produto suficiente no estoque para realizar a venda!");
            }
        }else{
            GUIManager.getInstance().getDomainManager().alterarProdutoVenda(quantidade, produto, this.venda);
            this.produtoVenda=null;
        }
        
        jsQuantidade.setValue(0);
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarNovaVenda();
    }//GEN-LAST:event_formWindowOpened

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
        Cliente cliente = (Cliente) jcbCliente.getSelectedItem();
        int mnemonicBotao = pagamento.getSelection().getMnemonic();
        Pagamento formaPagamento = buscaPagamento(mnemonicBotao);
        
        if(formaPagamento!=null){
            this.venda.setId_cliente(cliente);
            this.venda.setPagamento(formaPagamento);
            GUIManager.getInstance().getDomainManager().alterarVenda(this.venda);
            produtoVATM.removerTudo();
            limparCampos();
            carregarNovaVenda();
        }else{
            JOptionPane.showMessageDialog(this, "Selecione a forma de pagamento para concluir a compra!");   
        }
    }//GEN-LAST:event_jbFinalizarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        int linha = tabelaVenda.getSelectedRow();
        if(linha>=0){
            this.produtoVenda = produtoVATM.getProdutoVenda(linha);
            
            GUIManager.getInstance().getDomainManager().removerProdutoVenda(this.produtoVenda);
            produtoVATM.remover(linha);            
            tabelaVenda.setModel(produtoVATM);
            
            atualizarValorTotal();
            estornoProdutoDoEstoque(this.produtoVenda.getProdutovenda().getProduto(), this.produtoVenda.getQntd());
            
            this.produtoVenda=null;
        }
    }//GEN-LAST:event_excluirActionPerformed

    private Pagamento buscaPagamento(int mnemonic){
        List<Pagamento> pg = GUIManager.getInstance().getDomainManager().pesquisarPagamento();
        
        switch (mnemonic) {
            case 48 -> {
                return pagamentoNaLista(pg, "pix");
            }
            case 49 -> {
                return pagamentoNaLista(pg, "dinheiro");
            }
            case 50 -> {
                return pagamentoNaLista(pg, "debito");
            }
            case 51 -> {
                return pagamentoNaLista(pg, "credito");
            }
            default -> throw new AssertionError();
        }
    }
    
    private Pagamento pagamentoNaLista(List<Pagamento> pagamentos, String tipo){
        for(Pagamento pg : pagamentos){
            if(pg.getDescricao().equalsIgnoreCase(tipo))
                return pg;
        }
        return null;
    }
    
    private void carregarNovaVenda(){
        this.venda=GUIManager.getInstance().getDomainManager().inserirVenda(this.caixa);
    }
    
    private void carregarComboProduto(){
        jcbProduto.removeAll();
        GUIManager.getInstance().carregarCombo(jcbProduto, Produto.class);
    }
    
    private void carregarComboCliente(){
        jcbCliente.removeAll();
        GUIManager.getInstance().carregarCombo(jcbCliente, Cliente.class);
    }    
    
    private void carregaDados(){
        carregarComboProduto();
        carregarComboCliente();
    }
    
    private boolean removerDoEstoque(Produto produto, Integer qntd){
        if(qntd<=produto.getQntd()){
            produto.setQntd(produto.getQntd()-qntd);
            return true;
        }
        return false;
    }
    
    private void estornoProdutoDoEstoque(Produto produto, Integer qntd){
        produto.setQntd(produto.getQntd()+qntd);
        GUIManager.getInstance().getDomainManager().alterarProduto(produto);
    }
    
    private void adicionarValorTotal(ProdutoVenda proV){
        Double val = Double.valueOf(txtValorTotal.getText());
        val+=(proV.getQntd()*proV.getValor());
        txtValorTotal.setText(String.valueOf(val));
    }
    
    private void atualizarValorTotal(){
        Double val = produtoVATM.getValorTotal();
        txtValorTotal.setText(String.valueOf(val));
    }
    
    private void limparCampos(){
        this.jsQuantidade.setValue(0);
        this.txtValorTotal.setText("0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbProduto;
    private javax.swing.JRadioButton jrbCredito;
    private javax.swing.JRadioButton jrbDebito;
    private javax.swing.JRadioButton jrbDinheiro;
    private javax.swing.JRadioButton jrbPix;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.ButtonGroup pagamento;
    private javax.swing.JLabel retornarMenuInicial;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JFormattedTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}