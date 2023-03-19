package exercicio01POO;

public class Vendendor extends Usuario {
	private int banco;
	private String user;
	Vendendor(String email, String nomeCompleto, String user, String telefone, String cpf, String senha, int cartao, int banco){
		super (email, nomeCompleto, user, telefone, cpf, senha, cartao);
		this.user = user;
		this.banco = banco;
	}
	
	void vendas(){
		System.out.println("O cliente " + user + " fez 5 vendas na Shopee!");
	}
	
	void dadosBanco(){
		System.out.println("Verifique os dados do seu banco: " +  banco);
	}
	
}
