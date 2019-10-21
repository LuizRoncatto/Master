package trabalhoFacul;

import java.util.Scanner;

public class Jogo {

	protected boolean jogador = true;

	public Jogo() {

	}

	public void initJogo() {

		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.imprimir();

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("faça sua jogada");

			System.out.println("Digite a linha");
			int linha = entrada.nextInt();
			System.out.println("Digite a coluna");
			int coluna = entrada.nextInt();

			if (tabuleiro.verificaEspaco(linha, coluna) == true) {

			} else {
				tabuleiro.jogada(linha, coluna, jogador);
				jogador = !jogador;
				// fimDeJogo ++;
			}
			tabuleiro.imprimir();

		} while (true);

	}

}
