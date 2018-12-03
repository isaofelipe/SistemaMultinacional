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
        listaProduto.add(new Produto("borracha", 50, 2));
        listaProduto.add(new Produto("lapis", 90, 3));
        listaProduto.add(new Produto("caneta", 90, 7));
    }
    
    public List<Produto> getAll(){
        return listaProduto;
    }
    
    public Produto getOne(String nome){
        for (Produto p : listaProduto){
            if (p.getNome().equals(nome))
                return p;
        }
        return null;
    }
    
    public void atualizarProduto(Produto p, int quantidade){
        for(Produto prod : listaProduto){
            if (p.getNome().equals(prod.getNome())){
                prod.setQuantidade(prod.getQuantidade() - quantidade);
            }
        }
    }
}
