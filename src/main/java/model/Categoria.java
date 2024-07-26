/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
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
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @OneToMany ( mappedBy = "categoria" , fetch = FetchType.LAZY)
    private List<Produto> produtos;
    
    private String nome_categoria;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public Categoria(Integer id, String nome_categoria) {
        this.id = id;
        this.nome_categoria = nome_categoria;
    }

    public Categoria() {
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public Integer getId() {
        return id;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    @Override
    public String toString() {
        return nome_categoria;
    }
}
