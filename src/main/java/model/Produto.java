/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author correia
 */
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer qntd;

    private String nome_produto;

    @OneToMany(mappedBy = "estoque.produto", fetch = FetchType.LAZY)
    private List<Estoque> estoque;

    @OneToMany(mappedBy = "produtovenda.produto", fetch = FetchType.LAZY)
    private List<ProdutoVenda> produtovenda;

    @Column(precision = 2)
    private Double valor;

    private String observacao;

    @Lob
    private byte[] foto;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome_produto, Double valor, String observacao, Categoria categoria) {
        this.nome_produto = nome_produto;
        this.valor = valor;
        this.observacao = observacao;
        this.categoria = categoria;
        this.foto = null;
    }

    public Produto(String nome_produto, Double valor, String observacao, byte[] foto, Categoria categoria) {
        this.nome_produto = nome_produto;
        this.valor = valor;
        this.observacao = observacao;
        this.foto = foto;
        this.categoria = categoria;
    }

    public Produto(Integer id, String nome_produto, Double valor, String observacao, byte[] foto, Categoria id_categoria) {
        this.id = id;
        this.nome_produto = nome_produto;
        this.valor = valor;
        this.observacao = observacao;
        this.foto = foto;
        this.categoria = id_categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQntd() {
        return qntd;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public Double getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return this.nome_produto +" - "+ this.observacao;
    }
}
