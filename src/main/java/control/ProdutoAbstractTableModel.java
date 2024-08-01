package control;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class ProdutoAbstractTableModel extends AbstractTableModel {

    private List<Produto> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Foto", "Produto", "Observacao", "Preco", "Quantidade"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto item = listaItens.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getFoto();
            case 1 -> item.getNome_produto();
            case 2 -> item.getObservacao();
            case 3 -> item.getValor();
            case 4 -> item.getQntd();
            default -> null;
        };
    }
    
    public void adicionar (Produto item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
    }
    
    public void adicionar (List<Produto> item) {
        for (Produto next : item) {  
            listaItens.add((Produto) next);
            fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 ); 
        }
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Produto getProduto(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Produto> novaLista) {
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
