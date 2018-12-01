/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class Compra {
    private String cliente;
    private String produto;
    private int quantidade;
    private String filial;

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Compra(String cliente, String produto, int quantidade, String filial) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.filial = filial;
    }

    public Compra() {
    }
    
}
