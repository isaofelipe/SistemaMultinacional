/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import controle.Cliente;
import controle.Produto;
import controle.Servidor;
import controle.Servidor_Service;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Isao Felipe Morigaki
 */
public class Main {
    static Servidor_Service service = new Servidor_Service();
    static Servidor port = service.getServidorPort();
    
    public static void main(String[] args) throws IOException {
        String nomeFilial;
        String nomeCliente;
        Scanner scan = new Scanner (System.in);
        System.out.println("Bem vindo ao Sistema de Multinacionais\n");
        System.out.println("Digite a sigla da filial:");
        nomeFilial = scan.next();
        while(true){
            int escolha = 0;
            System.out.println("1. Cadastrar cliente\n2. Verificar Cadastro\n3. Realizar Compra\n4. Consultar Produtos\n5. Sair\n\n");
            System.out.println("Sua escolha: ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    {
                        System.out.println("\nCadastro\n\nDigite seu nome:");
                        nomeCliente = scan.next();
                        port.cadastraCliente(nomeCliente, "3213213213", "Rua tal", nomeFilial); //Fazer leitura de todos os dados do cliente
                        System.out.println("Cadastro feito com sucesso\n");
                        System.out.println("Pressione enter para continuar...\n");
                        System.in.read();
                        break;
                    }
                case 2:
                    {
                        System.out.println("\nVerificar\n\nDigite seu nome:");
                        nomeCliente = scan.next();
                        Cliente c = port.consultaCliente(nomeCliente);
                        if(c != null){
                            System.out.println("Nome: "     + c.getNome()     + "\n"
                                             + "Telefone: " + c.getTelefone() + "\n"
                                             + "Endereco: " + c.getEndereco() + "\n"
                                             + "Filial: "   + c.getFilial()   + "\n\n");
                        }
                        else{ System.out.println("Cliente nao encontrado\n"); }
                        System.out.println("Pressione enter para continuar...\n");
                        System.in.read();
                        break;
                    }
                case 3:
                    System.out.println("\nCompra\n\nDigite seu nome:");
                    nomeCliente = scan.next();
                    System.out.println("\nDigite o produto:");
                    String produto = scan.next();
                    System.out.println("\nDigite a quantidade:");
                    int quantidade = Integer.parseInt(scan.next());
                    port.realizarCompra(nomeCliente, produto, quantidade, nomeFilial);
                    System.out.println("Pressione enter para continuar...\n");
                    System.in.read();
                    break;
                case 4:
                    System.out.println("\nLista de produtos:\n\n");
                    List<Produto> produtos = port.consultarProdutos();
                    for(Produto p : produtos){
                        System.out.println(p.getNome() + ", estoque: " + p.getQuantidade() + ", preço: " + p.getPreco() + "\n");
                    }
                    System.out.println("Pressione enter para continuar...\n");
                    System.in.read();
                    break;
                default:
                    System.out.println("Sessão Encerrada");
                    System.exit(0);
                    break;
            }

        }
    }
    
    private static int adiciona(int a, int b) {
        Servidor_Service service = new Servidor_Service();
        Servidor port = service.getServidorPort();
        return port.adiciona(a, b);
    }
}