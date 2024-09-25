import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		try {
			/*Utiliza o try catch para primeiramente verificar se os dados informados são adequados para serem
			 * processados na classe Pessoa.*/
			LocalDate dataNascimento = LocalDate.of(2002, 2, 10);
			Pessoa pessoa1 = new Pessoa("Breno Almeida", 1.75, dataNascimento);
			
			//Caso os dados informados sejam adequados, chama o método descrição e imprime as informações.
	        System.out.println(pessoa1.descricaoPessoa());
		} catch (IllegalArgumentException e) {
			/*Caso a data seja inválida imprime a mensagem de erro.*/
			System.out.println(e.getMessage());				
		}
		
		//Quebra de linha.
		System.out.println();
		System.out.println();
		
		/*Após informar os dados dos atributos necessários da classe Produto. Imprime seguindo o padrão
		 * formatado no método descricaoProduto.*/
        Produto prod1 = new Produto("Tenis", "Nike", 159.56, 259.99, 57);
        System.out.println(prod1.descricaoProduto());
		
		
	}

}
