/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.EstoqueDAO;
import dao.GenericDAO;
import dao.VendaDAO;
import java.util.Date;
import java.util.List;
import model.*;
import org.hibernate.HibernateException;
import org.postgresql.util.PSQLException;

/**
 *
 * @author correia
 */
public class DomainManager {
    private GenericDAO genDao;
    private VendaDAO venDao;
    private EstoqueDAO estDAO;
    
    public DomainManager() throws ClassNotFoundException, HibernateException, PSQLException {
        //ConnectionSQLDB.catchConnection();
        ConexaoHibernate.getSessionFactory();
        genDao = new GenericDAO();
        venDao = new VendaDAO();
        estDAO = new EstoqueDAO();
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
    
    public Cliente inserirCliente(String nome, String email, char sexo){
        Cliente cliente = new Cliente(nome, email, sexo);
        genDao.inserir(cliente);
        return cliente;
    }
    
    public List<Cliente> pesquisarCliente(){
        return genDao.listar(Cliente.class);
    }
    
    public void removerCliente(Cliente cliente){
        genDao.excluir(cliente);
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
    
    public void removerFornecedor(Fornecedor fornecedor){
        genDao.excluir(fornecedor);
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

    public void removerCategoria(Categoria categoria){
        genDao.excluir(categoria);
    }
    //-----------Produto-----------
    //Inserir SEM Imagem
    public Produto inserirProduto(String nome, Double valor, String obsString, Categoria categoria){
        Produto produto = new Produto(nome, valor, obsString, FuncoesUteis.imagemGenerica(),categoria);
        genDao.inserir(produto);
        return produto;
    }
    
    //Inserir COM Imagem
    public Produto inserirProduto(String nome, Double valor, String obsString, Categoria categoria, byte[] foto){
        Produto produto = new Produto(nome, valor, obsString, foto, categoria);
        genDao.inserir(produto);
        return produto;
    }
    
    public void alterarCategoria(Categoria categoria){
        genDao.alterar(categoria);
    }
     
    public List<Produto> pesquisarProduto(){
        return genDao.listar(Produto.class);
    }
    
    public void alterarProduto(Produto produto){
        genDao.alterar(produto);
    }
    
    public void removerProduto(Produto produto){
        genDao.excluir(produto);
    }
    
    //-----------Caixa-----------
    public Caixa inserirCaixa(Date dataAtual, Double caixaInicial, Double caixaFinalPrevisto, Double caixaFinalObtido){
        Caixa caixa = new Caixa(caixaInicial, caixaFinalObtido, caixaFinalPrevisto, dataAtual);
        genDao.inserir(caixa);
        return caixa;
    }
    
    public Caixa inserirCaixa(Date dataAtual, Double caixaInicial){
        Caixa caixa = new Caixa(caixaInicial, dataAtual);
        genDao.inserir(caixa);
        return caixa;
    }
    
    public void alterarCaixa(Integer id, Date dataAtual, Double caixaInicial, Double caixaFinalPrevisto, Double caixaFinalObtido){
        Caixa caixa = new Caixa(id, caixaInicial, caixaFinalObtido, caixaFinalPrevisto, dataAtual);
        genDao.alterar(caixa);
    }
    
    //-------------Estoque---------------
    public Estoque inserirEstoque(Integer qntd, Date data_comp, Fornecedor forn, Produto prod){
        Estoque estoque = new Estoque(qntd, data_comp, forn, prod);
        genDao.inserir(estoque);
        return estoque;
    }

    public List<Estoque> pesquisarEstoque(){
        return genDao.listar(Estoque.class);
    }
    
    public List<Estoque> pesquisarEstoque(String pesq, int tipo) throws HibernateException {    
        return switch (tipo) {
            case 0 -> estDAO.pesquisarPorProduto(pesq);
            case 1 -> estDAO.pesquisarPorFornecedor(pesq);
            default -> null;
        };
    }

    //-------------Produto Venda---------------
    public ProdutoVenda inserirProdutoVenda(Integer qntd, Produto prod, Venda vend){
        ProdutoVenda produtoV = new ProdutoVenda(qntd, prod.getValor(), prod, vend);
        genDao.inserir(produtoV);
        return produtoV;
    }    
    
    public void alterarProdutoVenda(Integer qntd, Produto prod, Venda vend){
        ProdutoVenda produtoV = new ProdutoVenda(qntd, prod.getValor(), prod, vend);
        genDao.alterar(produtoV);
    }    
    
    public void removerProdutoVenda(ProdutoVenda produtoVenda){
        genDao.excluir(produtoVenda);
    }
    
    public List<ProdutoVenda> pesquisarProdutoVenda(){
        return genDao.listar(ProdutoVenda.class);
    }
    
    //------------Venda-------------
    public Venda inserirVenda(Caixa caixa){
        Venda venda = new Venda(caixa);
        genDao.inserir(venda);
        return venda;
    }
    
    public void alterarVenda(Venda venda){
        genDao.alterar(venda);
    }
    
    public List<Venda> pesquisarVenda(){
        return genDao.listar(Venda.class);
    }
    
    public void getProdutoVenda(Venda venda){
        venDao.carregarProdutoVenda(venda);
    }
    
    //------------Pagamento-------------
    public Pagamento inserirPagamento(String descricao){
        Pagamento pagamento = new Pagamento(descricao);
        genDao.inserir(pagamento);
        return pagamento;
    }
    
    public List<Pagamento> pesquisarPagamento(){
        return genDao.listar(Pagamento.class);
    }
    
    //-----------Buscas---------------
    public Object buscaLoad(Class classe, int id) throws HibernateException{
        return genDao.load(classe, id);
    }
    
    public Object buscaGet(Class classe, int id) throws HibernateException{
        return genDao.get(classe, id);
    }
    
    //------------Query-------------
    public List minhaQuery(String query){
        return genDao.selectQuery(query);
    }
}
