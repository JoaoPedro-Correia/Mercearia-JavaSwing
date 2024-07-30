/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Dialog;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.postgresql.util.PSQLException;
import viewer.*;

/**
 *
 * @author correia
 */
public class GUIManager {
  private DlCaixa dlCaixa = null;
  private DlCliente dlCliente = null;
  private DlEstoque dlEstoque = null;
  private DlFornecedor dlFornecedor = null;
  private DlNotaFiscal dlNotaFiscal = null;
  private DlPedido dlPedido = null;
  private DlCategoria dlCategoria=null;
  private DlProduto dlProduto = null;
  private DlVendas dlVendas = null;
  private JFrMenuInicial jfMenu = null; 
  
  private DomainManager doManager;

  private static final GUIManager instance = new GUIManager();

  private GUIManager() {
      try { 
          doManager = new DomainManager();
      } catch (ClassNotFoundException | HibernateException | PSQLException ex) {
          JOptionPane.showMessageDialog(jfMenu, ex);
      }
  }

  public static GUIManager getInstance() {
    return instance;
  }
  
    // OPEN JDIALOG WINDOW
  private JDialog openWindow(java.awt.Frame parent, JDialog dlg, Class classe) {
    if (dlg == null) {
      try {
        dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
      } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
          | IllegalArgumentException | InvocationTargetException ex) {
        JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
      }
    }
    //parent.setVisible(false);
    dlg.setVisible(true);
    dlg.setLocation(100, 100);
    return dlg;
  }
  public DomainManager getDomainManager() {
    return doManager;       
  }

  public void openWindowCaixa() {
    dlCaixa = (DlCaixa) openWindow(jfMenu, dlCaixa, DlCaixa.class);
  }

  public void openWindowCliente() {
    dlCliente = (DlCliente) openWindow(jfMenu, dlCliente, DlCliente.class);
  }

  public void openWindowCategoria() {
    dlCategoria = (DlCategoria) openWindow(jfMenu, dlCategoria, DlCategoria.class);
  }
  
  public void openWindowEstoque() {
    dlEstoque = (DlEstoque) openWindow(jfMenu, dlEstoque, DlEstoque.class);
  }

  public void openWindowFornecedor() {
    dlFornecedor = (DlFornecedor) openWindow(jfMenu, dlFornecedor, DlFornecedor.class);
  }

  public void openWindowNotaFiscal() {
    dlNotaFiscal = (DlNotaFiscal) openWindow(jfMenu, dlNotaFiscal, DlNotaFiscal.class);
  }

  public void openWindowPedido() {
    dlPedido = (DlPedido) openWindow(jfMenu, dlPedido, DlPedido.class);
  }

  public void openWindowProduto() {
    dlProduto = (DlProduto) openWindow(jfMenu, dlProduto, DlProduto.class);
  }

  public void openWindowVendas() {
    dlVendas = (DlVendas) openWindow(jfMenu, dlVendas, DlVendas.class);
  }

  public void openWindowStartMenu() {
    if (jfMenu == null) {
      jfMenu = new JFrMenuInicial();
    }
    jfMenu.setVisible(true);
    jfMenu.setLocation(100, 100);
  }
  
    public void carregarCombo(JComboBox combo, Class classe) {
        try {
            List lista = GUIManager.getInstance().getDomainManager().listar(classe);
            combo.setModel( new DefaultComboBoxModel(lista.toArray() ) );
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(jfMenu, "Erro ao carregar combo CIDADE. " + ex.getMessage() );
        }
        
    }
  

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(JFrMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
      // </editor-fold>
      // </editor-fold>
      
    // </editor-fold>
    // </editor-fold>

    
    /**
     * CONFIGURACAO DA JANELA
     */
    
    // ABRIR JANELA PRINCIPAL
    GUIManager.getInstance().openWindowStartMenu();
  }
}
