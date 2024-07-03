/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.*;
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
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    private String endereco;
    
    private String bairro;
    
    private String cidade;
    
    private int numero;        

    public Endereco() {
    }

    public Endereco(Integer id, String endereco, String bairro, String cidade, int numero) {
        this.id = id;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public Endereco(String endereco, String bairro, String cidade, int numero) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
