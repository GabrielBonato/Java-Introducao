//Aula 2

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minha primeira aplica��o Java!");

		// variaveis e fluxo
		// = atribui��o 
		int idade = 15, mes = 1, i = 0;
		boolean amigoDoDono = true;
		// operador de nega��o ! que significa que o amigoDoDono � falso
		// a variavel && � E
		// a variavel || � OU
		if (idade < 18 && !amigoDoDono) {
			System.out.println("N�o pode entrar");
		} else {
			System.out.println("Pode entrar");
		}

		// variavel de igual total ==
		// mesmo valor
		if (mes == 1) {
			System.out.println("Voc� deveria estar de f�rias");
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
