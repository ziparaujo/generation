package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista02Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();
		int numero;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite um número: ");
			numero = sc.nextInt();
			
			numeros.add(numero);
		}
		
		Iterator<Integer> iteratorNumeros = numeros.iterator();		
		
		System.out.println("\nListando dados do Set: ");
		while(iteratorNumeros.hasNext()) {
			System.out.println(iteratorNumeros.next());
		}
		
		sc.close();
	}
}
