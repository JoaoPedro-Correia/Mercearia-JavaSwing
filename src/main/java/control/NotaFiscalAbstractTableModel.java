package control;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Venda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class NotaFiscalAbstractTableModel extends AbstractTableModel {
    private List<Venda> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Data", "Cliente", "Valor"};        
        return nomesColunas[column];        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda item = listaItens.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getId_caixa().getData();
            case 1 -> item.getId_cliente();
            //case 2 -> item.get;
            default -> null;
        };
    }
    
    public void adicionar (Venda item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
    }
    
    public void adicionar (List<Venda> item) {
        for (Venda next : item) {  
            listaItens.add((Venda) next);
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

    public Venda getCategorias(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Venda> novaLista) {
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