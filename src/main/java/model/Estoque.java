/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author correia
 */
@Entity
public class Estoque implements Serializable {
    @EmbeddedId
    private EstoquePK estoque;
    
    private Integer qntd;
    
    @Temporal(TemporalType.DATE)
    private Date data_comp;

    public Estoque() {
    }

    public Estoque(Integer qntd, Date data_comp, Fornecedor forn, Produto prod) {
        this.estoque = new EstoquePK(prod, forn);
        this.qntd = qntd;
        this.data_comp = data_comp;
    }

    public void setEstoque(EstoquePK estoque) {
        this.estoque = estoque;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public void setData_comp(Date data_comp) {
        this.data_comp = data_comp;
    }

    public EstoquePK getEstoque() {
        return estoque;
    }

    public Integer getQntd() {
        return qntd;
    }

    public Date getData_comp() {
        return data_comp;
    }
}
