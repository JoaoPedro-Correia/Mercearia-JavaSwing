/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author correia
 */
@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_caixa")
    private Caixa id_caixa;
    
    @ManyToOne
    @JoinColumn (name = "id_pagamento")
    private Pagamento id_pagamento;
     
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente id_cliente;
    
    @OneToMany (mappedBy = "produtovenda.venda", fetch = FetchType.LAZY)
    private List<ProdutoVenda> produtoVenda;

    public Venda() {
    }

    public Venda(Integer id, Caixa id_caixa, Pagamento id_pagamento, Cliente id_cliente) {
        this.id = id;
        this.id_caixa = id_caixa;
        this.id_pagamento = id_pagamento;
        this.id_cliente = id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    
    public void setId_caixa(Caixa id_caixa) {
        this.id_caixa = id_caixa;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPagamento(Pagamento pagamento) {
        this.id_pagamento = pagamento;
    }


    public Integer getId() {
        return id;
    }

    public Caixa getId_caixa() {
        return id_caixa;
    }

    public Pagamento getPagamento() {
        return id_pagamento;
    }
    
}
