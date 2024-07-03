/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.*;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author correia
 */
@Embeddable
public class EstoquePK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "idproduto")
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(name = "idfornecedor")
    private Fornecedor fornecedor;

    public EstoquePK() {
    }

    public Produto getProduto() {
        return produto;
    }

    public EstoquePK(Produto produto, Fornecedor fornecedor) {
        this.produto = produto;
        this.fornecedor = fornecedor;
    }
                            
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    
}
