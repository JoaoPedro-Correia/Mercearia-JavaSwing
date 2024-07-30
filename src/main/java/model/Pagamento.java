/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author correia
 */
@Entity
public class Pagamento implements Serializable {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
        
    private String descricao;
    
    @OneToMany ( mappedBy = "id_pagamento" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Venda> venda;

    public List<Venda> getVenda() {
        return venda;
    }

    public void setVenda(List<Venda> venda) {
        this.venda = venda;
    }

    public Pagamento() {
    }

    public Pagamento(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Pagamento(String descricao) {
        this.descricao = descricao;
    }
    
    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }   
}
