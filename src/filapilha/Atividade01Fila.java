package filapilha;

import java.util.*;

public class Atividade01Fila {
	private static Queue<String> clientes = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.printf("\nEntre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				System.out.printf("\nDigite o nome: ");
				String nome = sc.next();
				clientes.add(nome);

				imprimeFila();
				System.out.println("\nCliente adicionado.\n");
				break;
			}
			case 2: {
				if (!clientes.isEmpty()) {
					imprimeFila();
				} else {
					System.out.println("\nA fila está vazia.\n");
				}
				break;
			}
			case 3: {
				if (!clientes.isEmpty()) {
					clientes.remove();
					imprimeFila();
					System.out.println("\nO cliente foi chamado.");
				} else {
					System.out.println("\nA fila está vazia.\n");
				}
			}
			}
		} while (opcao != 0);

		System.out.println("\nO programa foi finalizado.");

		sc.close();
	}

	private static void imprimeFila() {
		System.out.println("\nFila:\n");
		Iterator<String> iterator = clientes.iterator();
		while (iterator.hasNext()) System.out.println(iterator.next());
	}

}
