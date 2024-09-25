import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*A classe pessoa com os seus atributos privados para serem acessados diretamente
 * apenas dentro da classe.*/
public class Pessoa {
	private String nomeCompleto;
	private LocalDate dataNascimento;
	private double altura;
	private String email;
    
    /*Esse método construtor cria uma nova "pessoa" quando 
      chamado na classe Main, recebendo os dados correspondentes aos seus parâmetros*/
    public Pessoa(String nomeCompleto, double altura, LocalDate dataNascimento) {
        	this.nomeCompleto = nomeCompleto;
        	this.altura = altura;
            
            /*Define a data atual para ser usada na condição if, onde verifica se a data 
             de nascimento informada não é posterior a data atual.*/
            LocalDate dataAtual = LocalDate.now();
	            if (dataNascimento.isAfter(dataAtual)) {
	            	//Caso seja posterior a data atual, retorna a mensagem no terminal.
	            	throw new IllegalArgumentException("A data de nascimento não pode ser superior à data atual.");		            
	            }
            //Se for validada a data instancia a data informada na variável dessa classe.
	        this.dataNascimento = dataNascimento;
        
	        /*Chama o método de construção de email e diz que o dado base para criar o email
	         * será o nomeCompleto informado.*/
	        this.email = emailPessoa(nomeCompleto);
    } 
    		/*Esse método cria o email, armazenando cada parte do nome dentro de um array, pulando os espaços
    		 * Então na posição 0 do array fica armazenado o primeiro nome e na última posição o último sobrenome
    		 * Assim armazeando nome e sobrenome a partir da posição do array, e ainda usa toLowercase para deixar em
    		 * letras minúsculas.*/
	        private String emailPessoa(String nomeCompleto) {
	        	String[] partesNome = nomeCompleto.split(" ");
	        	String nome = partesNome[0].toLowerCase();
	        	String sobrenome = partesNome[partesNome.length - 1].toLowerCase();
	        	return nome + "." + sobrenome + "@dominio.com";
	        }
	        
	    //get para acessar o nome completo.
        public String getNomeCompleto() {
            return nomeCompleto;
        }
        
	    //get para acessar a altura.
        public double getAltura() {
            return altura;
        }
        
	    //get para acessar a data de nascimento.
        public LocalDate getDataNascimento() {
            return dataNascimento;
        }
        
	    //get para acessar o email.
        public String getEmail() {
            return email;
        }
        
    /*Método que, quando chamado na classe Main, imprime as informações no terminal
        após serem processadas na classe pessoa e sendo acessadas pelo get de cada informação.*/
	public String descricaoPessoa() {
		/*Formatador da estrutura da data, para ficar mais legível seguindo o nosso formato de data brasileiro.*/
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return
			"Nome completo: " + getNomeCompleto() + "\n" +
			"Altura: " + getAltura() + "m\n" +
			"Data de Nascimento: " + getDataNascimento().format(formatter) + "\n" +
			"Email: " + getEmail();
	}
			
}
