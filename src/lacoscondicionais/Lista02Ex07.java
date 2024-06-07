package lacoscondicionais;

import java.util.Scanner;

public class Lista02Ex07 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float numero1, numero2, operacao;
		int codigoOperacao;
		
		System.out.println("Digite o 1º número: ");
		numero1 = read.nextFloat();
		System.out.println("Digite o 2º número: ");
		numero2 = read.nextFloat();
		System.out.println("Operação: ");
		codigoOperacao = read.nextInt();
		
		switch (codigoOperacao) {
		case 1: {
			operacao = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + operacao);
			break;
		}
		case 2: {
			operacao = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + operacao);
			break;
		}
		case 3: {
			operacao = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + operacao);
			break;
		}
		case 4: {
			operacao = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + operacao);
			break;
		}
		default:
			System.out.println("Operação inválida.");
		}
		
		read.close();
	}
}
