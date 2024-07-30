/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author correia
 */
@Entity
public class Caixa implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(precision = 2)
    private Double caixa_ini;
    
    @Column(precision = 2)    
    private Double caixa_fin;
    
    @Column(precision = 2)
    private Double caixa_fin_previsto;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
     @OneToMany (mappedBy = "id_caixa", fetch = FetchType.LAZY)
    private List<Venda> venda;

    public Caixa(Double caixa_ini, Date data) {
        this.caixa_ini = caixa_ini;
        this.data = data;
    }

    public Caixa(Double caixa_ini, Double caixa_fin, Double caixa_fin_previsto, Date data) {
        this.caixa_ini = caixa_ini;
        this.caixa_fin = caixa_fin;
        this.caixa_fin_previsto = caixa_fin_previsto;
        this.data = data;
    }

    public Caixa(Integer id, Double caixa_ini, Double caixa_fin, Double caixa_fin_previsto, Date data) {
        this.id = id;
        this.caixa_ini = caixa_ini;
        this.caixa_fin = caixa_fin;
        this.caixa_fin_previsto = caixa_fin_previsto;
        this.data = data;
    }

    public Caixa() {
    }

    public Double getCaixa_fin_previsto() {
        return caixa_fin_previsto;
    }

    public Double getCaixa_ini() {
        return caixa_ini;
    }

    public List<Venda> getVenda() {
        return venda;
    }

    public Date getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }

    public Double getCaixa_fin() {
        return caixa_fin;
    }

    public void setCaixa_fin_previsto(Double caixa_fin_previsto) {
        this.caixa_fin_previsto = caixa_fin_previsto;
    }

    public void setCaixa_ini(Double caixa_ini) {
        this.caixa_ini = caixa_ini;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCaixa_fin(Double caixa_fin) {
        this.caixa_fin = caixa_fin;
    }
}
