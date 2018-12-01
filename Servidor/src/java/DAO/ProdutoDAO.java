/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Produto;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class ProdutoDAO {
    private List<Produto> listaProduto;

    public ProdutoDAO() {
        listaProduto = new ArrayList<Produto>();
        listaProduto.add(new Produto("Placa de aço", 50, 1200));
        listaProduto.add(new Produto("Barra de ferro", 90, 500));
    }
    
    public List<Produto> getAll(){
        return listaProduto;
    }
}
