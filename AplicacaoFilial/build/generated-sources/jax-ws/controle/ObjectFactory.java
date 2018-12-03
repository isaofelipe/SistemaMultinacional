
package controle;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the controle package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://controle/", "hello");
    private final static QName _RealizarCompraResponse_QNAME = new QName("http://controle/", "realizar_compraResponse");
    private final static QName _ConsultarProdutosResponse_QNAME = new QName("http://controle/", "consultar_produtosResponse");
    private final static QName _ConsultaCliente_QNAME = new QName("http://controle/", "consulta_cliente");
    private final static QName _RealizarCompra_QNAME = new QName("http://controle/", "realizar_compra");
    private final static QName _ConsultarProdutos_QNAME = new QName("http://controle/", "consultar_produtos");
    private final static QName _AdicionaResponse_QNAME = new QName("http://controle/", "adicionaResponse");
    private final static QName _Adiciona_QNAME = new QName("http://controle/", "adiciona");
    private final static QName _ConsultaClienteResponse_QNAME = new QName("http://controle/", "consulta_clienteResponse");
    private final static QName _CadastraClienteResponse_QNAME = new QName("http://controle/", "cadastra_clienteResponse");
    private final static QName _CadastraCliente_QNAME = new QName("http://controle/", "cadastra_cliente");
    private final static QName _HelloResponse_QNAME = new QName("http://controle/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: controle
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCliente }
     * 
     */
    public ConsultaCliente createConsultaCliente() {
        return new ConsultaCliente();
    }

    /**
     * Create an instance of {@link RealizarCompra }
     * 
     */
    public RealizarCompra createRealizarCompra() {
        return new RealizarCompra();
    }

    /**
     * Create an instance of {@link ConsultarProdutos }
     * 
     */
    public ConsultarProdutos createConsultarProdutos() {
        return new ConsultarProdutos();
    }

    /**
     * Create an instance of {@link Adiciona }
     * 
     */
    public Adiciona createAdiciona() {
        return new Adiciona();
    }

    /**
     * Create an instance of {@link ConsultaClienteResponse }
     * 
     */
    public ConsultaClienteResponse createConsultaClienteResponse() {
        return new ConsultaClienteResponse();
    }

    /**
     * Create an instance of {@link AdicionaResponse }
     * 
     */
    public AdicionaResponse createAdicionaResponse() {
        return new AdicionaResponse();
    }

    /**
     * Create an instance of {@link CadastraCliente }
     * 
     */
    public CadastraCliente createCadastraCliente() {
        return new CadastraCliente();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CadastraClienteResponse }
     * 
     */
    public CadastraClienteResponse createCadastraClienteResponse() {
        return new CadastraClienteResponse();
    }

    /**
     * Create an instance of {@link RealizarCompraResponse }
     * 
     */
    public RealizarCompraResponse createRealizarCompraResponse() {
        return new RealizarCompraResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ConsultarProdutosResponse }
     * 
     */
    public ConsultarProdutosResponse createConsultarProdutosResponse() {
        return new ConsultarProdutosResponse();
    }

    /**
     * Create an instance of {@link Erro }
     * 
     */
    public Erro createErro() {
        return new Erro();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarCompraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "realizar_compraResponse")
    public JAXBElement<RealizarCompraResponse> createRealizarCompraResponse(RealizarCompraResponse value) {
        return new JAXBElement<RealizarCompraResponse>(_RealizarCompraResponse_QNAME, RealizarCompraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProdutosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "consultar_produtosResponse")
    public JAXBElement<ConsultarProdutosResponse> createConsultarProdutosResponse(ConsultarProdutosResponse value) {
        return new JAXBElement<ConsultarProdutosResponse>(_ConsultarProdutosResponse_QNAME, ConsultarProdutosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "consulta_cliente")
    public JAXBElement<ConsultaCliente> createConsultaCliente(ConsultaCliente value) {
        return new JAXBElement<ConsultaCliente>(_ConsultaCliente_QNAME, ConsultaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "realizar_compra")
    public JAXBElement<RealizarCompra> createRealizarCompra(RealizarCompra value) {
        return new JAXBElement<RealizarCompra>(_RealizarCompra_QNAME, RealizarCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProdutos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "consultar_produtos")
    public JAXBElement<ConsultarProdutos> createConsultarProdutos(ConsultarProdutos value) {
        return new JAXBElement<ConsultarProdutos>(_ConsultarProdutos_QNAME, ConsultarProdutos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "adicionaResponse")
    public JAXBElement<AdicionaResponse> createAdicionaResponse(AdicionaResponse value) {
        return new JAXBElement<AdicionaResponse>(_AdicionaResponse_QNAME, AdicionaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adiciona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "adiciona")
    public JAXBElement<Adiciona> createAdiciona(Adiciona value) {
        return new JAXBElement<Adiciona>(_Adiciona_QNAME, Adiciona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "consulta_clienteResponse")
    public JAXBElement<ConsultaClienteResponse> createConsultaClienteResponse(ConsultaClienteResponse value) {
        return new JAXBElement<ConsultaClienteResponse>(_ConsultaClienteResponse_QNAME, ConsultaClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastraClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "cadastra_clienteResponse")
    public JAXBElement<CadastraClienteResponse> createCadastraClienteResponse(CadastraClienteResponse value) {
        return new JAXBElement<CadastraClienteResponse>(_CadastraClienteResponse_QNAME, CadastraClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastraCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "cadastra_cliente")
    public JAXBElement<CadastraCliente> createCadastraCliente(CadastraCliente value) {
        return new JAXBElement<CadastraCliente>(_CadastraCliente_QNAME, CadastraCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
