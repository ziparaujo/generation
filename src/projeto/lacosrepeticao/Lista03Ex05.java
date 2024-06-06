package projeto.lacosrepeticao;

import java.util.Scanner;

public class Lista03Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.printf("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero > 0) soma += numero;
		} while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);
		
		sc.close();
	}
}
