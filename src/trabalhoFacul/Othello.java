package trabalhoFacul;

import java.util.Scanner;

public class Othello {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcao;

		do {
			System.out.printf("\n");
			System.out.println("Escolha uma opção de Jogo abaixo");
			System.out.println("1. Jogador x Jogado");
			System.out.println("2. Jogador x IA");
			System.out.println("3. Autores");
			System.out.println("4. Como Jogar");
			System.out.println("5. Replay");
			System.out.println("6. Sair");

			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:

				break;
			case 2:
				break;

			case 3:
				Autores autores = new Autores();
				autores.imprimirNomes();

				break;

			case 4:
				Regras regra = new Regras();
				regra.imprimir();

				break;

			case 5:

				break;

			default:
				break;
			}

		} while (opcao != 6 && opcao > 0);

		entrada.close();
	}

}
