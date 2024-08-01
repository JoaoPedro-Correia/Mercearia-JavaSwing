/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author correia
 */
@Embeddable
public class EstoquePK implements Serializable {
    @Temporal(TemporalType.DATE)
    private Date data_comp;
    
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

    public EstoquePK(Date data, Produto produto, Fornecedor fornecedor) {
        this.data_comp = data;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }
                            
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getData_comp() {
        return data_comp;
    }

    public void setData_comp(Date data_comp) {
        this.data_comp = data_comp;
    }


    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    
}
