//Encapsulamento o colocar a regra de negocio dentro na classe
//especifica, colocando private ou public

class ContaC {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	
	public ContaC(int numero, double limite) {
		this(numero, limite, 0);
	}
	
	public ContaC(int numero, double valor, double saldoInicial) {
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;
	}
	
	//public ContaC() {
		
	//}

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

class ClienteC{
	String nome;
	String endereco;
}

public class Construtores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaC joao = new ContaC(123, 100.0, 500);
		//joao.numero = 123;
		//joao.limite = 100;
		//joao.setLimite(100);
		//joao.deposita(500);
		
		double valorASerSacado = 600;
		joao.saca(valorASerSacado);
		
		System.out.println(joao.getSaldo());
		
	}

}
