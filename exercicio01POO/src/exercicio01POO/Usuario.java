package exercicio01POO;

public class Usuario {
	private String email;
	private String nomeCompleto;
	private String user;
	private String telefone;
	private String cpf;
	private String senha;
	private int cartao;
	
	public Usuario (String email, String nomeCompleto, String user, String telefone, String cpf, String senha, int cartao) {
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.user = user;
		this.telefone = telefone;
		this.cpf = cpf;
		this.senha = senha;
		this.cartao = cartao;
	}
	
	void compras(){
		System.out.println("O cliente " + user + " fez 10 compras na Shopee!");
	}
	
	void dados(){
		System.out.println("Validação dos dados do usuário " + user + ": ");
		System.out.println("Email: " + email);
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Telefone: " + telefone);
		System.out.println("CPF: " + cpf);
		System.out.println("Senha: " + senha);
		System.out.println("Número do cartão: " + cartao);
	}
}
