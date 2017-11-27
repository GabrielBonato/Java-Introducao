//Aula 3

class Conta {
	int numero;
	double saldo;
	
	Pessoa titular;

	// comportamento
	void deposita(double valorASerDepositado) {
		// this especifica que o saldo é da classe Conta

		this.saldo += valorASerDepositado;

	}

	void saca(double valorASerSacado) {
		if (this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;
		}
	}
	
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
		
	}
}

class Pessoa{
	String nome;
	String cpf;
	String dataNascimento;
}

public class OrientacaoObjeto {

	public static void main(String[] args) {
		Conta gabriel = new Conta();
		gabriel.numero = 123;
		gabriel.saldo = 0;
		gabriel.titular = new Pessoa();
		gabriel.titular.nome = "Gabriel Bonato";
		gabriel.titular.cpf = "123456798";
		gabriel.titular.dataNascimento = "01/01/1990";		
		//gabriel.agencia = 456;

		// gabriel.saldo += 100;
		gabriel.deposita(100.0);
		gabriel.saca(5000.0);

		Conta guilherme = new Conta();
		guilherme.numero = 789;
		guilherme.saldo = 12345;
		
		guilherme.transfere(100, gabriel);

		// guilherme.saldo += 100;
		guilherme.deposita(100.0);
		guilherme.saca(100.0);
		
		System.out.println(gabriel.saldo);
		System.out.println(guilherme.saldo);
	}

}
