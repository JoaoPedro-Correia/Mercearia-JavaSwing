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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author correia
 */
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    private String nome;
    
    private String cpf;
    
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    
    @Column(length = 1)
    private char sexo;
    
    @Column(nullable = false)
    private String email;
    
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    private String contato;
    
    private String observacoes;
    
     @OneToMany (mappedBy = "id_cliente", fetch = FetchType.LAZY)
    private List<Venda> venda;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, Endereco endereco, char sexo, String email, Date dataNascimento, String contato, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.observacoes = observacoes;
    }

    public Cliente(String nome, String cpf, Endereco endereco, char sexo, String email, Date dataNascimento, String contato, String observacoes) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.observacoes = observacoes;
    }

    public Cliente(String nome, String cpf, Endereco endereco, char sexo, String email, Date dataNascimento, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return nome;
    }
}
