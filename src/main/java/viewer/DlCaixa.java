/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.FuncoesUteis;
import control.GUIManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Caixa;

/**
 *
 * @author correia
 */
public class DlCaixa extends javax.swing.JDialog {
    private static Caixa caixa;
    /**
     * Creates new form DlCaixa
     */
    public DlCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setSize(374, 348);
        this.setResizable(false);
        initComponents();
        preencherDataAtual();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataAtual = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        caixaInicial = new javax.swing.JTextField();
        valorVendas = new javax.swing.JTextField();
        botaoOk = new javax.swing.JRadioButton();
        retornarMenuInicial = new javax.swing.JLabel();
        caixaFinalAtingido = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setText("Data");

        jLabel2.setText("Caixa Inicial");

        jLabel3.setText("Venda");

        dataAtual.setText("Data Atual");

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Caixa Final");

        botaoOk.setText("Abrir");
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });

        retornarMenuInicial.setIcon(new javax.swing.ImageIcon("/home/correia/NetBeansProjects/Mercearia/src/main/resources/imagens/icons8-home-25.png")); // NOI18N
        retornarMenuInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        retornarMenuInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retornarMenuInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retornarMenuInicialMouseClicked(evt);
            }
        });

        caixaFinalAtingido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaFinalAtingidoActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valorVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(caixaFinalAtingido))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(retornarMenuInicial)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(caixaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoOk)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(retornarMenuInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(caixaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOk))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(caixaFinalAtingido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retornarMenuInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retornarMenuInicialMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowStartMenu();
        this.setVisible(false);
    }//GEN-LAST:event_retornarMenuInicialMouseClicked

    private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed
        // TODO add your handling code here:
        try {
            if(!caixaInicial.getText().isEmpty()){
                botaoOk.setEnabled(false);
                caixaInicial.setEditable(false);
                this.caixa = GUIManager.getInstance().getDomainManager().inserirCaixa(FuncoesUteis.strToDate(dataAtual.getText()), Double.valueOf(caixaInicial.getText()));
            }else{
                botaoOk.setSelected(false);
                JOptionPane.showMessageDialog(this, "Você precisa definir o caixa inicial antes de feicha-lo");
            }
        } catch (ParseException ex) {
            caixaInicial.setEditable(true);
            botaoOk.setEnabled(true);
            botaoOk.setSelected(false);
            JOptionPane.showMessageDialog(this, "Erro ao abrir o Caixa");
        }
    }//GEN-LAST:event_botaoOkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date data;
        if(botaoOk.isSelected()){
            try {
                data = FuncoesUteis.strToDate(dataAtual.getText());
                //caixa inicial
                Double ci = Double.valueOf(caixaInicial.getText());
                //caixa final previsto
                Double venda = Double.valueOf(valorVendas.getText());
                Double cfp = venda+ci;
                //caixa final obtido
                Double cfo = Double.valueOf(caixaFinalAtingido.getText());
                                
                GUIManager.getInstance().getDomainManager().alterarCaixa(this.caixa.getId(), data, ci, cfp, cfo);
                resetWindow();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Erro para armaenar data atual! "+ex);
            }
        }else{
              JOptionPane.showMessageDialog(this, "Você precisa fechar o caixa inicial para feicha-lo");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        preencherDataAtual();
    }//GEN-LAST:event_formWindowGainedFocus

    private void caixaFinalAtingidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaFinalAtingidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaFinalAtingidoActionPerformed

    public static Caixa getCaixa() {
        return caixa;
    }
    
    private void preencherDataAtual(){
        dataAtual.setText(FuncoesUteis.dataAtual());
        dataAtual.setEnabled(false);
    }
    
    private void resetWindow(){
        caixaInicial.setText("");
        caixaInicial.setEditable(true);
        botaoOk.setEnabled(true);
        botaoOk.setSelected(false);
        caixaFinalAtingido.setText("");
        valorVendas.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoOk;
    private javax.swing.JTextField caixaFinalAtingido;
    private javax.swing.JTextField caixaInicial;
    private javax.swing.JTextField dataAtual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel retornarMenuInicial;
    private javax.swing.JTextField valorVendas;
    // End of variables declaration//GEN-END:variables
}
