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
public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private String filial;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String endereco, String filial) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.filial = filial;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
