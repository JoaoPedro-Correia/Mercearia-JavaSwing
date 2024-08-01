/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Estoque;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author correia
 */
public class EstoqueDAO extends GenericDAO {
    private List<Estoque> pesquisar(int tipo, String pesq) throws HibernateException {            
       List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Estoque.class);
            
            Root tabela = consulta.from(Estoque.class);
            
            // Alterar o fetch LAZY
            tabela.fetch("estoque", JoinType.INNER );
            consulta.distinct(true);
            
            Predicate restricoes = null;
            switch ( tipo ) {  
                case 0: restricoes = builder.like(tabela.get("estoque").get("produto").get("nome_produto"), pesq+"%");
                        break;       
                case 1: restricoes = builder.like(tabela.get("estoque").get("fornecedor").get("nome_social"), pesq+"%");
                        break;
            }
            consulta.where(restricoes);
            // EXECUTAR
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
                                        
    }
  
    public List<Estoque> pesquisarPorProduto(String pesq) {             
        return pesquisar(0,pesq);
    }
    
    public List<Estoque> pesquisarPorFornecedor(String pesq) {             
        return pesquisar(1,pesq);
    }
}
