/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author correia
 */
@Entity
public class Estoque implements Serializable {
    @EmbeddedId
    private EstoquePK estoque;
    
    private Integer qntd;

    public Estoque() {
    }

    public Estoque(Integer qntd, Date data_comp, Fornecedor forn, Produto prod) {
        this.estoque = new EstoquePK(data_comp, prod, forn);
        this.qntd = qntd;
    }
    
    public void setEstoque(EstoquePK estoque) {
        this.estoque = estoque;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public EstoquePK getEstoque() {
        return estoque;
    }

    public Integer getQntd() {
        return qntd;
    }

}
