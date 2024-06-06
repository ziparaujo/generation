package projeto.lacosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Lista03Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float numero, soma = 0, media;
		int qtdNumeros = 0;
		
		do {
			System.out.printf("Digite um número: ");
			numero = sc.nextFloat();
			
			if(numero != 0 && numero % 3 == 0) {
				qtdNumeros++;
				soma += numero;
			}
		} while (numero != 0);
		
		media = soma / qtdNumeros;
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", media);
		
		sc.close();
	}
}
