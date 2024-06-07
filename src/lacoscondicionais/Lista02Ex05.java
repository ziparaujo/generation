package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Lista02Ex05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int codigo, quantidade;
		double total = 0.0;
		
		System.out.println("Código do produto: ");
		codigo = read.nextInt();
		System.out.println("Quantidade: ");
		quantidade = read.nextInt();
		
		switch (codigo) {
		case 1: {
			System.out.println("Produto: Cachorro-quente");
			total = quantidade * 10;
			break;
		}
		case 2: {
			System.out.println("Produto: X-Salada");
			total = quantidade * 15;
			break;
		}
		case 3: {
			System.out.println("Produto: X-Bacon");
			total = quantidade * 18;
			break;
		}
		case 4: {
			System.out.println("Produto: Bauru");
			total = quantidade * 12;
			break;
		}
		case 5: {
			System.out.println("Produto: Refrigerante");
			total = quantidade * 8;
			break;
		}
		case 6: {
			System.out.println("Produto: Suco de laranja");
			total = quantidade * 13;
			break;
		}
		default:
			System.out.println("Opção inválida.");
		}
		
		if(total > 0) System.out.printf("Valor total: R$ %.2f", total);
		
		read.close();
	}
}
