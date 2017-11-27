//Encapsulamento o colocar a regra de negocio dentro na classe
//especifica, colocando private ou public

class ContaD {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	
	//static ve o mesmo numero
	private static int numeroIncremental = 1;
	
	//coisa estatica somente ve coisa estatica
	public static int x(){
		return 2*2;
	}
	
	public ContaD(int numero, double limite) {
		this(numero, limite, 0);
	}
	
	public ContaD(int numero, double valor, double saldoInicial) {
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;
	}
	
	public ContaD() {
		this.numero = numeroIncremental;
		numeroIncremental++;
	}

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
	
	public double getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setLimite(double novoLimite) {
		this.limite = novoLimite;
	}
	
}

class ClienteD{
	String nome;
	String endereco;
}

public class AtributosEMetodosEstaticos {

	public static void main(String[] args) {
		ContaD joao = new ContaD();
		System.out.println(joao.getNumero());
		
		ContaD jose = new ContaD();
		System.out.println(jose.getNumero());
		
		System.out.println(ContaD.x());
		
	}

}
