package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista02Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> valores = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int numero;
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		
		if(valores.contains(numero)) {
			System.out.printf("\nO número %d foi encontrado!", numero);			
		} else {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}
		
		sc.close();
	}
}
