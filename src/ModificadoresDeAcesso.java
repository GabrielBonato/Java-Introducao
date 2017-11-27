//Encapsulamento o colocar a regra de negocio dentro na classe
//especifica, colocando private ou public

class ContaP {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

	public void saca(double valor) {
		
		if (valor > this.saldo+limite){
			System.out.println("Saque invalido");
		}else {
			this.saldo = this.saldo - valor;
		}
		
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setLimite(double novoLimite) {
		this.limite = novoLimite;
	}
	
}

class Cliente{
	String nome;
	String endereco;
}

public class ModificadoresDeAcesso {

	public static void main(String[] args) {
		ContaP joao = new ContaP();
		joao.numero = 123;
		//joao.limite = 100;
		joao.setLimite(100);
		joao.deposita(500);
		
		double valorASerSacado = 600;
		joao.saca(valorASerSacado);
		
		System.out.println(joao.getSaldo());
		
	}

}
