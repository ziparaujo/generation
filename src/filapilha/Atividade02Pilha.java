package filapilha;

import java.util.*;

public class Atividade02Pilha {
	private static Stack<String> livros = new Stack<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\n1 - Adicionar livro na pilha");
			
			
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.printf("\nEntre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				System.out.printf("\nDigite o nome do livro: ");
				String nome = sc.next();
				livros.push(nome);

				imprimePilha();
				System.out.println("\nLivro adicionado.\n");
				break;
			}
			case 2: {
				if (!livros.isEmpty()) {
					imprimePilha();
				} else {
					System.out.println("\nA pilha está vazia.\n");
				}
				break;
			}
			case 3: {
				if (!livros.isEmpty()) {
					livros.pop();
					imprimePilha();
					System.out.println("\nO livro foi retirado da pilha.");
				} else {
					System.out.println("\nA pilha está vazia.\n");
				}
			}
			}
		} while (opcao != 0);

		System.out.println("\nO programa foi finalizado.");

		sc.close();
	}

	private static void imprimePilha() {
		System.out.println("\nPilha:\n");
		Iterator<String> iterator = livros.iterator();
		while (iterator.hasNext()) System.out.println(iterator.next());
	}

}
