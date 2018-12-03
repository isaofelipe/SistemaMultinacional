/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.ProdutoDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Cliente;
import modelo.Compra;
import modelo.Erro;
import modelo.Produto;

/**
 *
 * @author Isao Felipe Morigaki
 */
@WebService(serviceName = "Servidor")
public class Servidor {
    private ClienteDAO clienteDAO = new ClienteDAO();
    private CompraDAO compraDAO = new CompraDAO();
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "adiciona")
    public int adiciona(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "consulta_cliente")
    public Cliente consulta_cliente(@WebParam(name = "nome") String nome) {
        Cliente c = clienteDAO.getOne(nome);
        return c;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "cadastra_cliente")
    public boolean cadastra_cliente(@WebParam(name = "nome") String nome, @WebParam(name = "telefone") String telefone, @WebParam(name = "endereco") String endereco, @WebParam(name = "filial") String filial) {
        Cliente c = new Cliente(nome, telefone, endereco, filial);
        clienteDAO.putOne(c);
        return true;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "realizar_compra")
    public Erro realizar_compra(@WebParam(name = "cliente") String cliente, @WebParam(name = "produto") String produto, @WebParam(name = "quantidade") int quantidade, @WebParam(name = "filial") String filial) {
        Cliente c = clienteDAO.getOne(cliente);
        Erro erro = new Erro();
        Produto p = produtoDAO.getOne(produto);
        if (c == null){
            erro.setMensagem("Cliente inexistente");
        }
        else if (!c.getFilial().equals(filial)){
            erro.setMensagem("O cliente está cadastrado em outra filial");
        }
        else if (p == null){
            erro.setMensagem("Produto inválido");
        }
        else if(p.getQuantidade() < quantidade){
            erro.setMensagem("Não há estoque disponivel do produto");
        }
        else{
            erro.setSucesso(true);
            erro.setMensagem("Sucesso!");
            produtoDAO.atualizarProduto(p, quantidade);
        }
        return erro;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "consultar_produtos")
    public List<Produto> consultar_produtos() {
        return produtoDAO.getAll();
    }
}
