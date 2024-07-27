package control;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Estoque;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class EstoqueAbstractTableModel extends AbstractTableModel {

    private List<Estoque> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Foto", "Produto", "Quantidade", "Fornecedor"};        
        return nomesColunas[column];        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estoque item = listaItens.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getEstoque().getProduto().getFoto();
            case 1 -> item.getEstoque().getProduto();
            case 2 -> item.getQntd();
            case 3 -> item.getEstoque().getFornecedor();
            default -> null;
        };
    }
    
    public void adicionar (Estoque item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
    }
    
    public void adicionar (List<Estoque> item) {
        for (Estoque next : item) {  
            listaItens.add((Estoque) next);
            fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 ); 
        }
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Estoque getCategorias(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Estoque> novaLista) {
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
