class variaveis {

	public static void main(String[] args) {
		// int s� aceita at� uma determinada casas decimais
		int idade = 21;
		int dobroIdade = idade * 2;
		System.out.println(dobroIdade);

		// caso o n�mero for muito grande � utilizado o long
		long num = 999999999999999L;
		System.out.println(num);

		int numero = 10;
		long copiaDeNumero = (int) numero;

		// double aceita numero grandes porem ocupa muita memoria
		double pi = 3.1415;
		double dobroPi = pi * 2;
		System.out.println(dobroPi);

		// float � para numero double pequenos
		float outroPi = 314;
		System.out.println(outroPi);

		boolean amigo = true;
		boolean inimigo = !amigo;
		boolean maiorIdade = idade <= 18;
		// char somente para uma letra
		char letra = 'M';
		String nome = "Gabriel Bonato";
		System.out.println(nome);

		System.out.println("--------------------");

		int idadeVisitante = 79;
		boolean amigoDoDono = true;
		// a variavel && � E
		// a variavel || � OU

		if (idadeVisitante >= 60) {
			System.out.println("Aproveite a melhor idade!");
		} else if (idadeVisitante >= 18 && amigoDoDono) {
			System.out.println("Entre na festa!");
		} else {
			System.out.println("Volte pra casa!");
		}

		// utilizando for
		System.out.println("\nUtilizando o for");
		for (int i = 0; i < 10; i++) {
			System.out.println("N� " + i);
		}
		// mesma opera��o do for s� que com while
		System.out.println("\nUtilizando o while");
		int j = 1;
		while (j < 10) {
			System.out.println("N� " + j);
			j++; // j = j+1
		}
		// verificar de um numero multiplicado � par
		int mult = 3;
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				int numQualquer = 10;
				System.out.println(i * mult);
				System.out.println(numQualquer);
			}
		}
		// utilizando o switch (s� compara conteudo)
		int n = 3;
		switch (n) {
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		default:
			System.out.println("num grande");
		}
		// exerc�cio 1 e 2 juntos
		int janeiro;
		janeiro = 15000;
		int fevereiro;
		fevereiro = 23000;
		int marco;
		marco = 17000;
		int gastosTrimestre = janeiro + fevereiro + marco;
		System.out.println("Gastos do Trimestre: R$" + gastosTrimestre);
		int mediaMensal = gastosTrimestre / 3;
		System.out.println("M�dia Mensal: R$" + mediaMensal + " por m�s");
	
		//exerc�cio 3
		int k = 150;
		while(k <= 300) {
			System.out.println( k );
			k++;
		}
	
	}

}
