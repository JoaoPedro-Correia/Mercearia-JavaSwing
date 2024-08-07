/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewer;

import javax.swing.JOptionPane;
import control.GUIManager;
import java.util.List;
import model.Cliente;
import model.Produto;
import model.Venda;
import org.hibernate.hql.internal.ast.QuerySyntaxException;

/**
 *
 * @author correia
 */
public class JFrMenuInicial extends javax.swing.JFrame {
    private Cliente semCadastro=null;
    /**
     * Creates new form MenuInicial
     */
    public JFrMenuInicial() {
        this.setSize(520,800);
        this.setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoVendas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoEstoque = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botaoCaixa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoCliente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        relatorioVendas1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        relatorioVendas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        botaoVendas.setBackground(new java.awt.Color(204, 204, 204));
        botaoVendas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVendasMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buy-50.png"))); // NOI18N
        jLabel1.setText("Vendas");

        javax.swing.GroupLayout botaoVendasLayout = new javax.swing.GroupLayout(botaoVendas);
        botaoVendas.setLayout(botaoVendasLayout);
        botaoVendasLayout.setHorizontalGroup(
            botaoVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoVendasLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botaoVendasLayout.setVerticalGroup(
            botaoVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        botaoEstoque.setBackground(new java.awt.Color(204, 204, 204));
        botaoEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEstoqueMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stock-50.png"))); // NOI18N
        jLabel2.setText("Estoque");

        javax.swing.GroupLayout botaoEstoqueLayout = new javax.swing.GroupLayout(botaoEstoque);
        botaoEstoque.setLayout(botaoEstoqueLayout);
        botaoEstoqueLayout.setHorizontalGroup(
            botaoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoEstoqueLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botaoEstoqueLayout.setVerticalGroup(
            botaoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        botaoCaixa.setBackground(new java.awt.Color(204, 204, 204));
        botaoCaixa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCaixaMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cash-register-50.png"))); // NOI18N
        jLabel3.setText("Caixa");

        javax.swing.GroupLayout botaoCaixaLayout = new javax.swing.GroupLayout(botaoCaixa);
        botaoCaixa.setLayout(botaoCaixaLayout);
        botaoCaixaLayout.setHorizontalGroup(
            botaoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoCaixaLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );
        botaoCaixaLayout.setVerticalGroup(
            botaoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoCaixaLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        botaoCliente.setBackground(new java.awt.Color(204, 204, 204));
        botaoCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoClienteMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/client-50.png"))); // NOI18N
        jLabel4.setText("Cliente");

        javax.swing.GroupLayout botaoClienteLayout = new javax.swing.GroupLayout(botaoCliente);
        botaoCliente.setLayout(botaoClienteLayout);
        botaoClienteLayout.setHorizontalGroup(
            botaoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoClienteLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botaoClienteLayout.setVerticalGroup(
            botaoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botaoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(51, 102, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NEW STORE!.png"))); // NOI18N

        botaoSair.setBackground(new java.awt.Color(255, 51, 51));
        botaoSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-x-15.png"))); // NOI18N

        javax.swing.GroupLayout botaoSairLayout = new javax.swing.GroupLayout(botaoSair);
        botaoSair.setLayout(botaoSairLayout);
        botaoSairLayout.setHorizontalGroup(
            botaoSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        botaoSairLayout.setVerticalGroup(
            botaoSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        relatorioVendas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-report-50.png"))); // NOI18N
        relatorioVendas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(relatorioVendas1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(relatorioVendas1))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        relatorioVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-report-50.png"))); // NOI18N
        relatorioVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        relatorioVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioVendasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(relatorioVendas)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(relatorioVendas))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVendasMouseClicked
        // TODO add your handling code here:
        if(DlCaixa.getCaixa()!=null){
            GUIManager.getInstance().openWindowVendas();
        }else{
            JOptionPane.showMessageDialog(this, "Você precisa abrir o caixa antes de realizar alguma venda!");
            GUIManager.getInstance().openWindowCaixa();
        }

    }//GEN-LAST:event_botaoVendasMouseClicked

    private void botaoEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEstoqueMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowEstoque();
    }//GEN-LAST:event_botaoEstoqueMouseClicked

    private void botaoCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCaixaMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowCaixa();
    }//GEN-LAST:event_botaoCaixaMouseClicked

    private void botaoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoClienteMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowCliente();
    }//GEN-LAST:event_botaoClienteMouseClicked

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botaoSairMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        criarClienteSemCadastro();
        criarPagamentos();
    }//GEN-LAST:event_formWindowOpened

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        List<Produto> list = GUIManager.getInstance().getDomainManager().pesquisarProduto();
        GUIManager.getInstance().getReportManager().relComLista(list, "Estoque.jasper");
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void relatorioVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioVendasMouseClicked
        List<Venda> list = GUIManager.getInstance().getDomainManager().pesquisarVenda();
        GUIManager.getInstance().getReportManager().relComLista(list, "Venda.jasper");
    }//GEN-LAST:event_relatorioVendasMouseClicked

    private void criarClienteSemCadastro(){
        try{
            List<String> mestre = GUIManager.getInstance().getDomainManager().minhaQuery("FROM Cliente WHERE NOME='Sem Cadastro'");
            if(mestre.isEmpty()){
                 this.semCadastro = GUIManager.getInstance().getDomainManager().inserirCliente("Sem Cadastro", "e@e", 'O');
            }
        }catch(QuerySyntaxException ex){
            JOptionPane.showMessageDialog(this, "Erro de Querry: "+ex);
        }
    }
    
    private void criarPagamentos(){
        List pagamentos = GUIManager.getInstance().getDomainManager().minhaQuery("FROM Pagamento");
        if(pagamentos.isEmpty()){
            GUIManager.getInstance().getDomainManager().inserirPagamento("PIX");
            GUIManager.getInstance().getDomainManager().inserirPagamento("Credito");
            GUIManager.getInstance().getDomainManager().inserirPagamento("Debito");
            GUIManager.getInstance().getDomainManager().inserirPagamento("Dinheiro");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botaoCaixa;
    private javax.swing.JPanel botaoCliente;
    private javax.swing.JPanel botaoEstoque;
    private javax.swing.JPanel botaoSair;
    private javax.swing.JPanel botaoVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel relatorioVendas;
    private javax.swing.JLabel relatorioVendas1;
    // End of variables declaration//GEN-END:variables
}
