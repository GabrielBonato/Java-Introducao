//Aula 2

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minha primeira aplicação Java!");

		// variaveis e fluxo
		// = atribuição 
		int idade = 15, mes = 1, i = 0;
		boolean amigoDoDono = true;
		// operador de negação ! que significa que o amigoDoDono é falso
		// a variavel && é E
		// a variavel || é OU
		if (idade < 18 && !amigoDoDono) {
			System.out.println("Não pode entrar");
		} else {
			System.out.println("Pode entrar");
		}

		// variavel de igual total ==
		// mesmo valor
		if (mes == 1) {
			System.out.println("Você deveria estar de férias");
		}

		while (idade < 18) {
			System.out.println(idade);
			idade = idade + 1;
		}
		
		for(i = 0; i < 10; i++) {
			System.out.println("Ta aqui o for: ");
		}
	}

}
