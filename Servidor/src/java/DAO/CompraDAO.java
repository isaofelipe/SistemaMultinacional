/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Compra;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class CompraDAO {
    private List<Compra> listaCompra;

    public CompraDAO() {
        listaCompra = new ArrayList<Compra>();
    }
    
    public void putOne(Compra c){
        listaCompra.add(c);
    }
}
