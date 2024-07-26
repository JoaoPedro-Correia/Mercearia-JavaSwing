/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.util.Date;
import java.util.List;
import model.Caixa;
import model.Categoria;
import model.Cliente;
import model.Endereco;
import model.Fornecedor;
import model.Produto;
import org.hibernate.HibernateException;
import org.postgresql.util.PSQLException;

/**
 *
 * @author correia
 */
public class DomainManager {
    private GenericDAO genDao;

    public DomainManager() throws ClassNotFoundException, HibernateException, PSQLException {
        //ConnectionSQLDB.catchConnection();
        ConexaoHibernate.getSessionFactory();
        genDao = new GenericDAO();
    }
    
    public List listar(Class classe) throws HibernateException  {
        return genDao.listar(classe );
    }
 
    //---------CLIENTE----------
    public Cliente inserirCliente(String nome, String cpf, Endereco endereco, char sexo, String email, Date dataNascimento, String contato, String observacoes){
        Cliente cliente = new Cliente(nome, cpf, endereco, sexo, email, dataNascimento, contato, observacoes);
        genDao.inserir(cliente);
        return cliente;
    }
    
    public List<Cliente> pesquisarCliente(){
        return genDao.listar(Cliente.class);
    }
    
    public void alterarCliente(Integer id, String nome, String cpf, Endereco endereco, char sexo, String email, Date dataNascimento, String contato, String observacoes){
        Cliente cliente = new Cliente(id, nome, cpf, endereco, sexo, email, dataNascimento, contato, observacoes);
        genDao.alterar(cliente);
    }
    
    //---------Endereco----------
    public Endereco inserirEndereco(String logradouro, String bairro, String cidade, int numero){
        Endereco endereco;
        endereco = new Endereco(logradouro, bairro, cidade, numero);
        genDao.inserir(endereco);
        return endereco;
    }
    
    public List<Endereco> pesquisarEndereco(String pesq, int tipo){
        return genDao.listar(Endereco.class);
    }
    
    public void alterarEndereco(Integer id, String logradouro, String bairro, String cidade, int numero){
        Endereco endereco = new Endereco(id, logradouro, bairro, cidade, numero);
        genDao.alterar(endereco);
    }
    
    //---------FORNECEDOR----------
    public Fornecedor inserirFornecedor(Endereco id_endereco, String cnpj, String email, String contato, String observacoes, String nome_social){
        Fornecedor fornecedor = new Fornecedor(id_endereco, cnpj, email, contato, observacoes, nome_social);
        genDao.inserir(fornecedor);
        return fornecedor;
    }
    
    public List<Fornecedor> pesquisarFornecedor(){
        return genDao.listar(Fornecedor.class);
    }
    
    public void alterarFornecedor(Integer id, Endereco id_endereco, String cnpj, String email, String contato, String observacoes, String nome_social){
        Fornecedor fornecedor = new Fornecedor(id, id_endereco, cnpj, email, contato, observacoes, nome_social);
        genDao.alterar(fornecedor);
    }
    
    //-----------Categoria-----------
    public Categoria inserirCategoria(String desricao){
        Categoria categoria = new Categoria(desricao);
        genDao.inserir(categoria);
        return categoria;
    }
    
    public List<Categoria> pesquisarCategoria(){
        return genDao.listar(Categoria.class);
    }

    //-----------Produto-----------
    public Produto inserirProduto(String nome, Double valor, String obsString, Categoria categoria){
        //Produto produto = new Produto(nome, valor, obsString, categoria);
        Produto produto = new Produto(nome, valor, obsString, new byte[Integer.BYTES], categoria);
        genDao.inserir(produto);
        return produto;
    }
    
    //-----------Caixa-----------
    public Caixa inserirCaixa(Date dataAtual, Double caixaInicial, Double caixaFinalPrevisto, Double caixaFinalObtido){
        Caixa caixa = new Caixa(caixaInicial, caixaFinalObtido, caixaFinalPrevisto, dataAtual);
        genDao.inserir(caixa);
        return caixa;
    }
}
