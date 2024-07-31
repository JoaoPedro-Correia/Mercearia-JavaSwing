package control;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ProdutoVenda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class ProdutoVendaAbstractTableModel extends AbstractTableModel {
    private List<ProdutoVenda> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Produto", "Quantidade", "Preco"};        
        return nomesColunas[column];        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutoVenda item = listaItens.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getProdutovenda().getProduto();
            case 1 -> item.getQntd();
            case 2 -> item.getValor();
            default -> null;
        };
    }
    
    public void adicionar (ProdutoVenda item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
    }
    
    public void adicionar (List<ProdutoVenda> item) {
        for (ProdutoVenda next : item) {  
            listaItens.add((ProdutoVenda) next);
            fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 ); 
        }
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
    }
    
    public void removerTudo () {
        fireTableRowsDeleted(0, this.getRowCount());        
        listaItens.clear();
    }

    public ProdutoVenda getProdutoVenda(int linha) {
        return listaItens.get(linha);
    }
    
    public Double getValorTotal(){
        Double valor=0.0;
        
            for(ProdutoVenda produto : listaItens){
                valor+=produto.getValor()*produto.getQntd();
            }

        return valor;
    }
    
    public void setLista(List<ProdutoVenda> novaLista) {
        if ( novaLista.isEmpty()) {
            if ( !listaItens.isEmpty() ) {
                listaItens.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted( 0, listaItens.size() - 1);
        }
    }
}
