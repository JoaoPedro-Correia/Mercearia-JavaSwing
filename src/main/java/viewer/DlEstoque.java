/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import control.EstoqueAbstractTableModel;
import control.GUIManager;
import java.util.List;
import model.Estoque;

/**
 *
 * @author correia
 */
public class DlEstoque extends javax.swing.JDialog {
    private Estoque estoque = null;
    private EstoqueAbstractTableModel estoqueATM;
    /**
     * Creates new form DlEstoque
     */
    public DlEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setSize(757, 621);
        this.setResizable(false);
        initComponents();
        
        estoqueATM = new EstoqueAbstractTableModel();
        tabelaEstoque.setModel(estoqueATM);
        carregarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        retornarMenuInicial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        adicionarPedido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adicionarCategoria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adicionarProduto1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        });

        retornarMenuInicial.setIcon(new javax.swing.ImageIcon("/home/correia/NetBeansProjects/Mercearia/src/main/resources/imagens/icons8-home-25.png")); // NOI18N
        retornarMenuInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        retornarMenuInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retornarMenuInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retornarMenuInicialMouseClicked(evt);
            }
        });

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Foto", "Produto", "Quantidade", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaEstoque.setToolTipText("");
        jScrollPane1.setViewportView(tabelaEstoque);

        adicionarPedido.setBackground(new java.awt.Color(255, 255, 255));
        adicionarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adicionarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarPedidoMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/correia/NetBeansProjects/Mercearia/src/main/resources/imagens/icons8-plus-20.png")); // NOI18N
        jLabel1.setText("Pedido");

        javax.swing.GroupLayout adicionarPedidoLayout = new javax.swing.GroupLayout(adicionarPedido);
        adicionarPedido.setLayout(adicionarPedidoLayout);
        adicionarPedidoLayout.setHorizontalGroup(
            adicionarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adicionarPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        adicionarPedidoLayout.setVerticalGroup(
            adicionarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        adicionarCategoria.setBackground(new java.awt.Color(255, 255, 255));
        adicionarCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adicionarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarCategoriaMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/correia/NetBeansProjects/Mercearia/src/main/resources/imagens/icons8-plus-20.png")); // NOI18N
        jLabel2.setText("Novo Categoria");

        javax.swing.GroupLayout adicionarCategoriaLayout = new javax.swing.GroupLayout(adicionarCategoria);
        adicionarCategoria.setLayout(adicionarCategoriaLayout);
        adicionarCategoriaLayout.setHorizontalGroup(
            adicionarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adicionarCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        adicionarCategoriaLayout.setVerticalGroup(
            adicionarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        adicionarProduto1.setBackground(new java.awt.Color(255, 255, 255));
        adicionarProduto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adicionarProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarProduto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarProduto1MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 255, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon("/home/correia/NetBeansProjects/Mercearia/src/main/resources/imagens/icons8-plus-20.png")); // NOI18N
        jLabel4.setText("Novo Produto");

        javax.swing.GroupLayout adicionarProduto1Layout = new javax.swing.GroupLayout(adicionarProduto1);
        adicionarProduto1.setLayout(adicionarProduto1Layout);
        adicionarProduto1Layout.setHorizontalGroup(
            adicionarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adicionarProduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        adicionarProduto1Layout.setVerticalGroup(
            adicionarProduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Busca");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(retornarMenuInicial)
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adicionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adicionarProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(adicionarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(retornarMenuInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adicionarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adicionarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adicionarProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retornarMenuInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retornarMenuInicialMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowStartMenu();
        this.setVisible(false);
    }//GEN-LAST:event_retornarMenuInicialMouseClicked

    private void adicionarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarCategoriaMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowCategoria();
    }//GEN-LAST:event_adicionarCategoriaMouseClicked

    private void adicionarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarPedidoMouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowPedido();
    }//GEN-LAST:event_adicionarPedidoMouseClicked

    private void adicionarProduto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarProduto1MouseClicked
        // TODO add your handling code here:
        GUIManager.getInstance().openWindowProduto();
    }//GEN-LAST:event_adicionarProduto1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void carregarDados(){
        List<Estoque> list = GUIManager.getInstance().getDomainManager().pesquisarEstoque();
        estoqueATM.adicionar(list);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlEstoque dialog = new DlEstoque(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adicionarCategoria;
    private javax.swing.JPanel adicionarPedido;
    private javax.swing.JPanel adicionarProduto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel retornarMenuInicial;
    private javax.swing.JTable tabelaEstoque;
    // End of variables declaration//GEN-END:variables
}
