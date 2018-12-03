/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class ClienteDAO {
    private List<Cliente> listaCliente;

    public ClienteDAO() {
        listaCliente = new ArrayList<Cliente>();
        listaCliente.add(new Cliente("Joao", "(27)99999-9999", "Rua Europa", "A"));
        listaCliente.add(new Cliente("Mateus", "(27)33333-9999", "Rua do Bobos n 0", "B"));
        listaCliente.add(new Cliente("Isao", "(27)33333-9999", "Rua Japao", "B"));
    }
    
    public Cliente getOne(String nome){
        for(Cliente c : listaCliente){
            if (c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }
    
    public void putOne(Cliente c) {
        listaCliente.add(c);
    }
}