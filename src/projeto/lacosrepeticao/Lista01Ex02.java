package projeto.lacosrepeticao;

import java.util.Scanner;

public class Lista01Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, totalPares = 0, totalImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			numero = sc.nextInt();			
			if(numero % 2 == 0) {
				totalPares += 1;
			} else {
				totalImpares += 1;
			}
		}
		
		System.out.printf("\nTotal de números pares: %d \nTotal de números ímpares: %d", totalPares, totalImpares);

		sc.close();
	}
}
