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
public class Filial {
    private String nome;

    public Filial(String nome) {
        this.nome = nome;
    }

    public Filial() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
