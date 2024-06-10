package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		int numero;
		
		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		
		if(numeros.contains(numero)) {
			System.out.printf("\nO número %d está localizado na posição: %d", numero, numeros.indexOf(numero));
		} else {
			System.out.printf("\nO número %d não foi encontrado.", numero);
		}
		
		sc.close();
	}
}
