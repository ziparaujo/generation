package vetoresmatrizes;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Lista01Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numero, numeros[] = new int[10];
		int soma = 0;
		float media = 0;
		ArrayList<Integer> indicesImpares = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite um número: ");
			numero = sc.nextInt();
			
			numeros[i] = numero;
		}

		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			media = (float) soma / numeros.length;
			if(i % 2 != 0) indicesImpares.add(numeros[i]);
			
			if(numeros[i] % 2 == 0) pares.add(numeros[i]);
		}
		
		System.out.println("\nElementos dos índices ímpares: " + indicesImpares);
		System.out.println("Elementos pares: " + pares);
		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f", media);
		
		sc.close();
	}
}
