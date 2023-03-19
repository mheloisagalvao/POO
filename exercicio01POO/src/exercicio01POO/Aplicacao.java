package exercicio01POO;

public class Aplicacao {
	public static void main(String args[]) {
		Usuario clienteC = new Usuario("heloisa@gmail.com", "Heloisa Galvao", "helogalvao", "8888888", "222.222.222-22", "1234567", 741852963);
		clienteC.compras();
		clienteC.dados();
		
		Vendendor clienteV = new Vendendor("maria@gmail.com", "Maria Correia", "maricorreia", "7777777", "111.111.111-11", "789456123", 852963741, 703944634);
		clienteV.vendas();
		clienteV.dadosBanco();
	}
	
}
