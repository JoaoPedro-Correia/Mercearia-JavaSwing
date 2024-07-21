package control;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Categoria;
import model.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class CategoriaAbstractTableModel extends AbstractTableModel {

    private List<Categoria> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Categoria"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Categoria item = listaItens.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getNome_categoria();
            default -> null;
        };
    }
    
    public void adicionar (Categoria item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
    }
    
    public void adicionar (List<Categoria> item) {
        for (Categoria next : item) {  
            listaItens.add((Categoria) next);
            fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 ); 
        }
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Categoria getCategorias(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Categoria> novaLista) {
        
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
