/*Cria a classe produto e declara as variaveis como privadas
permitindo o acesso apenas dentro da classe.*/
public class Produto {
	private String nome;
	private String marca;
	private double precoCusto;
	private double precoVenda;
	private int quantiVendas;

	/*Esse método construtor tem como parâmetros cada uma das variáveis declaradas na classe,
	 * assim instancia suas variáveis a partir dos dados inseridos na classe Main.*/
    public Produto(String nome, String marca, double precoCusto, double precoVenda, int quantiVendas) {
        this.nome = nome;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.quantiVendas = quantiVendas;
    }
    
    /*Um método privado que recebe o preço de venda e o preço de custo e faz a substração para retornar
     * o lucro unitário.*/
    private double getLucroUnitario() {
    	return
    			precoVenda - precoCusto;
    }
    
    /*Semelhante ao método privado anterior, porém este recebe o lucro unitário e a quantidade de vendas
     * para calcular o lucro total obtido, após uma multiplicação.*/
    private double getLucroTotal() {
    	return
    			getLucroUnitario() * quantiVendas;
    }
            
    /*Este é um método para mostrar as informações no terminal após serem processadas pelo os outros
     * métodos anteriores, seguindo o padrão desta String. */
    public String descricaoProduto(){
        return
				"Nome:  " + this.nome  + "\n"  +
				"Marca:  " + this.marca  +"\n" +
				"Preço de custo:  " + this.precoCusto  + "\n" +
				"Preço de Venda:  " + this.precoVenda  + "\n" +
				"Quantidade de vendas:  " + this.quantiVendas  + "\n" +
				"Lucro unitário: R$ " + getLucroUnitario() + "\n" +
				"Lucro total: R$ " + getLucroTotal();
    }

}