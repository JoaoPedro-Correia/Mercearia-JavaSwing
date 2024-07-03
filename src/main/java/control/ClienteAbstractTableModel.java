package control;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1547816
 */
public class ClienteAbstractTableModel extends AbstractTableModel {

    private List<Cliente> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    // Títulos das colunas
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Nome", "DataNasc.", "Email", "CPF", "Contato", "Sexo"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente item = listaItens.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getNome();
            case 1 -> item.getDataNascimento();
            case 2 -> item.getEmail();
            case 3 -> item.getCpf();
            case 4 -> item.getContato();
            case 5 -> item.getSexo();
            default -> null;
        };
    }
    
    public void adicionar (Cliente item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Cliente getCliente(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Cliente> novaLista) {
        
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
