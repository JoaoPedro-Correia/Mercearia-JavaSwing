/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.swing.JOptionPane;
import model.ProdutoVenda;
import model.Venda;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import viewer.DlVendas;

/**
 *
 * @author correia
 */
public class VendaDAO extends GenericDAO {
    public void carregarProdutoVenda(Venda venda) throws HibernateException {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Verifica se a lista JÁ FOI CARREGADA
            if ( !Hibernate.isInitialized( venda.getProdutoVenda() ) ) {
                                
                // Carrega o PROXY para outro objeto
                Venda pedTemp = sessao.get(Venda.class, venda.getId());

                // Carrega a lista de PEDIDOS
                List<ProdutoVenda> lista = pedTemp.getProdutoVenda();
                lista.size();

                // Atualiza a lista no OBJETO principal (parâmetro)
                venda.setProdutoVenda(lista);
            }
            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
}
