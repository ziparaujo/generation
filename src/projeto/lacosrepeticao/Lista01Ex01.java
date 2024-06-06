package projeto.lacosrepeticao;

import java.util.Scanner;

public class Lista01Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.printf("\nDigite o primeiro número do intervalo: ");
		numero1 = sc.nextInt();
		System.out.printf("\nDigite o segundo número do intervalo: ");
		numero2 = sc.nextInt();
		
		if(numero1 < numero2) {
			for(int i = numero1; i < numero2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\n%d é múltiplo de 3 e de 5.", i);
				}
			}
		} else {			
			System.out.println("Intervalo inválido.");
		}
		
		sc.close();
	}
}
