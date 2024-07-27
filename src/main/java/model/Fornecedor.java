/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Fornecedor implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    
    @Column(length = 18)
    private String cnpj;
    
    @Column(unique = true)
    private String email;
    
    private String contato;
    
    private String observacoes;
    
    private String nome_social;
    
    @OneToMany (mappedBy = "estoque.fornecedor", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Estoque> estoque;

    public Fornecedor() {
    }

    public Fornecedor(Endereco id_endereco, String cnpj, String email, String contato, String observacoes, String nome_social) {
        this.endereco = id_endereco;
        this.cnpj = cnpj;
        this.email = email;
        this.contato = contato;
        this.observacoes = observacoes;
        this.nome_social = nome_social;
    }

    public Fornecedor(Integer id, Endereco id_endereco, String cnpj, String email, String contato, String observacoes, String nome_social) {
        this.id = id;
        this.endereco = id_endereco;
        this.cnpj = cnpj;
        this.email = email;
        this.contato = contato;
        this.observacoes = observacoes;
        this.nome_social = nome_social;
    }
    
    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }
    
    public Integer getId() {
        return id;
    }

    public Endereco getId_endereco() {
        return endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getContato() {
        return contato;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setId_endereco(Endereco id_endereco) {
        this.endereco = id_endereco;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return nome_social;
    }
    
}
