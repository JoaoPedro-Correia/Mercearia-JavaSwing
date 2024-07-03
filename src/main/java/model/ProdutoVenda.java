/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionId;

/**
 *
 * @author correia
 */
@Entity
@Table(name = "produto_venda", schema = "mercearia")
public class ProdutoVenda implements Serializable {
    @EmbeddedId
    private ProdutoVendaPK produtovenda;

    public ProdutoVenda() {
    }
    
    private Integer qntd;
    
    @Column(precision = 2)
    private Double valor;

    public ProdutoVenda(Integer qntd, Double valor, Produto prod, Venda vend) {
        this.produtovenda = new ProdutoVendaPK(prod, vend);
        this.qntd = qntd;
        this.valor = valor;
    }

    public ProdutoVendaPK getProdutovenda() {
        return produtovenda;
    }

    public Integer getQntd() {
        return qntd;
    }

    public Double getValor() {
        return valor;
    }

    public void setProdutovenda(ProdutoVendaPK produtovenda) {
        this.produtovenda = produtovenda;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
